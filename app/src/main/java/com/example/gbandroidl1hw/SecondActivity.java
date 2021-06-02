package com.example.gbandroidl1hw;


import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    Button button2;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.second_screen);
        button2 = findViewById(R.id.button_back_to_1);
        button2.setOnClickListener(v -> {
            startActivity(new Intent(SecondActivity.this,MainActivity.class));
        });
    }
}
