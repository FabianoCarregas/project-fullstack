package com.fabiano.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiano.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
