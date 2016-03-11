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
public class Customer {
   private String nama;
   private String noKtp;
   private String alamat;
   private String noHp;
   private Date tanggal;
   private String email;

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
   
    public String getNama() {
        return nama;
    }
    
    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }
    
    public String getNoHp() {
        return noHp;
    }
    
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

   @Override
    public String toString(){
       return ("Nama : "+getNama()+"Nomor KTP : "+getNoKtp()+"Alamat : "+getAlamat()+"Nomor handphone : "+getNoHp());
   }
}
