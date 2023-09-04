package com.example.summerquest2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView answer;

    void scanDisplayElements() {
        button = findViewById(R.id.button);
        answer = findViewById(R.id.answer);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scanDisplayElements()
        buton.setOnClickListener((element) -> {
            answer.setText(R.string.ansver);
        });

    }
}