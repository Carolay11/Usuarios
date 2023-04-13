package com.servicios.CaroTest11042023.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id", nullable = false)
    private Long id;
    @Column(name = "usuario_nombre_principal", nullable = false)
    private String nombrePrincipal;
    @Column(name = "usuario_nombre_secundario", nullable = true)
    private String nombreSecundario;
    @Column(name = "usuario_apellido_principal", nullable = false)
    private String apellidoPrincipal;
    @Column(name = "usuario_apellido_secundario", nullable = true)
    private String apellidoSecundario;
    @Column(name = "usuario_fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;
    @Column(name = "usuario_genero", nullable = false)
    private Character genero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}