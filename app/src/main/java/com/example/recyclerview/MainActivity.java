package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapter.MovieAdapter;
import com.example.recyclerview.model.MovieModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MovieAdapter adapter;
    RecyclerView rv;
    List<MovieModel> listMovie = new ArrayList<>();
    String[] img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.profil){
            startActivity(new Intent(this, ProfilActivity.class));
        } else if (item.getItemId() == R.id.change) {
            startActivity(new Intent(this, ChangeActivity.class));
        }

        return true;
    }

    public void initRecyclerView(){
        adapter = new MovieAdapter(this);
        rv = findViewById(R.id.rv_movie);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);
        rv.setNestedScrollingEnabled(false);
        rv.hasFixedSize();

        adapter.setOnItemClickListener(new
MovieAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Intent i = new Intent(MainActivity.this,
             DetailMovieActivity.class);
                i.putExtra("judul",listMovie.get(position).getJudul());
                i.putExtra("tahun",listMovie.get(position).getTahun());
                i.putExtra("penulis",listMovie.get(position).getPenulis());
                i.putExtra("deskripsi",listMovie.get(position).getDesCription());
                startActivity(i);
            }
        });

        loadItem();
    }

    public void loadItem(){
        listMovie.add(new MovieModel("Judul : Geez dan Ann #1", "Tahun : 2017", "Penulis : Nadhifa Allya Tsana",
                "Untuk peri kecilku,\n" +
                        "\n" +
                        "Ann, dari kecil, aku susah sekali bicara banyak.\n" +
                        "Namun, sejak bertemu denganmu, aku ingin bisa\n" +
                        "banyak berkata-kata, khususnya saat bersamamu.\n" +
                        "\n" +
                        "Aku tahu, aku jenis orang yang sedikit rumit. Namun, percayalah Ann, aku berusaha sekeras mungkin untuk bisa membuatmu memahamiku, walaupun itu sulit. "));
        listMovie.add(new MovieModel("Judul : Geez dan Ann #2", "Tahun : 2017", "Penulis : Nadhifa Allya Tsana",
                "Selalu untukmu Geez,\n" +
                        "\n" +
                        "Sebulan lebih aku sudah berada di Berlin. Mencari, mencari, dan mencari. Sampai akhirnya, aku menemukan sebuah jawaban yang terpaksa aku terima. Bukan jawaban terbaik, tetapi aku harus bisa menghargai itu.\n" +
                        "\n" +
                        "Berlin, aku titip dewa kejutanku, ya. Sembunyikan saja senjamu kalau dia nakal, pasti dia langsung jadi anak baik lagi.\n" +
                        "\n" +
                        "Berlin, aku juga titip rasa sayang ini untuknya. Seperti permintaannya, perasaan untuknya tidak akan lagi aku bawa pulang.\n" +
                        "\n" +
                        "Aku pamit,\n" +
                        "\n" +
                        "Ann."));
        listMovie.add(new MovieModel("Judul : Buku Rahasia Geez", "Tahun : 2018", "Penulis : Nadhifa Allya Tsana",
                "Selalu untukmu Geez,\n" +
                        "\n" +
                        "Sebulan lebih aku sudah berada di Berlin. Mencari, mencari, dan mencari. Sampai akhirnya, aku menemukan sebuah jawaban yang terpaksa aku terima. Bukan jawaban terbaik, tetapi aku harus bisa menghargai itu.\n" +
                        "\n" +
                        "Berlin, aku titip dewa kejutanku, ya. Sembunyikan saja senjamu kalau dia nakal, pasti dia langsung jadi anak baik lagi.\n" +
                        "\n" +
                        "Berlin, aku juga titip rasa sayang ini untuknya. Seperti permintaannya, perasaan untuknya tidak akan lagi aku bawa pulang.\n" +
                        "\n" +
                        "Aku pamit,\n" +
                        "\n" +
                        "Ann."));
        listMovie.add(new MovieModel("Judul : KATA", "Tahun : 2018", "Penulis : Nadhifa Allya Tsana",
                "Nugraha\n" +
                        "\n" +
                        "Andai bisa sesederhana itu, aku tidak akan pernah mencintaimu sejak awal. aku tidak akan mengambil risiko, mengorbankan perasaanku. Namun, semua ini diluar kendaliku.\n" +
                        "\n" +
                        "Biru\n" +
                        "\n" +
                        "Banda Neira adalah hari-hari terakhirku bersamamu. Kutitipkan segala rindu, cerita, dan perasaan yang tak lagi kubawa, lewat sebuah ciuman perpisahan. Berjanjilah kau akan melanjutkan hidupmu bersama laki-laki yang bisa menjaga dan menyayangimu lebih baik dariku.\n" +
                        "\n" +
                        "Binta\n" +
                        "\n" +
                        "Cinta pertama seorang perempuan yang didapat dari laki-laki adalah dari ayahnya. Dan cinta pertama itu, telah mematahkan hatiku. Ayahku sendiri membuatku berhenti percaya dengan yang namanya cinta.\n" +
                        "\n" +
                        "Nugraha, Biru, dan Binta saling membelakangi dan saling pergi. Mereka butuh kata-kata untuk menjelaskan perasaan. Mereka harus bicara dan berhenti menyembunyikan kata hati serta mencari jawaban dari sebuah perasaan."));

        adapter.addAll(listMovie);
    }
}