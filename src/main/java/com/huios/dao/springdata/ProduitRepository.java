package com.huios.dao.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huios.metier.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
