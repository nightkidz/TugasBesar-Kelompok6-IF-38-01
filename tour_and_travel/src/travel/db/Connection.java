/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nightkidz
 */


public class connection {
    
    private String url = "jdbc:mysql://localhost:3306/alfian";
    private String dbName = "alfian";
    private String host = "localhost:3306";
    private String userName = "root";
    private String password = "";
    private Connection connection = null;
    private java.sql.Statement statement = null;
    private java.sql.ResultSet resultSet = null;
    private static connection myConn = null;
    
    public connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static connection getInstance() {
        connection conn = null;
        
            if (myConn == null) {
                myConn = new connection();
                try {
                    myConn.openConnection();
                } catch (SQLException ex) {
                    Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
                }
                conn = myConn;
            } else {
                conn = myConn;
            }
            return conn;
        }
    
    public ResultSet getData (String query){
        
        try{
            resultSet = statement.executeQuery(query);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage(), 
                    "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return resultSet;
    }
    
     public void closeConnection() throws SQLException {
        this.connection.close();
    }  
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public Connection openConnection() throws SQLException {
        if (this.connection == null) {
            this.connection = DriverManager.getConnection(this.url, this.userName, this.password);
        }
        return this.connection;
    }
  
}


