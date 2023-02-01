package com.example.trabalhobio;

import java.sql.*;

public class SerVivoSQL {

    public static Connection createConn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabalhojava", "root", "root");
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement createStatement(Connection conn, String sql){
        try {
            PreparedStatement query = conn.prepareStatement(sql);
            return query;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void queryPreparation(PreparedStatement query, SerVivo serVivo){
        try {
            query.setString    (1, serVivo.getReino());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            query.setString    (2, serVivo.getFilo());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            query.setString    (3, serVivo.getClasse());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            query.setString    (4, serVivo.getOrdem());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            query.setString    (5, serVivo.getFamilia());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            query.setString    (6, serVivo.getGenero());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            query.setString    (7, serVivo.getEspecie());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void queryInsertion(PreparedStatement query){
        try {
            query.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertIntoServivo(SerVivo serVivo){
        Connection conn = createConn();
        String sql = " insert into servivo (reino, filo, classe, ordem, familia, genero, especie)" + " values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement query = createStatement(conn, sql);
        queryPreparation(query, serVivo);
        queryInsertion(query);

        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
