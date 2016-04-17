/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Kelas.Customer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import travel.db.connection;
/**
 *
 * @author nightkidz
 */
public class IsiData {
    
    private Connection connection;
    
     public IsiData(Connection connection) {
        this.connection = connection;
    }
     
     public void insertDataDiri(Customer customer) throws SQLException {
        String sql = ("INSERT INTO data_diri (nama,hp,ktp,email,alamat,tanggal)" +
                "VALUES (?,?,?,?,?,?)");
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, customer.getNama());
        ps.setString(2, customer.getNoHp());
        ps.setString(3, customer.getNoKtp());
        ps.setString(4, customer.getEmail());
        ps.setString(5, customer.getAlamat());
        ps.setDate(6, new java.sql.Date(customer.getTanggal().getTime()));
        ps.executeUpdate();
    }
    public String getLog(){
        StringBuilder sb = new StringBuilder();
        connection conn = new connection();
        try{
            String query = "SELECT id_pembayaran, bankTujuan, noRek, tglTrans, jumlah, berita, caraTrans FROM pembayaran ";
            ResultSet rs = conn.getData(query);
            while (rs.next()) {
                for (int i =1; i <=5; i++){
                    sb.append(rs.getString(i));
                    sb.append(" ; ");
                }
                sb.append('\n');
            }
            rs.close();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(), "Log Error", JOptionPane.WARNING_MESSAGE);
        }
        return sb.toString();
    }
}