package com.titikhofifa.kknt_stunting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class AsamFolat extends AppCompatActivity {
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asam_folat);
        getSupportActionBar().setTitle("Asam Folat");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView cardview1 = findViewById(R.id.card1);
        CardView cardview2 = findViewById(R.id.card2);
        CardView cardview3 = findViewById(R.id.card3);
        CardView cardview4 = findViewById(R.id.card4);

        cardview1.setOnClickListener(view -> Fitur1());

        cardview2.setOnClickListener(view -> Fitur2());

        cardview3.setOnClickListener(view -> Fitur3());

        cardview4.setOnClickListener(view -> Fitur4());

    }

    private void Fitur1() {
        Intent intent = new Intent(this, Bayam.class);
        startActivity(intent);
    }

    private void Fitur2() {
        Intent intent = new Intent(this, Telur.class);
        startActivity(intent);
    }

    private void Fitur3() {
        Intent intent = new Intent(this, Brokoli.class);
        startActivity(intent);
    }

    private void Fitur4() {
        Intent intent = new Intent(this, Asparagus.class);
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