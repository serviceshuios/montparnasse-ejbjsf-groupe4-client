package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import com.infotel.ejb.IPersonneRemote;
import com.infotel.metier.Personne;



@ManagedBean
@SessionScoped

public class PersonneBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	// attributs
	@EJB
	private IPersonneRemote service;
	private Personne personne= new Personne();
	private List<Personne> personnes;
	public IPersonneRemote getService() {
		return service;
	}
	public void setService(IPersonneRemote service) {
		this.service = service;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	
	
	

}
