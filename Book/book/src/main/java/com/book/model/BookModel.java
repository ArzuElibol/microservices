package com.book.model;

public class BookModel {
    
    public int kitapId;
    public String kitapAd;
    public int basimYili;
    public int kategoriId;
    public int yazarId;


    
    @Override
    public String toString() {
        return "BookModel [basimYili=" + basimYili + ", kategoriId=" + kategoriId + ", kitapAd=" + kitapAd
                + ", kitapId=" + kitapId + ", yazarId=" + yazarId + "]";
    }
    public int getKitapId() {
        return kitapId;
    }
    public void setKitapId(int kitapId) {
        this.kitapId = kitapId;
    }
    public String getKitapAd() {
        return kitapAd;
    }
    public void setKitapAd(String kitapAd) {
        this.kitapAd = kitapAd;
    }
    public int getBasimYili() {
        return basimYili;
    }
    public void setBasimYili(int basimYili) {
        this.basimYili = basimYili;
    }
    public int getKategoriId() {
        return kategoriId;
    }
    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }
    public int getYazarId() {
        return yazarId;
    }
    public void setYazarId(int yazarId) {
        this.yazarId = yazarId;
    }
}

