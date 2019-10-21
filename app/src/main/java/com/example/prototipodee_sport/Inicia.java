package com.example.prototipodee_sport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Inicia extends AppCompatActivity {

    EditText correo2,contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicia);

        correo2 = (EditText)findViewById(R.id.correo2);
        contraseña = (EditText)findViewById(R.id.contraseña);

    }
    public void regresar (View view){

        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);


    }





//------------------------------------

    public void acceder1 (View view){


        String valor1 =correo2.getText().toString();
        String valor2 =contraseña.getText().toString();


//para acceder
        if(!valor1.isEmpty() && !valor2.isEmpty() ){




            Toast.makeText(this, "exito al iniciar sesion", Toast.LENGTH_LONG).show();

        }else{
            if (valor1.isEmpty()){
                correo2.setError("falta nombre");
            }

            if (valor2.isEmpty()){
                contraseña.setError("falta correo");
            }


            Toast.makeText(this, "error al  iniciar sesion", Toast.LENGTH_LONG).show();
        }




    }
    }