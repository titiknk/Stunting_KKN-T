package com.titikhofifa.kknt_stunting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Pilihan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);

        Button button1 = findViewById(R.id.btn_ebook);

        button1.setOnClickListener(view -> openLandingActivity());

        Button button2 = findViewById(R.id.btn_kamusku);

        button2.setOnClickListener(view -> Kamusku());
    }

    private void openLandingActivity() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    private void Kamusku() {
        Intent intent = new Intent(this, Kamusku.class);
        startActivity(intent);
    }
}