package com.titikhofifa.kknt_stunting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Fitur2 extends AppCompatActivity {
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitur2);
        getSupportActionBar().setTitle("Faktor Penyebab");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button buttonX = findViewById(R.id.btnFaktorIn);
        Button buttonY = findViewById(R.id.btnFaktorEks);

        buttonX.setOnClickListener(view -> openFaktorInternal());

        buttonY.setOnClickListener(view -> openFaktorEksternal());
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }

    private void openFaktorEksternal() {
        Intent intent = new Intent(this, FaktorEksternal.class);
        startActivity(intent);
    }

    private void openFaktorInternal() {
        Intent intent = new Intent(this, FaktorInternal.class);
        startActivity(intent);
    }
}