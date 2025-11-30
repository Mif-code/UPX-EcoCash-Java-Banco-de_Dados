package com.ecocash.EcoCash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecocash.EcoCash.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {};