package com.huios.mbeans;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.huios.metier.Categorie;
import com.huios.metier.Produit;
import com.huios.service.Iservice;

@Controller
@ManagedBean
@SessionScoped
public class ProduitBean {
	
	// attributs
	@Autowired
	private Iservice service;
	@Autowired
	private Produit produit;
	
	private List<Categorie> categories;
	

	public List<Categorie> getCategories() {
		return service.listerCategories();
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	public Iservice getService() {
		return service;
	}

	public void setService(Iservice service) {
		this.service = service;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	// méthodes
	public void ajouterProduit() {
		service.ajouterProduit(produit);
		produit = new Produit();
	}
	public List<Produit> listerProduits() {
		return service.listerProduits();
	}
	public void supprimerProduit(long idProduit) {
		service.supprimerProduit(idProduit);
	}
	public Produit getProduit(long idProduit) {
		return service.getProduit(idProduit);
	}
}
