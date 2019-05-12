package com.huios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huios.dao.springdata.CategorieRepository;
import com.huios.dao.springdata.ProduitRepository;
import com.huios.metier.Categorie;
import com.huios.metier.Produit;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private CategorieRepository categoryRepository;
	
	public CategorieRepository getCategoryRepository() {
		return categoryRepository;
	}

	public void setCategoryRepository(CategorieRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public ProduitRepository getProduitRepository() {
		return produitRepository;
	}

	public void setProduitRepository(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}

	@Override
	public void ajouterProduit(Produit p) {
		// TODO Auto-generated method stub
		produitRepository.save(p);
	}

	@Override
	public List<Produit> listerProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public void supprimerProduit(long idProduit) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(idProduit);
	}

	@Override
	public Produit getProduit(long idProduit) {
		// TODO Auto-generated method stub
		return produitRepository.findById(idProduit).get();
	}


	@Override
	public void ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		categoryRepository.save(c);
	}

	@Override
	public List<Categorie> listerCategories() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public void supprimerCategorie(long idCategorie) {
		// TODO Auto-generated method stub
		categoryRepository.deleteById(idCategorie);
	}

	@Override
	public Categorie getCategorie(long idCategorie) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(idCategorie).get();
	}

}
