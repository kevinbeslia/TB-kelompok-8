package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
    }
    public void back(View view) {
        startActivity(new Intent(this, alamat.class));
        finish();
    }
    public void mulaipesanan(View view) {
        startActivity(new Intent(this, pilihminimarket2.class));
        finish();
    }
    public void search(View view) {
        startActivity(new Intent(this, searchmap.class));
        finish();
    }
}