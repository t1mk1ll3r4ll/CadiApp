package com.ITMina.cadiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void ejercicios (View view) {
        Intent intent = new Intent(getApplicationContext(), ejercicios.class);
        startActivity(intent);
    }
    public void planAlimentacion (View view){
        Intent intent = new Intent (getApplicationContext(), plan.class);
        startActivity(intent);
    }
}
