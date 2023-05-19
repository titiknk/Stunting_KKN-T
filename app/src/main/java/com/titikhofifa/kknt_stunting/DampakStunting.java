package com.titikhofifa.kknt_stunting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class DampakStunting extends AppCompatActivity {
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dampak_stunting);
        getSupportActionBar().setTitle("Dampak Stunting");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button buttonX = findViewById(R.id.btn_dampakpendek);
        Button buttonY = findViewById(R.id.btn_dampakpanjang);

        buttonX.setOnClickListener(view -> DampakJangkaPendek());

        buttonY.setOnClickListener(view -> DampakJangkaPanjang());
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

    private void DampakJangkaPanjang() {
        Intent intent = new Intent(this, DampakJangkaPanjang.class);
        startActivity(intent);
    }

    private void DampakJangkaPendek() {
        Intent intent = new Intent(this, DampakJangkaPendek.class);
        startActivity(intent);
    }
}