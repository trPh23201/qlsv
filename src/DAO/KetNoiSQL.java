/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gnoob
 */
public class KetNoiSQL {

    public static Connection getConnect() {
        String server = "DESKTOP-3T54KDJ\\SQLEXPRESS";
        String database = "QUANLYSINHVIEN";
        String url = "jdbc:sqlserver://" + server + ":1433;DatabaseName=" + database + ";encrypt=true;trustServerCertificate=true;";
        String username = "sa";
        String password = "matkhau123";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("CONNECTED DB!");
        } catch (SQLException e) {
            System.out.println("KO THE KET NOI SQL!");
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    
    public static Connection connection = getConnect();

    public static void main(String[] args) {
        KetNoiSQL ketnoi = new KetNoiSQL();
        Connection connection = ketnoi.getConnect();
    }
}
