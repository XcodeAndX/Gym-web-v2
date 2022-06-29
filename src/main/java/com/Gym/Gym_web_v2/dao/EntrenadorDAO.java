package com.Gym.Gym_web_v2.dao;

import com.Gym.Gym_web_v2.dto.EntrenadorDTO;
import com.Gym.Gym_web_v2.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntrenadorDAO {

    private static final String INSERT = "INSERT INTO entrenador(cedula, nombre, apellido, email, password, telefono) VALUES(?,?,?,?,?,?)";
    private static final String SELECT = "SELECT * FROM entrenador";
    private static final String UPDATE = "UPDATE entrenador SET cedula=?, nombre=?, apellido=?, email=?, password=?, telefono=? WHERE id=?";
    private static final String DELETE = "DELETE FROM entrenador WHERE id=?";
    private static final String FIND_BY_ID = "SELECT * FROM entrenador WHERE id=?";
    private static final String FIND_BY_EMAIL = "SELECT * FROM entrenador WHERE email=?";
    private static final String FIND_BY_CEDULA = "SELECT * FROM entrenador WHERE cedula=?";

    public boolean add(EntrenadorDTO entrenador) {
        boolean registro = false;
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(INSERT);
            stmt.setInt(1, entrenador.getCedula());
            stmt.setString(2, entrenador.getNombre());
            stmt.setString(3, entrenador.getApellido());
            stmt.setString(4, entrenador.getEmail());
            stmt.setString(5, entrenador.getPassword());
            stmt.setInt(5, entrenador.getTelefono());

            registro = stmt.execute();

            if(conn != null){
                conn.close();
            }
            if(stmt != null){
                stmt.close();
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            return registro;
        }
    }


    public List<EntrenadorDTO> get() {
        List<EntrenadorDTO> entrenadores = new ArrayList<EntrenadorDTO>();
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(SELECT);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                EntrenadorDTO entrenador = new EntrenadorDTO();
                entrenador.setId(rs.getInt("id"));
                entrenador.setCedula(rs.getInt("cedula"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setApellido(rs.getString("apellido"));
                entrenador.setEmail(rs.getString("email"));
                entrenador.setTelefono(rs.getInt("telefono"));

                entrenadores.add(entrenador);
            }

            if(conn != null){
                conn.close();
            }
            if(stmt != null){
                stmt.close();
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            return entrenadores;
        }

    }

    public EntrenadorDTO getById(int id) {
        EntrenadorDTO entrenador = new EntrenadorDTO();
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        System.out.println("GetId(" + id + ")");
        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(FIND_BY_ID);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                entrenador.setId(rs.getInt("id"));
                entrenador.setCedula(rs.getInt("cedula"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setApellido(rs.getString("apellido"));
                entrenador.setEmail(rs.getString("email"));
                entrenador.setPassword(rs.getString("password"));
                entrenador.setTelefono(rs.getInt("telefono"));

            }else{
                entrenador = null;
            }

            if(conn != null){
                conn.close();
            }
            if(stmt != null){
                stmt.close();
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            return entrenador;
        }

    }

    public EntrenadorDTO getByEmail(String email) {
        EntrenadorDTO entrenador = new EntrenadorDTO();
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(FIND_BY_EMAIL);
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                entrenador.setId(rs.getInt("id"));
                entrenador.setCedula(rs.getInt("cedula"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setApellido(rs.getString("apellido"));
                entrenador.setEmail(rs.getString("email"));
                entrenador.setPassword(rs.getString("password"));
                entrenador.setTelefono(rs.getInt("telefono"));
            }else{
                entrenador = null;
            }

            if(conn != null){
                conn.close();
            }
            if(stmt != null){
                stmt.close();
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            return entrenador;
        }

    }

    public EntrenadorDTO getByCedula(int cedula) {
        EntrenadorDTO entrenador = new EntrenadorDTO();
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(FIND_BY_CEDULA);
            stmt.setInt(1, cedula);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                entrenador.setId(rs.getInt("id"));
                entrenador.setCedula(rs.getInt("cedula"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setApellido(rs.getString("apellido"));
                entrenador.setEmail(rs.getString("email"));
                entrenador.setPassword(rs.getString("password"));
                entrenador.setTelefono(rs.getInt("telefono"));
            }else{
                entrenador = null;
            }

            if(conn != null){
                conn.close();
            }
            if(stmt != null){
                stmt.close();
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            return entrenador;
        }

    }

    public boolean update(EntrenadorDTO entrenador) {
        boolean update = false;
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(UPDATE);
            stmt.setInt(1, entrenador.getCedula());
            stmt.setString(2, entrenador.getNombre());
            stmt.setString(3, entrenador.getApellido());
            stmt.setString(4, entrenador.getEmail());
            stmt.setString(5, entrenador.getPassword());
            stmt.setInt(5, entrenador.getTelefono());

            update = stmt.execute();

            if(conn != null){
                conn.close();
            }
            if(stmt != null){
                stmt.close();
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            return update;
        }
    }

    public boolean delete(int id){
        boolean delete = false;
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(DELETE);
            stmt.setInt(1, id);

            delete = stmt.execute();

            if(conn != null){
                conn.close();
            }
            if(stmt != null){
                stmt.close();
            }

        } catch (SQLException e) {
            // e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            return delete;
        }
    }


}
