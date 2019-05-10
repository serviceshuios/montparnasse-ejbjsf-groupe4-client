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
public class CategorieBean {
	
	// attributs
	@Autowired
	private Iservice service;
	@Autowired
	private Categorie categorie;

	public Iservice getService() {
		return service;
	}

	public void setService(Iservice service) {
		this.service = service;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	// méthodes
	public void ajouterCategorie() {
		service.ajouterCategorie(categorie);
		categorie = new Categorie();
	}
	public List<Categorie> listerCategories() {
		return service.listerCategories();
	}
	public void supprimerCategorie(long idCategorie) {
		service.supprimerCategorie(idCategorie);
	}
	public Categorie getCategorie(long idCategorie) {
		return service.getCategorie(idCategorie);
	}
	
	
}
