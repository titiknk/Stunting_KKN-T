package com.titikhofifa.kknt_stunting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class Karbohidrat extends AppCompatActivity {
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karbohidrat);
        getSupportActionBar().setTitle("Karbohidrat");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView cardview1 = findViewById(R.id.card1);
        CardView cardview2 = findViewById(R.id.card2);
        CardView cardview3 = findViewById(R.id.card3);
        CardView cardview4 = findViewById(R.id.card4);
        CardView cardview5 = findViewById(R.id.card5);

        cardview1.setOnClickListener(view -> Fitur1());

        cardview2.setOnClickListener(view -> Fitur2());

        cardview3.setOnClickListener(view -> Fitur3());

        cardview4.setOnClickListener(view -> Fitur4());

        cardview5.setOnClickListener(view -> Fitur5());
    }

    private void Fitur1() {
        Intent intent = new Intent(this, Beras.class);
        startActivity(intent);
    }

    private void Fitur2() {
        Intent intent = new Intent(this, Jagung.class);
        startActivity(intent);
    }

    private void Fitur3() {
        Intent intent = new Intent(this, Kentang.class);
        startActivity(intent);
    }

    private void Fitur4() {
        Intent intent = new Intent(this, Gandum.class);
        startActivity(intent);
    }

    private void Fitur5() {
        Intent intent = new Intent(this, SayuranKacang.class);
        startActivity(intent);
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
}