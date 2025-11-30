package com.ecocash.EcoCash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecocash.EcoCash.model.Pontos;
import com.ecocash.EcoCash.repository.PontosRepository;

@RestController
@RequestMapping("/pontos")
public class PontosController {

    private final PontosRepository pontosRepository;

    public PontosController(PontosRepository pontosRepository) {
        this.pontosRepository = pontosRepository;
    }

    @GetMapping
    public List<Pontos> listarTodos() {
        return pontosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Pontos buscarPorId(@PathVariable Long id) {
        return pontosRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Pontos criar(@RequestBody Pontos pontos) {
        return pontosRepository.save(pontos);
    }

    @PutMapping("/{id}")
    public Pontos editar(@PathVariable Long id, @RequestBody Pontos novoPontos) {
        novoPontos.setId(id);
        return pontosRepository.save(novoPontos);
    }
}
