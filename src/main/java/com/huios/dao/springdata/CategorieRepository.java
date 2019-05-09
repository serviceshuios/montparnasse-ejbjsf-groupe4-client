package com.huios.dao.springdata;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huios.metier.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
