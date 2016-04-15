/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.model;

import travel.entity.Transaksi;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author nightkidz
 */
public class Pembayaran {
    private Connection connection;
    
     public Pembayaran(Connection connection) {
        this.connection = connection;
    }
     
     public void insertPembayaran(Transaksi transaksi) throws SQLException {
        String sql = "INSERT INTO pembayaran (bankTujuan,noRek,tglTrans,jumlah,berita,caraTrans)" +
                "VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, transaksi.getBankTujuan());
        ps.setString(2,  transaksi.getNoTujuanTransfer());
        ps.setDate (3, new java.sql.Date(transaksi.getTanggal().getTime()));
        ps.setInt(4, transaksi.getJumlahBayar());
        ps.setString(5, transaksi.getBerita());
        ps.setString(6, transaksi.getCaraTrans());
        ps.executeUpdate();
    }
}
