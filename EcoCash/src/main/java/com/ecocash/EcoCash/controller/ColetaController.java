package com.ecocash.EcoCash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecocash.EcoCash.model.Coleta;
import com.ecocash.EcoCash.repository.ColetaRepository;

@RestController
@RequestMapping("/coletas")
public class ColetaController {

    private final ColetaRepository coletaRepository;

    public ColetaController(ColetaRepository coletaRepository) {
        this.coletaRepository = coletaRepository;
    }

    @GetMapping
    public List<Coleta> listarTodos() {
        return coletaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Coleta buscarPorId(@PathVariable Long id) {
        return coletaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Coleta criar(@RequestBody Coleta coleta) {
        return coletaRepository.save(coleta);
    }

    @PutMapping("/{id}") 
    public Coleta editar(@PathVariable Long id, @RequestBody Coleta novaColeta) {
        novaColeta.setId(id);
        return coletaRepository.save(novaColeta);
    }
}
