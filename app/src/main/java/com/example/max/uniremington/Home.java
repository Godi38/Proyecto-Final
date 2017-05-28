package com.example.max.uniremington;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView imageView11;
    Button Sedes;
    Button Ubicacion;
    Button Comunidad;
    Button Programas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Programas = (Button)findViewById(R.id.btnprogramas);
        Programas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intprogramas = new Intent(Home.this, Programas.class);
                startActivity(intprogramas);
            }
        });


        Comunidad = (Button)findViewById(R.id.btncomunidad);
        Comunidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcomunidad = new Intent(Home.this, Comunidad.class);
                startActivity(intcomunidad);

            }
        });


        Ubicacion = (Button)findViewById(R.id.btnubicacion);
        Ubicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intubicacion = new Intent(Home.this, Maps_Centro.class);
                startActivity(intubicacion);
            }
        });

        Sedes = (Button) findViewById(R.id.btnsedes);
        Sedes.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intentsedes = new Intent(Home.this, Sedes.class);
                                            startActivity(intentsedes);

                                        }
                                    });


        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView11.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);


            }
        }));

    }
}
