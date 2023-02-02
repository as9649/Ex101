package com.example.ex101;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btn6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn6=findViewById(R.id.btn6);

        btn6.setOnClickListener(view -> {
            finish();
        });
    }

}