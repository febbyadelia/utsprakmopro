package com.example.recyclerview.model;

public class MovieModel {
    String judul;
    String tahun;
    String penulis;
    String DesCription;

    public MovieModel(String judul, String tahun, String penulis, String desCription) {
        this.judul = judul;
        this.tahun = tahun;
        this.penulis = penulis;
        DesCription = desCription;
    }

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getTahun() {
        return tahun;
    }
    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    public String getPenulis() {
        return penulis;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public String getDesCription() {
        return DesCription;
    }
    public void setDesCription(String desCription) {
        DesCription = desCription;
    }
}