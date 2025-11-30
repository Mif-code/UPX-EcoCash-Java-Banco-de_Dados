package com.ecocash.EcoCash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecocash.EcoCash.model.Empresa;
import com.ecocash.EcoCash.repository.EmpresaRepository;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private final EmpresaRepository empresaRepository;

    public EmpresaController(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @GetMapping
    public List<Empresa> listarTodos() {
        return empresaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Empresa buscarPorId(@PathVariable Long id) {
        return empresaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Empresa criar(@RequestBody Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @PutMapping("/{id}")
    public Empresa editar(@PathVariable Long id, @RequestBody Empresa empresaNova) {
        empresaNova.setId(id);
        return empresaRepository.save(empresaNova);
    }
}
