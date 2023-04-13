package com.servicios.CaroTest11042023.Service;

import com.servicios.CaroTest11042023.Entity.UsuarioEntity;
import com.servicios.CaroTest11042023.Model.UsuarioDetalles;
import com.servicios.CaroTest11042023.Repository.UsuarioEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioEntityRepository usuarioEntityRepository;

    @Override
    public List<UsuarioDetalles> getAll() {
        List<UsuarioDetalles> listaUsuariosCliente = new ArrayList<>();
        List<UsuarioEntity> listaEntidadesUsuario = usuarioEntityRepository.findAll();
        for (UsuarioEntity entity : listaEntidadesUsuario) {
            UsuarioDetalles dto = new UsuarioDetalles();
            dto.setNombrePrincipal(entity.getNombrePrincipal());
            dto.setNombreSecundario(entity.getNombreSecundario());
            dto.setApellidoPrincipal(entity.getApellidoPrincipal());
            dto.setApellidoSecundario(entity.getApellidoSecundario());
            dto.setGenero(entity.getGenero());
            dto.setFechaNacimiento(entity.getFechaNacimiento());
            listaUsuariosCliente.add(dto);
        }
        return listaUsuariosCliente;
    }

    @Override
    public void createUsuario(UsuarioDetalles usuario) {
        UsuarioEntity entity = new UsuarioEntity();
        entity.setNombrePrincipal(usuario.getNombrePrincipal());
        entity.setNombreSecundario(usuario.getNombreSecundario());
        entity.setApellidoPrincipal(usuario.getApellidoPrincipal());
        entity.setApellidoSecundario(usuario.getApellidoSecundario());
        entity.setGenero(usuario.getGenero());
        entity.setFechaNacimiento(usuario.getFechaNacimiento());

        usuarioEntityRepository.save(entity);
    }

    @Override
    public void actualizarUsuario(String campo, String valor, Long id) {
        Optional<UsuarioEntity> dato = usuarioEntityRepository.findById(id);
        if (dato.isPresent()) {
            UsuarioEntity entidad = dato.get();
            switch (campo){
                case "nombrePrincipal":
                    entidad.setNombrePrincipal(valor);
                    break;
                case "nombreSecundario":
                    entidad.setNombreSecundario(valor);
                    break;
                case "apellidoPrincipal":
                    entidad.setApellidoPrincipal(valor);
                    break;
                case "apellidoSecundario":
                    entidad.setApellidoSecundario(valor);
                    break;
            }

            usuarioEntityRepository.save(entidad);
        }

    }
}

