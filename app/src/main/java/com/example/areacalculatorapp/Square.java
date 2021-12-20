package com.example.areacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Square extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        Button area,clear;
        EditText length;
        TextView answer;
        area=findViewById(R.id.Area);
        clear=findViewById(R.id.Clear);
        length=findViewById(R.id.Length);
        answer=findViewById(R.id.Answer);
        clear.setOnClickListener(v -> {
            length.setText("");
            answer.setText("");
            Toast.makeText(Square.this, "Cleared Values", Toast.LENGTH_SHORT).show();
        });
        area.setOnClickListener(v -> {
            if((length.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter Length!!!");
                Toast.makeText(Square.this, "Please Enter Values!!!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                double l = Double.parseDouble(length.getText().toString());
                double ans=l*l;
                answer.setText("Area >>>  "+ans);
                Toast.makeText(Square.this, "Area >>>  "+ans, Toast.LENGTH_SHORT).show();
            }

        });
    }
}