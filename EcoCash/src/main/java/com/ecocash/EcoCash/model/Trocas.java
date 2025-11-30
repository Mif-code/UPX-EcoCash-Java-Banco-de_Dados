package com.ecocash.EcoCash.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TROCAS")
public class Trocas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trocas")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_voucher")
    private Vouchers voucher;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "dt_troca")
    private LocalDateTime dt_troca;

    public Trocas() {}

    // Getters e setters

    public Long getId() {
        return id;
    }

    public Vouchers getVoucher() {
        return voucher;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getDt_troca() {
        return dt_troca;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setVoucher(Vouchers voucher) {
        this.voucher = voucher;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDt_troca(LocalDateTime dt_troca) {
        this.dt_troca = dt_troca;
    }


}
