package com.Gym.Gym_web_v2.util;


import java.sql.*;

public class Conexion {


    //prueba de conexion con MySQL
    public Connection getConexion(){

        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/gym","root","admin");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Connected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }



    public static void close(Connection con) throws SQLException {
        con.close();

    }

    public static void close(ResultSet res) throws SQLException {
        res.close();
    }

    public static void close(Statement sen) throws SQLException {
        sen.close();
    }

    public static void close(PreparedStatement psen) throws SQLException {
        psen.close();
    }

}
