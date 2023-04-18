package com.servicios.CaroTest11042023.Controller;

import com.servicios.CaroTest11042023.Model.UsuarioDetalles;
import com.servicios.CaroTest11042023.Repository.UsuarioEntityRepository;
import com.servicios.CaroTest11042023.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(value = "/usuarios")
    public List<UsuarioDetalles> getUsuarios() {
        return usuarioService.getAll();
    }

    @PostMapping(value = "/usuarios")
    public void createUsuario(@RequestBody UsuarioDetalles usuario) {
        usuarioService.createUsuario(usuario);
    }

    @PutMapping(value = "/usuario/actualizar")
    public void actualizarUsuario(@RequestParam Long id,
                                  @RequestParam String campo,
                                  @RequestParam String valor) {
        usuarioService.actualizarUsuario(campo, valor,id);
    }



}
