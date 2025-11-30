package com.ecocash.EcoCash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecocash.EcoCash.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {};