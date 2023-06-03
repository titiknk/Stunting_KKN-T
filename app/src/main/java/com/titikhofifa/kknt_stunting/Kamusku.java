package com.titikhofifa.kknt_stunting;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class Kamusku extends AppCompatActivity {
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamusku);
        getSupportActionBar().setTitle("Kamus Nutrisi");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CardView cardview1 = findViewById(R.id.card1);
        CardView cardview2 = findViewById(R.id.card2);
        CardView cardview3 = findViewById(R.id.card3);
        CardView cardview4 = findViewById(R.id.card4);
        CardView cardview5 = findViewById(R.id.card5);
        CardView cardview6 = findViewById(R.id.card6);
        CardView cardview7 = findViewById(R.id.card7);
        CardView cardview8 = findViewById(R.id.card8);
        CardView cardview9 = findViewById(R.id.card9);
        CardView cardview10 = findViewById(R.id.card10);
        CardView cardview11 = findViewById(R.id.card11);
        CardView cardview12 = findViewById(R.id.card12);
        CardView cardview13 = findViewById(R.id.card13);

        cardview1.setOnClickListener(view -> Fitur1());

        cardview2.setOnClickListener(view -> Fitur2());

        cardview3.setOnClickListener(view -> Fitur3());

        cardview4.setOnClickListener(view -> Fitur4());

        cardview5.setOnClickListener(view -> Fitur5());

        cardview6.setOnClickListener(view -> Fitur6());

        cardview7.setOnClickListener(view -> Fitur7());

        cardview8.setOnClickListener(view -> Fitur8());

        cardview9.setOnClickListener(view -> Fitur9());

        cardview10.setOnClickListener(view -> Fitur10());

        cardview11.setOnClickListener(view -> Fitur11());

        cardview12.setOnClickListener(view -> Fitur12());

        cardview13.setOnClickListener(view -> Fitur13());
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

    private void Fitur1() {
        Intent intent = new Intent(this, Protein.class);
        startActivity(intent);
    }

    private void Fitur2() {
        Intent intent = new Intent(this, Karbohidrat.class);
        startActivity(intent);
    }

    private void Fitur3() {
        Intent intent = new Intent(this, Lemak.class);
        startActivity(intent);
    }

    private void Fitur4() {
        Intent intent = new Intent(this, Serat.class);
        startActivity(intent);
    }

    private void Fitur5() {
        Intent intent = new Intent(this, ZatBesi.class);
        startActivity(intent);
    }

    private void Fitur6() {
        Intent intent = new Intent(this, AsamFolat.class);
        startActivity(intent);
    }

    private void Fitur7() {
        Intent intent = new Intent(this, Kalsium.class);
        startActivity(intent);
    }

    private void Fitur8() {
        Intent intent = new Intent(this, VitaminD.class);
        startActivity(intent);
    }

    private void Fitur9() {
        Intent intent = new Intent(this, Kolin.class);
        startActivity(intent);
    }

    private void Fitur10() {
        Intent intent = new Intent(this, VitaminC.class);
        startActivity(intent);
    }

    private void Fitur11() {
        Intent intent = new Intent(this, Yodium.class);
        startActivity(intent);
    }

    private void Fitur12() {
        Intent intent = new Intent(this, Seng.class);
        startActivity(intent);
    }

    private void Fitur13() {
        Intent intent = new Intent(this, AsamLemakOmega.class);
        startActivity(intent);
    }

}