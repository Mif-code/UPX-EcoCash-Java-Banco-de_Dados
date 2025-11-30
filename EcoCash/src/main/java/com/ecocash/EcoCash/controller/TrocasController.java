package com.ecocash.EcoCash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecocash.EcoCash.model.Trocas;
import com.ecocash.EcoCash.repository.TrocasRepository;

@RestController
@RequestMapping("/trocas")
public class TrocasController {

    private final TrocasRepository trocasRepository;

    public TrocasController(TrocasRepository trocasRepository) {
        this.trocasRepository = trocasRepository;
    }

    @GetMapping
    public List<Trocas> listarTodos() {
        return trocasRepository.findAll();
    }

    @GetMapping("/{id}")
    public Trocas buscarPorId(@PathVariable Long id) {
        return trocasRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Trocas criar(@RequestBody Trocas trocas) {
        return trocasRepository.save(trocas);
    }

    @PutMapping("/{id}")
    public Trocas editar(@PathVariable Long id, @RequestBody Trocas novasTrocas) {
        novasTrocas.setId(id);
        return trocasRepository.save(novasTrocas);
    }
}
