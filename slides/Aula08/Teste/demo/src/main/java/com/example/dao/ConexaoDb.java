package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDb {

    private String url =  "jdbc:mysql://localhost:3306/escola";
    private String username = "root";
    private String password = "";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    this.url, this.username, this.password);
            System.out.println("Connection established.");

            return con;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
