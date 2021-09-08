package com.jpv.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpv.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
