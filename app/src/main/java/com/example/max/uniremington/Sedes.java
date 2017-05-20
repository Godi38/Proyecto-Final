package com.example.max.uniremington;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sedes extends AppCompatActivity {

    Button Medellin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedes);

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
