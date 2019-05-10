package com.huios.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope("prototype")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduit;
	@NotEmpty(message = "veuillez saisir le nom du produit")
	@Size(min=4,max=12, message = "le nom du produit doit être compris entre 4 et 12 caractères") 
	private String nomProduit;
	@Min(value=100, message="la quantite minimale est de 100")
	private int quantite;
	@DecimalMin(value="2", message="le prix minimal est de 2")
	private double prix;
	@ManyToOne
	//on initialise ca categorie pour éviter l'erreur target unreachable 
	private Categorie categorie = new Categorie();
	public long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
}
