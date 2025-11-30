package com.ecocash.EcoCash.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MATERIAL")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_material")
    private Long id;

    @Column(name = "nome_material")
    private String nome;

    @Column(name = "ativo_material")
    private Boolean ativo;

    @Column(name = "pontos_material")
    private Integer pontos;

    public Material() {}

    // Getters e setters

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }


}
