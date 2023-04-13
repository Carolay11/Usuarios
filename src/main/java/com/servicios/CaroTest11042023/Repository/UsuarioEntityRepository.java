package com.servicios.CaroTest11042023.Repository;

import com.servicios.CaroTest11042023.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioEntityRepository extends JpaRepository<UsuarioEntity, Long> {
}