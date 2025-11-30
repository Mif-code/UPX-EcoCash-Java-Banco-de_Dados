package com.ecocash.EcoCash.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPRESA")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long id;

    @Column(name = "nome_empresa")
    private String nome;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "ativo_empresa")
    private Boolean ativo;

    public Empresa() {}

    // Getters e setters

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    
}
