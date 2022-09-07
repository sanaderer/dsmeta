package io.github.sanaderer.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.sanaderer.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
