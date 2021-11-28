package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void favoritorder(View view) {
        startActivity(new Intent(this, favoritorder.class));
        finish();
    }

    public void poin(View view) {
        startActivity(new Intent(this, poin.class));
        finish();
    }
    public void voucher(View view) {
        startActivity(new Intent(this, voucher.class));
        finish();
    }

    public void profil(View view) {
        startActivity(new Intent(this, profil.class));
        finish();
    }

    public void inbox(View view) {
        startActivity(new Intent(this, inbox.class));
        finish();
    }
    public void delivery (View view) {
        startActivity(new Intent(this, alamat.class));
        finish();
    }
    public void takeaway(View view) {
        startActivity(new Intent(this, pilihminimarket.class));
        finish();
    }
    public void statusorder(View view) {
        startActivity(new Intent(this, statusorder.class));
        finish();
    }

}