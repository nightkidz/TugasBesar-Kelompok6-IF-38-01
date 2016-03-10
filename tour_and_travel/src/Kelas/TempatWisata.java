/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

import java.util.Date;

/**
 *
 * @author Ferawidya
 */
public class TempatWisata {
    private String nama;
    protected int harga;
    private String fasilitas;
    private int durasi;
    private Date tglMulai;
    private Date tglSelesai;
    
    public TempatWisata(){};
    public TempatWisata(int durasi, Date tglMulai) {
        this.durasi = durasi;
        this.tglMulai = new Date();
    }

    public String getNama() {
        return nama;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public Date getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(Date tglMulai) {
        this.tglMulai = tglMulai;
    }

    public Date getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(Date tglSelesai) {
        this.tglSelesai = tglSelesai;
    }
    
    @Override
    public String toString() {
        return ("Harga : "+getHarga()+"fasilitas : "+getFasilitas()+"Durasi : "+getDurasi()+"Tangal selesai : "+getTglSelesai()+"Tanggal mulai : "+getTglMulai());
    }
}
