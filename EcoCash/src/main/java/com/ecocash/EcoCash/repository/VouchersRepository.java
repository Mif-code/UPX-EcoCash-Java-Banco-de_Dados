package com.ecocash.EcoCash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecocash.EcoCash.model.Vouchers;

public interface VouchersRepository extends JpaRepository<Vouchers, Long> {};