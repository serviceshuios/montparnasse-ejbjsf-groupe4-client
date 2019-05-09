package com.huios.service;

import java.util.List;

import com.huios.metier.Categorie;
import com.huios.metier.Produit;

public interface Iservice {

	public void ajouterProduit(Produit p);
	public List<Produit> listerProduits();
	public void supprimerProduit(long idProduit);
	public Produit getProduit(long idProduit);
	
	public void ajouterCategorie(Categorie c);
	public List<Categorie> listerCategories();
	public void supprimerCategorie(long idCategorie);
	public Categorie getCategorie(long idCategorie);
	
}
