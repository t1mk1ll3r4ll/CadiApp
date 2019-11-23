package com.ITMina.cadiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ejercicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicios);
    }
    public void weider (View view){
        Intent intent = new Intent(getApplicationContext(), weider.class);
        startActivity(intent);
    }
    public void torsoPierna (View view){

        Intent intent = new Intent(getApplicationContext(), torsopierna.class);
        startActivity(intent);
    }
    public void fullBody (View view){

        Intent intent = new Intent(getApplicationContext(), fullbody.class);
        startActivity(intent);
    }
}
