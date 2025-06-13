package uas;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class Conn {

    static Connection Koneksi;

    public static Connection getConnection() {

        try {
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/pendaftaran_haji", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
        return Koneksi;
    }

    public static void main(String[] args) {
        getConnection();
        JOptionPane.showMessageDialog(null, "Koneksi Database Sukses");
    }
}
