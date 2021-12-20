package com.example.areacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Triangle extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        Button area,clear;
        EditText base;
        EditText height;
        TextView answer;
        area=findViewById(R.id.Area);
        clear=findViewById(R.id.Clear);
        base=findViewById(R.id.Base);
        answer=findViewById(R.id.Answer);
        height=findViewById(R.id.Heigth);
        clear.setOnClickListener(v -> {
            base.setText("");
            height.setText("");
            answer.setText("");
            Toast.makeText(Triangle.this, "Cleared Values", Toast.LENGTH_SHORT).show();
        });
        area.setOnClickListener(v -> {
            if((base.getText().toString().isEmpty())||(height.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter Values!!!");
                Toast.makeText(Triangle.this, "Please Enter Values!!!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                double b = Double.parseDouble(base.getText().toString());
                double h = Double.parseDouble(height.getText().toString());
                double ans=0.5*(b*h);
                answer.setText("Area >>>  "+ans);
                Toast.makeText(Triangle.this, "Area >>>  "+ans, Toast.LENGTH_SHORT).show();
            }

        });
    }
}