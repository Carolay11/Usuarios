package com.servicios.CaroTest11042023.Service;

import com.servicios.CaroTest11042023.Model.UsuarioDetalles;

import java.util.List;

public interface UsuarioService {
    List<UsuarioDetalles> getAll();

    void createUsuario(UsuarioDetalles usuario);

    void actualizarUsuario(String campo, String valor, Long id);
}
