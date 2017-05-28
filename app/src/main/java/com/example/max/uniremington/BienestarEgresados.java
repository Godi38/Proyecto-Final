package com.example.max.uniremington;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BienestarEgresados extends AppCompatActivity {

    Button Convenios;
    Button Internacionalizacion;
    ImageView btnatras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienestar_egresados);

        btnatras = (ImageView) findViewById(R.id.btnatras);
        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        Internacionalizacion = (Button)findViewById(R.id.btninternacionalizacion);
        Internacionalizacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intinternacionalizacion = new Intent(BienestarEgresados.this, Internacionalizacion.class);
                startActivity(intinternacionalizacion);
            }
        });

        Convenios = (Button)findViewById(R.id.btnconvenios);
        Convenios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intconvenios = new Intent(BienestarEgresados.this, Convenios.class);
                startActivity(intconvenios);
            }
        });
    }
}
