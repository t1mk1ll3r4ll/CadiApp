package com.ITMina.cadiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class weider extends AppCompatActivity {
    TextView dia,ejercicios;
    ImageView next, back;
    int index=0;

    String dias[]={"Día 1: Pectorales","Día 2: Espalda","Día 3: Hombros","Día 4: Piernas","Día 5: Brazos"};
    String ejercicio[]={"Press de banca, 4 series, 6 repeticiones" +
            "\n Press inclinado, 4 series, 8-10 repeticiones" +
            "\n Fondos en paralelas y aberturas con mancuernas, 4 series, 10 ejercicios"

            ," Peso muerto, 4 series, 6 repeticiones" +
            "\n Dominadas, 4 series, 8-10 repeticiones" +
            "\n Jalones de espalda en polea, 4 series, 20 repeticiones"

            ,"Press militar, 4 series, 6 repeticiones" +
            "\n Elevaciones laterales, 4 series, 8-10 repeticiones" +
            "\n Elevaciones frontales y elevaciones posteriores, 3 series, 10 repeticiones"

            ,"Sentadillas, 4 series, 6 repeticiones" +
            "\n Curl femoral, 4 series, 12 repeticiones"

            ," Curl en barra, 3 series, 6 repeticiones\n" +
            " Curl con mancuerna, 3 series, 8-10 repeticiones\n" +
            " Extensiones de tríceps en polea, 3 series, 10-12 repeticiones\n"

            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weider);
        dia = findViewById(R.id.diaWeider);
        ejercicios = findViewById(R.id.ejerciciosTextView);
        next = findViewById(R.id.imageView9);
        back = findViewById(R.id.imageView7);

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
                if(index==4){
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
                if(index==4){
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
