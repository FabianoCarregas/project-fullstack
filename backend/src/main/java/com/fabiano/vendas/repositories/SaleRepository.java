package com.fabiano.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiano.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
