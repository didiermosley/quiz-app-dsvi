package com.example.proyectoii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class resultados extends AppCompatActivity {
    Button home;
    TextView puntos, estado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);
        home = findViewById(R.id.btnToPrincipal);
        puntos = findViewById(R.id.pts);
        estado = findViewById(R.id.status);


        Intent inte =getIntent();
        String res =inte.getStringExtra("puntaje");
        puntos.setText(res);

        if(Integer.parseInt(puntos.getText().toString()) > 7){
            estado.setText("APROBADO");
        }else{
            estado.setText("REPROBADO");
        }

        home.setOnClickListener(view -> {
            //finish();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}