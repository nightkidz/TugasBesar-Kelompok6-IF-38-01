/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ferawidya
 */
public class Transaksi {
    private int jmlOrang;
    private int idTransaksi;
    private TempatWisata paket = new TempatWisata();
    private String NoTujuanTransfer;
    private String noAsalTransfer;
    private String BankAsal;
    private String BankTujuan;
    private int JumlahBayar;
    private String berita;
    private Date tanggal;
    private String caraTrans;
    

    
    public void Bukti(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nomor bukti transfer : "); NoTujuanTransfer = sc.nextLine();
        System.out.println("Bank asal : "); BankAsal = sc.nextLine();
        System.out.println("Bank Tujuan : "); BankTujuan = sc.nextLine();
        System.out.println("Jumlah bayar transfer : "); JumlahBayar = sc.nextInt();
        
    }

        public int bayar() {
        return jmlOrang * paket.getHarga();
        
    }

        public void konfirmasi() {
       if (bayar() == JumlahBayar) {
           System.out.println("Pembayaran berhasil");
       } 
    }

        public void pilihPaket() {
        PaketTravel pt = new PaketTravel();        
        Scanner scan = new Scanner(System.in);
        int pil;
        pt.ListPaket();
        System.out.print("Pilih Paket: ");
        pil = scan.nextInt();
    }
    
    
        public void pesan() {
        int kuota= 5;
        char n = 0;
        while (n=='y'){ 
            pilihPaket();
            System.out.println("Ingin pilih paket lagi?(y/n)");
            kuota = kuota-1;      
        }
        if (kuota==0){
            System.out.println("Kuota Sudah Habis");
        }
    }

    public int getJmlOrang() {
        return jmlOrang;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public TempatWisata getPaket() {
        return paket;
    }

    public String getNoTujuanTransfer() {
        return NoTujuanTransfer;
    }

    public String getNoAsalTransfer() {
        return noAsalTransfer;
    }

    public String getBankAsal() {
        return BankAsal;
    }

    public String getBankTujuan() {
        return BankTujuan;
    }

    public int getJumlahBayar() {
        return JumlahBayar;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public String getBerita() {
        return berita;
    }

    public String getCaraTrans() {
        return caraTrans;
    }

    public void setJmlOrang(int jmlOrang) {
        this.jmlOrang = jmlOrang;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setPaket(TempatWisata paket) {
        this.paket = paket;
    }

    public void setNoTujuanTransfer(String NoTujuanTransfer) {
        this.NoTujuanTransfer = NoTujuanTransfer;
    }

    public void setNoAsalTransfer(String noAsalTransfer) {
        this.noAsalTransfer = noAsalTransfer;
    }

    public void setBankAsal(String BankAsal) {
        this.BankAsal = BankAsal;
    }

    public void setBankTujuan(String BankTujuan) {
        this.BankTujuan = BankTujuan;
    }

    public void setJumlahBayar(int JumlahBayar) {
        this.JumlahBayar = JumlahBayar;
    }

    public void setBerita(String berita) {
        this.berita = berita;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public void setCaraTrans(String caraTrans) {
        this.caraTrans = caraTrans;
    }
}