package com.example.areacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rectangle extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        Button area,clear;
        EditText length;
        EditText width;
        TextView answer;
        area=findViewById(R.id.Area);
        clear=findViewById(R.id.Clear);
        width=findViewById(R.id.Width);
        answer=findViewById(R.id.Answer);
        length=findViewById(R.id.Length);
        clear.setOnClickListener(v -> {
            length.setText("");
            width.setText("");
            answer.setText("");
            Toast.makeText(Rectangle.this, "Cleared Values", Toast.LENGTH_SHORT).show();
        });
        area.setOnClickListener(v -> {
            if((length.getText().toString().isEmpty())||(width.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter Values!!!");
                Toast.makeText(Rectangle.this, "Please Enter Values!!!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                double l = Double.parseDouble(length.getText().toString());
                double h = Double.parseDouble(width.getText().toString());
                double ans=l*h;
                answer.setText("Area >>>  "+ans);
                Toast.makeText(Rectangle.this, "Area >>>  "+ans, Toast.LENGTH_SHORT).show();
            }

        });
    }
}