package com.example.thaomy.baithi;

import java.io.Serializable;


public class Sinhvien implements Serializable
{
    private int tuoi;
    private String ten,masv;

    public Sinhvien() {
    }

    public Sinhvien(int tuoi, String ten, String masv) {
        this.tuoi = tuoi;
        this.ten = ten;
        this.masv = masv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }
}
