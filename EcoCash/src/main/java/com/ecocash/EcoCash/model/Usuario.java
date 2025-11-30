package com.ecocash.EcoCash.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @JsonProperty("nome_usuario")
    private String nome_usuario;

    @JsonProperty("sobrenome_usuario")
    private String sobrenome_usuario;

    private String email;
    private Long telefone;
    private float saldo;

    public Usuario () {}

    public void setIdUsuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nome_usuario = nomeUsuario;
    }

    public void setSobrenomeUsuario(String sobrenomeUsuario) {
        this.sobrenome_usuario = sobrenomeUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Long getIdUsuario() {
        return id_usuario;
    }

    public String getNomeUsuario() {
        return nome_usuario;
    }

    public String getSobrenomeUsuario() {
        return sobrenome_usuario;
    }

    public String getEmail() {
        return email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public float getSaldo() {
        return saldo;
    }
    
}