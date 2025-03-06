package com.exemplo.minhaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.minhaapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}