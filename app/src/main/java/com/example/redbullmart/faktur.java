package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class faktur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faktur);
    }

    public void back(View view) {
        startActivity(new Intent(this, pilihbarang.class));
        finish();
    }
    public void metodebayar(View view) {
        startActivity(new Intent(this, metodepembayaran.class));
        finish();
    }
    public void bayar(View view) {
        startActivity(new Intent(this, pembayaransukses.class));
        finish();
    }
}