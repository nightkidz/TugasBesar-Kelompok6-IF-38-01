/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tour_and_travel.main;

import java.util.Scanner;
import Kelas.Customer;
import Kelas.PaketTravel;
import Kelas.Transaksi;

/**
 *
 * @author Ferawidya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       Customer cus = new Customer();
       PaketTravel pak = new PaketTravel();
       Transaksi tra = new Transaksi();
       
       
       tra.pilihPaket();
       tra.pesan();
       System.out.print("Masukkan JUMLAH orang: "); int n = input.nextInt();
       
       
       for (int i=1; i<=n; i++) {
            System.out.println("Masukkan data diri Ke-"+i);
            System.out.println();
            
            System.out.print("Masukan NAMA : ");
            String first = input.next();
            String last = input.nextLine();
            cus.setNama(first+" "+last);
            //cus.setNama(input.nextLine());
            
            System.out.print("Masukan NOMOR KTP : ");
            cus.setNoKtp(input.nextLine());
            System.out.print("Masukkan ALAMAT : ");
            cus.setAlamat(input.nextLine());           
            System.out.print("Masukkan NO HP: ");
            cus.setNoHp(input.nextLine());
            System.out.println();
       }
       tra.Bukti();
       tra.bayar();
       tra.konfirmasi();
    } 
}
