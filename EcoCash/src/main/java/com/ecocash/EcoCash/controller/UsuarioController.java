package com.ecocash.EcoCash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecocash.EcoCash.model.Usuario;
import com.ecocash.EcoCash.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        System.out.println(usuario);
        return usuarioRepository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario editar(@PathVariable Long id, @RequestBody Usuario usuarioNovo) {
        usuarioNovo.setIdUsuario(id);
        return usuarioRepository.save(usuarioNovo);
    }
}
