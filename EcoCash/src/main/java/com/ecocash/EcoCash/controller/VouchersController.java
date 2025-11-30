package com.ecocash.EcoCash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecocash.EcoCash.model.Vouchers;
import com.ecocash.EcoCash.repository.VouchersRepository;

@RestController
@RequestMapping("/vouchers")
public class VouchersController {

    private final VouchersRepository vouchersRepository;

    public VouchersController(VouchersRepository vouchersRepository) {
        this.vouchersRepository = vouchersRepository;
    }

    @GetMapping
    public List<Vouchers> listarTodos() {
        return vouchersRepository.findAll();
    }

    @GetMapping("/{id}")
    public Vouchers buscarPorId(@PathVariable Long id) {
        return vouchersRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Vouchers criar(@RequestBody Vouchers vouchers) {
        return vouchersRepository.save(vouchers);
    }

    @PutMapping("/{id}")
    public Vouchers editar(@PathVariable Long id, @RequestBody Vouchers novoVoucher) {
        novoVoucher.setId(id);
        return vouchersRepository.save(novoVoucher);
    }
}
