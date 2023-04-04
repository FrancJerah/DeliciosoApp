package com.example.deliciosoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Burger_SixActivity extends AppCompatActivity {
    Button cancelButton, buyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_six);

        cancelButton = findViewById(R.id.cancelButton);
        buyButton = findViewById(R.id.buyButton);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Burger_SixActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // for buyButton, no function yet, goes back to MainActivity instead
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Burger_SixActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}