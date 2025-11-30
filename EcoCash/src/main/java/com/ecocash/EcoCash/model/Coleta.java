package com.ecocash.EcoCash.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "COLETA")
public class Coleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_coleta")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_material")
    private Material material;

    @Column(name = "quantidade_coleta")
    @JsonProperty("quantidade_coleta")
    private Integer quantidade;

    @Column(name = "data_coleta")
    @JsonProperty("data_coleta")
    private LocalDateTime dataColeta;

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public LocalDateTime getDataColeta() {
        return dataColeta;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setDataColeta(LocalDateTime dataColeta) {
        this.dataColeta = dataColeta;
    }

}
