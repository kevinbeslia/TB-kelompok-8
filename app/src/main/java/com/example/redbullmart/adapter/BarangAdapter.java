package com.example.redbullmart.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.redbullmart.R;
import com.example.redbullmart.model.Barang;

import java.util.ArrayList;

public class BarangAdapter  extends RecyclerView.Adapter<BarangAdapter.BarangViewHolder>{
    public class BarangViewHolder extends RecyclerView.ViewHolder {
        TextView textBarang, textHarga;
        public BarangViewHolder(@NonNull View itemView) {
            super(itemView);
            textBarang = itemView.findViewById(R.id.textBarang);
            textHarga = itemView.findViewById(R.id.textHarga);
        }
    }

    ArrayList<Barang> listBarang = new ArrayList<>();

    public void setListBarang(ArrayList<Barang> listBarang) {
        this.listBarang = listBarang;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BarangAdapter.BarangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_barang, parent, false);
        BarangViewHolder viewHolder = new BarangViewHolder(view);
//        LayoutInflater inflater = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.text_row_item, viewGroup, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BarangAdapter.BarangViewHolder viewHolder, int position) {
        Barang barang = listBarang.get(position);
        viewHolder.textBarang.setText(barang.barang);
        viewHolder.textHarga.setText(barang.harga);
    }

    @Override
    public int getItemCount() {
        return listBarang.size();
    }


}
