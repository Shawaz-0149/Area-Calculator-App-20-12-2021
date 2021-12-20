package com.example.areacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button C,S,Rec,T;
        S=findViewById(R.id.Sqaure);
        Rec=findViewById(R.id.Rectangle);
        T=findViewById(R.id.Triangle);
        C=findViewById(R.id.Circle);
        S.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Square.class);
            startActivity(intent);
        });
        Rec.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Rectangle.class);
            startActivity(intent);
        });
        T.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Triangle.class);
            startActivity(intent);
        });
        C.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Circle.class);
            startActivity(intent);
        });
    }
}