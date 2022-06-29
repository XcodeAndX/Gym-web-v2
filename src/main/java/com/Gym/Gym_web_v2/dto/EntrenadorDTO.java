package com.Gym.Gym_web_v2.dto;

public class EntrenadorDTO {

    private int id;
    private int cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private int telefono;

    public EntrenadorDTO(){}

    public EntrenadorDTO(int cedula, String nombre, String apellido, String email, String password, int telefono){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
    }

    public EntrenadorDTO(int id, int cedula, String nombre, String apellido, String email, String password, int telefono){
        this(cedula, nombre, apellido, email, password, telefono);
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

}
