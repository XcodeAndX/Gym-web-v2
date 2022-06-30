package com.Gym.Gym_web_v2.util;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

public class Conexion {

    //prueba conexion con firebase- fallida

    /*
    public static Connection getConexion() throws IOException {


        FileInputStream serviceAccount = new FileInputStream("gym-web.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp.initializeApp(options);

    */



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


    // segundo intento conexion jdbc

    /*private static final String URL = "jdbc:mysql://localhost:3306/gym";
    private final String USER = "root";
    private final String PASSWORD = "root";
    //private final static String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection con =null;

    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","admin");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Connection getConexion(){
        Connection con = null;
        System.out.println("************PRUEBA************************");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("************PRUEBA BASEDEDATOS************************");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
    */
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
