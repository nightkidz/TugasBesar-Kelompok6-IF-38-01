/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelas;

/**
 *
 * @author Ferawidya
 */
public class PaketTravel {
    private TempatWisata[] wisata;
    private int nTW=5;
   
    
    public void ListPaket(){
        wisata = new TempatWisata[nTW];
        for (int i=1; i<=nTW; i++){
            System.out.println("Paket "+i);
            System.out.println();
            /*System.out.println("Nama Tempat: "+wisata[i].getNama());
            System.out.println("Harga: "+wisata[i].getHarga());
            System.out.println("Fasilitas: "+wisata[i].gis"+wisata[i].getHetFasilitas());
            System.out.println("Data[i].getNama());
            System.out.println("Harga: urasi: "+wisata[i].getDurasi());*/
        }
    }
}
