package com.ITMina.cadiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class plan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
    }

    public void meriendadormir(View view) {
        Intent intent = new Intent (getApplicationContext(), meriendadormir.class);
        startActivity(intent);
    }

    public void cena(View view) {
        Intent intent = new Intent (getApplicationContext(), cena.class);
        startActivity(intent);
    }

    public void meriendatarde(View view) {
        Intent intent = new Intent (getApplicationContext(), meriendatarde.class);
        startActivity(intent);
    }

    public void comida(View view) {
        Intent intent = new Intent (getApplicationContext(), comida.class);
        startActivity(intent);
    }

    public void meriendamanana(View view) {
        Intent intent = new Intent (getApplicationContext(), meriendamanana.class);
        startActivity(intent);
    }

    public void desayuno(View view) {
        Intent intent = new Intent (getApplicationContext(), desayuno.class);
        startActivity(intent);
    }
}
