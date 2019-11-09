package com.me.myapplication;

class Song {
    private String judulLagu;
    private String durasiLagu;

    public Song(String judulLagu, String durasiLagu) {
        this.judulLagu = judulLagu;
        this.durasiLagu = durasiLagu;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

    public String getDurasiLagu() {
        return durasiLagu;
    }
}
