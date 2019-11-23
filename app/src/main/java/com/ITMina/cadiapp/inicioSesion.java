package com.ITMina.cadiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class inicioSesion extends AppCompatActivity {
    ImageView on,off;
    EditText contrasena,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        on = findViewById(R.id.visibilitylog);
        off = findViewById(R.id.novisibilitylog);
        correo = findViewById(R.id.editText4);
        contrasena = findViewById(R.id.editText5);

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
    public void inciarSesion (View view){
            if (correo.getText().toString().contains("@") && !correo.getText().toString().isEmpty() && !correo.getText().toString().contains(" ")){
                Intent intent = new Intent(getApplicationContext(), menu.class);
                startActivity(intent);
            }
            //NOTA: agregar metodo para verificar si la contraseña es correcta o no
            if (contrasena.getText().toString().isEmpty()){
                contrasena.setError("Contraseña incorrecta");
            }

            //NOTA: Las comprobaciones se pueden hacer en diferentes if para dar diferentes mensajes de error
            if( correo.getText().toString().isEmpty()|| !correo.getText().toString().contains("@") || correo.getText().toString().contains(" ")){
                correo.setError("Correo Invalido");
            }
    }
}
