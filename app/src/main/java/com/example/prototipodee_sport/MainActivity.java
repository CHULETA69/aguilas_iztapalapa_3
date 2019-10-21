package com.example.prototipodee_sport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void iniciar (View view){

        Intent iniciar = new Intent(this, Inicia.class);
        startActivity(iniciar);
        Toast.makeText(this, "Inicia sesion por favor", Toast.LENGTH_LONG).show();


    }
    public void registro (View view){

        Intent registro = new Intent(this, Registro.class);
        startActivity(registro);
        Toast.makeText(this, "Por favor registrate para crearte una cuenta aguilas iztapalpa III", Toast.LENGTH_LONG).show();


    }




}
