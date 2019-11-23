package com.ITMina.cadiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class torsopierna extends AppCompatActivity {
    String dias [] = {"Lunes","Martes","Jueves","Viernes",};
    String ejercicio [] = {
            "Press de Banca (6x 4 Series) " +
            "\n Dominadas (8x 4 Series) " +
            "\n Press Militar (12x 4 Series) " +
            "\n Press con Mancuerda Inclinado (8x 3 Series)  " +
            "\n Remo con barra (8x 3 Series) " +
            "\n Extenciones para Triceps con Polea (10x 3 Series) " +
            "\n Curl con Mancuerda (10x 3 Series) "

            ,"Sentadillas (8x 4 Series) " +
            "\n Peso Muerto Rumano (8x 4 Series) " +
            "\n Hip Thrust (10x 4 Series) " +
            "\n LEG Curls (10x 3 Series) " +
            "\n LEG Extensions (10x 3 Series) " +
            "\n Elevaciones de Pantorilla (10x 4 Series)  "

            ,"Press de Banca Inclinado (6x 4 Series) " +
            "\n CHIN Ups (6x 3 Series) " +
            "\n Press Militar con Mancuerda (10x 4 Series) " +
            "\n Cruce con Poleas (10x 3 Series) " +
            "\n Remo Sentado con poleas (10x 3 Series) " +
            "\n Extencion de Codos sentado con Mancuerda (12x 3 Series) " +
            "\n CURL con barra (8x 3 Series)"

            ," Sentadillas Frontal (6x 4 Series) " +
            "\n Peso Muerto Normal (6x 4 Series) " +
            "\n HIP Thrust (10x 4 Series) " +
            "\n LEG Curls (10x 3 Series) " +
            "\n LEG Extenciones (10x 3 Series) " +
            "\n Elevaciones De Pantorilla (10x 4 Series)"};

    ImageView back, forward;
    TextView dia,ejercicios;
    int index =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torsopierna);
        dia=findViewById(R.id.diaTextView);
        back = findViewById(R.id.goback);
        forward = findViewById(R.id.nextexc);
        ejercicios = findViewById(R.id.EjercicioText);

        dia.setText(dias[index]);
        ejercicios.setText(ejercicio[index]);

        if (index==0){
            back.setVisibility(View.INVISIBLE);
        }

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setVisibility(View.VISIBLE);
                index++;
                dia.setText(dias[index]);
                ejercicios.setText(ejercicio[index]);
                if(index==3){
                    forward.setVisibility(View.INVISIBLE);

                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index--;
                if(forward.getVisibility()==View.INVISIBLE){
                    forward.setVisibility(View.VISIBLE);
                }
                if(index==0){
                    back.setVisibility(View.INVISIBLE);
                    dia.setText(dias[index]);
                    ejercicios.setText(ejercicio[index]);
                }else{
                    dia.setText(dias[index]);
                    ejercicios.setText(ejercicio[index]);
                }
            }
        });
    }
}
