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

import com.ecocash.EcoCash.model.Material;
import com.ecocash.EcoCash.repository.MaterialRepository;

@RestController
@RequestMapping("/materiais")
public class MaterialController {

    private final MaterialRepository materialRepository;

    public MaterialController(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @GetMapping
    public List<Material> listarTodos() {
        return materialRepository.findAll();
    }

    @GetMapping("/{id}")
    public Material buscarPorId(@PathVariable Long id) {
        return materialRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Material criar(@RequestBody Material material) {
        return materialRepository.save(material);
    }

    @PutMapping("/{id}")
    public Material editar(@PathVariable Long id, @RequestBody Material novoMaterial) {
        novoMaterial.setId(id);
        return materialRepository.save(novoMaterial);
    }
}
