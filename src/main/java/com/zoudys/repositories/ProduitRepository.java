package com.zoudys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer>{

}
