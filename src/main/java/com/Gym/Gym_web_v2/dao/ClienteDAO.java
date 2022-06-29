package com.Gym.Gym_web_v2.dao;

import com.Gym.Gym_web_v2.dto.ClienteDTO;
import com.Gym.Gym_web_v2.util.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private static final String INSERT = "INSERT INTO cliente(cedula, nombre, apellido, email, password, telefono, peso, altura, imc, Entrenador_id) VALUES(?,?,?,?,?,?,?,?,?,?)";
    private static final String SELECT = "SELECT * FROM cliente";
    private static final String UPDATE = "UPDATE cliente SET cedula=?, nombre=?, apellido=?, email=?, password=?, telefono=?, peso=?, altura=?, imc=? WHERE id=?";
    private static final String DELETE = "DELETE FROM cliente WHERE id=?";
    private static final String FIND_BY_ID = "SELECT * FROM cliente WHERE id=?";
    private static final String FIND_BY_EMAIL = "SELECT * FROM cliente WHERE email=?";
    private static final String FIND_BY_CEDULA = "SELECT * FROM cliente WHERE cedula=?";

    public boolean add(ClienteDTO cliente) {
        boolean registro = false;
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(INSERT);
            stmt.setInt(1, cliente.getCedula());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getApellido());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getPassword());
            stmt.setInt(6, cliente.getTelefono());
            stmt.setDouble(7, cliente.getPeso());
            stmt.setDouble(8, cliente.getAltura());
            stmt.setDouble(7, cliente.getImc());
            stmt.setInt(7, cliente.getEntrenador());

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


    public List<ClienteDTO> get() {
        List<ClienteDTO> clientes = new ArrayList<ClienteDTO>();
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(SELECT);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ClienteDTO cliente = new ClienteDTO();
                cliente.setId(rs.getInt("id"));
                cliente.setCedula(rs.getInt("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setPeso(rs.getDouble("peso"));
                cliente.setAltura(rs.getDouble("altura"));
                cliente.setImc(rs.getDouble("imc"));
                cliente.setEntrenador(rs.getInt("Entrenador_id"));

                clientes.add(cliente);
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
            return clientes;
        }

    }

    public ClienteDTO getById(int id) {
        ClienteDTO cliente = new ClienteDTO();
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(FIND_BY_ID);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente.setId(rs.getInt("id"));
                cliente.setCedula(rs.getInt("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setPeso(rs.getDouble("peso"));
                cliente.setAltura(rs.getDouble("altura"));
                cliente.setImc(rs.getDouble("imc"));
                cliente.setEntrenador(rs.getInt("Entrenador_id"));

            }else{
                cliente = null;
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
            return cliente;
        }

    }

    public ClienteDTO getByEmail(String email) {
        ClienteDTO cliente = new ClienteDTO();
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(FIND_BY_EMAIL);
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente.setId(rs.getInt("id"));
                cliente.setCedula(rs.getInt("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setPeso(rs.getDouble("peso"));
                cliente.setAltura(rs.getDouble("altura"));
                cliente.setImc(rs.getDouble("imc"));
                cliente.setEntrenador(rs.getInt("Entrenador_id"));
            }else{
                cliente = null;
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
            return cliente;
        }

    }

    public ClienteDTO getByCedula(int cedula) {
        ClienteDTO cliente = new ClienteDTO();
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(FIND_BY_CEDULA);
            stmt.setInt(1, cedula);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cliente.setId(rs.getInt("id"));
                cliente.setCedula(rs.getInt("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setPeso(rs.getDouble("peso"));
                cliente.setAltura(rs.getDouble("altura"));
                cliente.setImc(rs.getDouble("imc"));
                cliente.setEntrenador(rs.getInt("Entrenador_id"));
            }else{
                cliente = null;
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
            return cliente;
        }

    }

    public boolean update(ClienteDTO cliente) {
        boolean update = false;
        Conexion conexion = new Conexion();
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conexion.getConexion();
            stmt = conn.prepareStatement(UPDATE);
            stmt.setInt(1, cliente.getCedula());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getApellido());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getPassword());
            stmt.setInt(6, cliente.getTelefono());
            stmt.setDouble(7, cliente.getPeso());
            stmt.setDouble(8, cliente.getAltura());
            stmt.setDouble(7, cliente.getImc());
            stmt.setInt(7, cliente.getEntrenador());

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
