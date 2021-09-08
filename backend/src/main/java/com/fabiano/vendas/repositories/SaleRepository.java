package com.fabiano.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fabiano.vendas.dto.SaleSuccessDTO;
import com.fabiano.vendas.dto.SaleSumDTO;
import com.fabiano.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.fabiano.vendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "From Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("SELECT new com.fabiano.vendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "From Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySeller();


}
