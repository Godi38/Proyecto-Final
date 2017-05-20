package com.example.max.uniremington;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText room, pass;
    private Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        room = (EditText)findViewById(R.id.room);
        pass = (EditText)findViewById(R.id.pass);

        ingresar =(Button)findViewById(R.id.btnLogin);
        ingresar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                String usuario = room.getText().toString();
                String contraseña = pass.getText().toString();

                switch (v.getId()){
                case R.id.btnLogin:
                    if (usuario.equals("Max")&&contraseña.equals("123456")){
                        //Toast.makeText(this, "Datos correctos", Toast.LENGTH_SHORT).show();

                        Intent ingresar = new Intent(MainActivity.this, Home.class);
                        startActivity(ingresar);

                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_SHORT).show();
                    }

            }
        };
    });
    }
}