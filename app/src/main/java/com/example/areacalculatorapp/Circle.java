package com.example.areacalculatorapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Circle extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        Button area, clear;
        EditText raduis;
        TextView answer;
        area = findViewById(R.id.Area);
        clear = findViewById(R.id.Clear);
        raduis = findViewById(R.id.Raduis);
        answer = findViewById(R.id.Answer);
        clear.setOnClickListener(v -> {
            raduis.setText("");
            answer.setText("");
            Toast.makeText(Circle.this, "Cleared Values", Toast.LENGTH_SHORT).show();
        });
        area.setOnClickListener(v -> {
            if ((raduis.getText().toString().isEmpty())) {
                answer.setText("Please Enter Radius!!!");
                Toast.makeText(Circle.this, "Please Enter Values!!!", Toast.LENGTH_SHORT).show();
            } else {
                double r = Double.parseDouble(raduis.getText().toString());
                double ans = (22.0 / 7.0) * (r * r);
                answer.setText("Area >>>  "+ans);
                Toast.makeText(Circle.this, "Area >>>  "+ans, Toast.LENGTH_SHORT).show();

            }
        });
    }
}