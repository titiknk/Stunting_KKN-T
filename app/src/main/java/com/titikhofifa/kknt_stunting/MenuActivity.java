package com.titikhofifa.kknt_stunting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setTitle("Menu Home");

        CardView cardview1 = findViewById(R.id.card1);
        CardView cardview2 = findViewById(R.id.card2);
        CardView cardview3 = findViewById(R.id.card3);
        CardView cardview4 = findViewById(R.id.card4);
        CardView cardview5 = findViewById(R.id.card5);
        CardView cardview6 = findViewById(R.id.card6);
        CardView cardview7 = findViewById(R.id.card7);
        CardView cardview8 = findViewById(R.id.card8);
        CardView cardview9 = findViewById(R.id.card9);

        cardview1.setOnClickListener(view -> Fitur1());

        cardview2.setOnClickListener(view -> Fitur2());

        cardview3.setOnClickListener(view -> Fitur3());

        cardview4.setOnClickListener(view -> Fitur4());

        cardview5.setOnClickListener(view -> Fitur5());

        cardview6.setOnClickListener(view -> Fitur6());

        cardview7.setOnClickListener(view -> Fitur7());

        cardview8.setOnClickListener(view -> Fitur8());

        cardview9.setOnClickListener(view -> Fitur9());

    }

    private void Fitur1() {
        Intent intent = new Intent(this, Fitur1.class);
        startActivity(intent);
    }

    private void Fitur2() {
        Intent intent = new Intent(this, Fitur2.class);
        startActivity(intent);
    }

    private void Fitur3() {
        Intent intent = new Intent(this, Fitur3.class);
        startActivity(intent);
    }

    private void Fitur4() {
        Intent intent = new Intent(this, Fitur4.class);
        startActivity(intent);
    }

    private void Fitur5() {
        Intent intent = new Intent(this, Fitur5.class);
        startActivity(intent);
    }

    private void Fitur6() {
        Intent intent = new Intent(this, Fitur6.class);
        startActivity(intent);
    }

    private void Fitur7() {
        Intent intent = new Intent(this, Fitur7.class);
        startActivity(intent);
    }

    private void Fitur8() {
        Intent intent = new Intent(this, Fitur8.class);
        startActivity(intent);
    }

    private void Fitur9() {
        Intent intent = new Intent(this, Fitur9.class);
        startActivity(intent);
    }
}