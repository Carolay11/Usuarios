package com.servicios.CaroTest11042023.Model;

import java.sql.Date;

public class UsuarioDetalles {
    private String nombrePrincipal;
    private String nombreSecundario;
    private String apellidoPrincipal;
    private String apellidoSecundario;
    private Date fechaNacimiento;
    private Character genero;
    private Long id;

    public String getNombrePrincipal() {
        return nombrePrincipal;
    }

    public void setNombrePrincipal(String nombrePrincipal) {
        this.nombrePrincipal = nombrePrincipal;
    }

    public String getNombreSecundario() {
        return nombreSecundario;
    }

    public void setNombreSecundario(String nombreSecundario) {
        this.nombreSecundario = nombreSecundario;
    }

    public String getApellidoPrincipal() {
        return apellidoPrincipal;
    }

    public void setApellidoPrincipal(String apellidoPrincipal) {
        this.apellidoPrincipal = apellidoPrincipal;
    }

    public String getApellidoSecundario() {
        return apellidoSecundario;
    }

    public void setApellidoSecundario(String apellidoSecundario) {
        this.apellidoSecundario = apellidoSecundario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
