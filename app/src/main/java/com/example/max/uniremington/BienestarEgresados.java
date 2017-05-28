package com.example.max.uniremington;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BienestarEgresados extends AppCompatActivity {

    Button Convenios;
    Button Internacionalizacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienestar_egresados);

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
