package com.example.max.uniremington;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sedes extends AppCompatActivity {

    Button Medellin;
    Button Cucuta;
    Button Bucaramanga;
    Button Manizales;
    Button Monteria;
    ImageView btnatras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes);

        btnatras = (ImageView) findViewById(R.id.btnatras);
        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        Monteria = (Button)findViewById(R.id.btnmonteria);
        Monteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmonteria = new Intent(Sedes.this, Monteria.class);
                startActivity(intmonteria);
            }
        });

        Manizales = (Button)findViewById(R.id.btnmanizales);
        Manizales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmanizales = new Intent(Sedes.this, Manizales.class);
                startActivity(intmanizales);
            }
        });



        Bucaramanga = (Button)findViewById(R.id.btnbucaramanga);
        Bucaramanga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intbucaramanga = new Intent(Sedes.this, Bucaramanga.class);
                startActivity(intbucaramanga);
            }
        });

        Cucuta =(Button)findViewById(R.id.btncucuta);
        Cucuta.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          Intent intcucuta = new Intent(Sedes.this, Cucuta.class);
                                          startActivity(intcucuta);
                                      }
                                  });

        Medellin =(Button)findViewById(R.id.btnmedellin);
        Medellin.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intmedellin = new Intent(Sedes.this, Medellin.class);
                startActivity(intmedellin);
            }

            });
        }
}
