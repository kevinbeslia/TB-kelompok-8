package com.example.redbullmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;


import com.example.redbullmart.adapter.BarangAdapter;
import com.example.redbullmart.model.Barang;

import java.util.ArrayList;

public class pilihbarang extends AppCompatActivity {

    RecyclerView rvBarang;
    BarangAdapter barangAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilihbarang);

        barangAdapter = new BarangAdapter();
        barangAdapter.setListBarang(generateData());

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        rvBarang = findViewById(R.id.rvBarang);
        rvBarang.setAdapter(barangAdapter);
        rvBarang.setLayoutManager(layoutManager);
    }


    public void back(View view) {
        startActivity(new Intent(this, pilihminimarket.class));
        finish();
    }
    public void bayar(View view) {
        startActivity(new Intent(this, faktur.class));
        finish();
    }

    public ArrayList<Barang> generateData(){
        ArrayList<Barang> listBarang = new ArrayList<>();
        listBarang.add(new Barang("Barang 1", "Rp10.000"));
        listBarang.add(new Barang("Barang 2", "Rp10.000"));
        listBarang.add(new Barang("Barang 3", "Rp10.000"));
        listBarang.add(new Barang("Barang 4", "Rp10.000"));
        listBarang.add(new Barang("Barang 5", "Rp10.000"));
        listBarang.add(new Barang("Barang 6", "Rp10.000"));

        return listBarang;
    }
}