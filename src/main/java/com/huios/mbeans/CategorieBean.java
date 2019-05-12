package com.huios.mbeans;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.huios.metier.Categorie;
import com.huios.metier.Produit;
import com.huios.service.Iservice;

@Controller
@ManagedBean
//@SessionScoped
@RequestScoped
public class CategorieBean {
	
	// attributs
	@Autowired
	private Iservice service;
	
	private Categorie categorie = new Categorie();

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
