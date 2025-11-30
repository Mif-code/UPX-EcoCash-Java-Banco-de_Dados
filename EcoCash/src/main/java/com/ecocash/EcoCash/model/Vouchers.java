package com.ecocash.EcoCash.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "VOUCHERS")
public class Vouchers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_voucher")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @Column(name = "pontos")
    private Integer pontos;

    @Column(name = "descricao")
    private String descricao;

    public Vouchers() {}

    // Getters e setters

    public Long getId() {
        return id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Integer getPontos() {
        return pontos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
