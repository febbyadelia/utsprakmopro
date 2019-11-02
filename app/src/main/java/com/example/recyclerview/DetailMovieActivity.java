package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovieActivity extends AppCompatActivity {
        ImageView imgView;
        TextView tvJudul;
        TextView tvTahun;
        TextView penulis;
        TextView desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        setData();
    }
    public void setData(){
        imgView = findViewById(R.id.img_movie);
        tvJudul = findViewById(R.id.txt_judul);
        tvTahun = findViewById(R.id.txt_tahun);
        desc = findViewById(R.id.txt_deskripsil);
        tvJudul.setText(getIntent().getStringExtra("judul"));
        tvTahun.setText(getIntent().getStringExtra("tahun"));
        desc.setText(getIntent().getStringExtra("deskripsi"));
    }
}