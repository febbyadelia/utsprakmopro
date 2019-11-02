package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfilActivity extends AppCompatActivity {
    Button btn_pindah1;
    Button btn_pindah2;
    Button btn_pindah3;
    EditText txtnmr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        btn_pindah1= findViewById(R.id.telp);
        btn_pindah2= findViewById(R.id.sosmed);
        btn_pindah3= findViewById(R.id.lokasi);

        btn_pindah1.setOnClickListener(new View.OnClickListener(){
         @Override
             public void onClick(View v) {
             Telp(v);
         }
        });

        btn_pindah2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Sosmed(v);

            }
        });

        btn_pindah3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Lokasi(v);

            }
        });
    }

    public  void Telp(View view) {
        String nmr = txtnmr.getText().toString();
        Intent intent = new Intent(Intent. ACTION_DIAL);
        intent.setData(Uri. fromParts("telp", nmr, null));
        startActivity(intent);
    }

    public void Sosmed (View view){
        String url="https://www.instagram.com/febbyai_";
        Intent intent = new Intent(Intent. ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void Lokasi (View view){
        String url="https://www.google.com/maps/place/BHO+Burhanudin+Optikal,+Jl.+Desa+Cipadung+No.37,+Cipadung,+Kec.+Ujung+Berung,+Kota+Bandung,+Jawa+Barat+40615/@-6.9287507,107.7157233,17z/data=!4m2!3m1!1s0x2e68c32abbd88cf5:0x9431ad52b2cfa18d";
        Intent intent = new Intent(Intent. ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
