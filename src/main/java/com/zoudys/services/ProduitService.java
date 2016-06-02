package com.zoudys.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zoudys.entities.Produit;
import com.zoudys.repositories.ProduitRepository;

@Component
public class ProduitService {

	@Autowired
	private ProduitRepository repository;
	
	public Produit saveProduit(Produit p){
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = p.getCreationDate();
		p.setCreationDate(date);		
		return repository.save(p);
	}
	
	public List<Produit> getAllProduits(){
		return repository.findAll();
	}
	
	public Produit getProduit(Integer idProduit){
		return repository.findOne(idProduit);
	}
	
	public Produit updateProduit(Integer id, Produit p){
		Produit produit = repository.findOne(id);
		produit.setNomProduit(p.getNomProduit());
		produit.setCreationDate(p.getCreationDate());
		return repository.saveAndFlush(produit);
	}
	
	public boolean deleteProduit(Integer idProduit){
		repository.delete(idProduit);
		return true;
	}
	
	
}
