package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pilihbarang2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihbarang);
    }

    public void back(View view) {
        startActivity(new Intent(this, pilihminimarket.class));
        finish();
    }
    public void bayar(View view) {
        startActivity(new Intent(this, faktur.class));
        finish();
    }
}