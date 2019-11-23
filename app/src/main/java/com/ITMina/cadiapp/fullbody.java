package com.ITMina.cadiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class fullbody extends AppCompatActivity {
    TextView dia,ejercicios;
    ImageView next, back;
    int index=0;
    String dias[]={"Lunes","Miercoles","Viernes"};
    String ejercicio[]={"Sentadillas (2x15)\n" +
            "Sentadillas (3 x 12-10-8)\n" +
            "Remo con barra (3 x 12-10-8)\n" +
            "Press militar con barra (3 x 12-10-8)\n" +
            "Press de banca con barra (3 x 12-10-8)\n" +
            "Curl con barra (3 x 12-10-8)\n" +
            "Press francés (3 x 12-10-8)\n" +
            "Elevación de piernas (3 x 25-22-20)\n" +
            "Encogimiento (3 x 25-22-20)\n"

            ,"Sentadillas (2x15)\n" +
            "Sentadillas (4 x 12-10-8-8)\n" +
            "Remo a una mano (3 x 12-10-8)\n" +
            "Press militar con mancuerna (3 x 12-10-8)\n" +
            "Press de banca con mancuerna (3 x 12-10-8)\n" +
            "Curl alterno con mancuerna (3 x 12-10-8)\n" +
            "Press francés (3 x 12-10-8)\n" +
            "Elevación de talones (3 x 25-22-20)\n"

            ,"Sentadillas (2x15)\n" +
            "Sentadillas (3 x 12-10-8)\n" +
            "Peso muerto (3 x 12-10-8)\n" +
            "Press militar con barra (3 x 12-10-8)\n" +
            "Press de banca inclinado con barra (3 x 12-10-8)\n" +
            "Curl con barra (3 x 12-10-8)\n" +
            "Extensión de tríceps polea alta (3 x 12-10-8)\n" +
            "Elevación de talones (3 x 25-22-20)\n" +
            "Encogimientos (3 x 25-22-20)\n"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullbody);

        dia = findViewById(R.id.diafull);
        ejercicios = findViewById(R.id.fullbodyex);
        next = findViewById(R.id.imageView11);
        back = findViewById(R.id.imageView10);

        dia.setText(dias[index]);
        ejercicios.setText(ejercicio[index]);

        if (index==0){
            back.setVisibility(View.INVISIBLE);
        }

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setVisibility(View.VISIBLE);
                index++;
                dia.setText(dias[index]);
                ejercicios.setText(ejercicio[index]);
                if(index==2){
                    next.setVisibility(View.INVISIBLE);

                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index--;
                if(next.getVisibility()==View.INVISIBLE){
                    next.setVisibility(View.VISIBLE);
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
