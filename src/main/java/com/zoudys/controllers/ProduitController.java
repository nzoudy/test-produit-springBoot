package com.zoudys.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zoudys.entities.Produit;
import com.zoudys.services.ProduitService;

@RestController
public class ProduitController {

	@Autowired
	private ProduitService service;

	@RequestMapping(value = "/produit", method = RequestMethod.POST)
	public Produit saveProduit(@RequestBody Produit p) {
		return service.saveProduit(p);
	}

	@RequestMapping(value = "/produit", method = RequestMethod.GET)
	public List<Produit> getAllProduits() {
		return service.getAllProduits();
	}

	@RequestMapping(value = "/produit/{id}", method = RequestMethod.GET)
	public Produit getProduit(@PathVariable(value="id") Integer idProduit) {
		return service.getProduit(idProduit);
	}
	
	@RequestMapping(value = "/produit/{id}", method = RequestMethod.PUT)
	public Produit updateProduit(@PathVariable(value="id") Integer idProduit, @RequestBody Produit p) {
		return service.updateProduit(idProduit, p);
	}
	
	@RequestMapping(value = "/produit/{id}", method = RequestMethod.DELETE)
	public boolean deleteProduit(@PathVariable(value="id")Integer idProduit){
		service.deleteProduit(idProduit);
		return true;
	}

}
