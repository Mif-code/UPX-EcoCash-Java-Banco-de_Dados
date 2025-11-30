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
@Table(name = "PONTOS")
public class Pontos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pontos")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "tipo_pontos")
    private String tipo;

    @Column(name = "valor_pontos")
    private Integer valor;

    @Column(name = "movimentacao_pontos")
    @JsonProperty("dt_movimentacao")
    private LocalDateTime movimentacao;

    public Pontos() {}

    // Getters e setters

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getValor() {
        return valor;
    }

    public LocalDateTime getMovimentacao() {
        return movimentacao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setMovimentacao(LocalDateTime movimentacao) {
        this.movimentacao = movimentacao;
    }


}
