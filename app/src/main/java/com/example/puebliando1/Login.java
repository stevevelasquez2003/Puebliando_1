package com.example.puebliando1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {
//atributos de la clase
    EditText cajaNombreUsuario;
    EditText cajaContrasena;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario= findViewById(R.id.usuario);
        cajaContrasena= findViewById(R.id.contraseña);

        //capturando dato de las cajas
        String nombreUsuario=cajaNombreUsuario.getText().toString();
        String passwordUsuario=cajaContrasena.getText().toString();
    }
}