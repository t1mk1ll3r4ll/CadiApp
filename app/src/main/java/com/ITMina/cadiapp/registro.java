package com.ITMina.cadiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class registro extends AppCompatActivity {
    ImageView on,off;
    EditText nombre, correo,contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        on = findViewById(R.id.visibility);
        off = findViewById(R.id.novisibility);
        nombre = findViewById(R.id.editText);
        correo = findViewById(R.id.editText2);
        contrasena = findViewById(R.id.editText3);

        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contrasena.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                on.setVisibility(View.INVISIBLE);
                off.setVisibility(View.VISIBLE);
                contrasena.setSelection(contrasena.length());
            }
        });
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contrasena.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                on.setVisibility(View.VISIBLE);
                off.setVisibility(View.INVISIBLE);
                contrasena.setSelection(contrasena.length());
            }
        });
    }
    public void registrar(View view){
        if (correo.getText().toString().contains("@") && !correo.getText().toString().isEmpty() && !correo.getText().toString().contains(" ")  && !nombre.getText().toString().isEmpty() && !contrasena.getText().toString().isEmpty()){

            Intent intent = new Intent(getApplicationContext(), inicioSesion.class);
            startActivity(intent);
        }else if(nombre.getText().toString().isEmpty()){
            nombre.setError("Ingrese su nombre");
        }
        else if(correo.getText().toString().isEmpty()) {
            correo.setError("ingrese un correo");
        }
        else if (!correo.getText().toString().contains("@")){
            correo.setError("Correo Invalido");
        }

        else if(contrasena.getText().toString().isEmpty()) {

            contrasena.setError("Ingrese una contraseña");
        }
    }
}
