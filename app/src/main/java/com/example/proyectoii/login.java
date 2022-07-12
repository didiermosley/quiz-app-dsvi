package com.example.proyectoii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText user, pass;
    Button btnL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        user = findViewById(R.id.input);
        pass = findViewById(R.id.pass);
        btnL = findViewById(R.id.btnLogin);

        btnL.setOnClickListener(view -> {
            if(user.getText().toString().equals("mosjeira") && pass.getText().toString().equals("12345")){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }else{
                Toast.makeText(login.this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}