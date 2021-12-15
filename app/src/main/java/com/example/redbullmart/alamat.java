package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alamat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alamat);
    }

    public void back(View view) {
        startActivity(new Intent(this, home.class));
        finish();
    }
    public void tambahalamat(View view) {
        startActivity(new Intent(this, map1.class));
        finish();
    }
    public void pilih(View view) {
        startActivity(new Intent(this, pilihminimarket2.class));
        finish();
    }
}