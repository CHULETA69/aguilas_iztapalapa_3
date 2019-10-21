package com.example.prototipodee_sport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    EditText nombre,correo,contraseña,contraseña2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nombre = (EditText)findViewById(R.id.nombre);
        correo = (EditText)findViewById(R.id.correo);
        contraseña = (EditText)findViewById(R.id.contraseña);
        contraseña2= (EditText)findViewById(R.id.contraseña2);

    }


    public void regresar (View view){

        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);

    }

//------------------------------------

    public void acceder1 (View view){

            String valor1 =nombre.getText().toString();
            String valor2 =correo.getText().toString();
            String valor3 =contraseña.getText().toString();
            String valor4 =contraseña2.getText().toString();


//para acceder
            if(!valor1.isEmpty() && !valor2.isEmpty() && !valor3.isEmpty()  && !valor4.isEmpty()){
              if (valor3.equals(valor4))

              {
//al acceder

                  Toast.makeText(this, "registro correcto", Toast.LENGTH_LONG).show();


              }
              //en caso de que no rellenemos bien el formulario pasa esto

              else{
                  Toast.makeText(this, "las contraseñas no coinciden", Toast.LENGTH_LONG).show();
              }



            }else{
                if (valor1.isEmpty()){
                    nombre.setError("falta nombre");
                }

                if (valor2.isEmpty()){
                    correo.setError("falta correo");
                }

                if (valor3.isEmpty()){
                    contraseña.setError("falta contraseña");
                }

                if (valor4.isEmpty()){
                    contraseña2.setError("falta la verificacion de contraseña");
                }

                Toast.makeText(this, "error al registrar", Toast.LENGTH_LONG).show();
            }




}
    }