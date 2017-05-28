package com.example.max.uniremington;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Plataformas extends AppCompatActivity {

    Button Moodle;
    Button Q10;
    Button Correo;
    ImageView btnatras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plataformas);

        btnatras = (ImageView) findViewById(R.id.btnatras);
        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        Correo = (Button)findViewById(R.id.btncorreo);
        Correo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcorreo = new Intent (Plataformas.this, Correo.class);
                startActivity(intcorreo);
            }
        });


        Moodle = (Button)findViewById(R.id.btnmoodle);
        Moodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmoodle = new Intent(Plataformas.this, Moodle.class);
                startActivity(intmoodle);
            }
        });


        Q10 = (Button)findViewById(R.id.btnq10);
        Q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intq10 = new Intent(Plataformas.this, Q10.class);
                startActivity(intq10);
            }
        });

    }
}
