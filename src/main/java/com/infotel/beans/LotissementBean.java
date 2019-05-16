package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import com.infotel.ejb.ILotissementRemote;
import com.infotel.metier.Lotissement;



@ManagedBean
@SessionScoped

public class LotissementBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	// attributs
	@EJB
	private ILotissementRemote service;
	private Lotissement lotissement = new Lotissement();
	private List<Lotissement> lotissements;
	public ILotissementRemote getService() {
		return service;
	}
	public void setService(ILotissementRemote service) {
		this.service = service;
	}
	public Lotissement getLotissement() {
		return lotissement;
	}
	public void setLotissement(Lotissement lotissement) {
		this.lotissement = lotissement;
	}
	public List<Lotissement> getLotissements() {
		return lotissements;
	}
	public void setLotissements(List<Lotissement> lotissements) {
		this.lotissements = lotissements;
	}
	// méthodes
		public void ajouterLotissement() {
			service.ajouterLotissement(lotissement);
		}
		public List<Lotissement> findAllLotissements() {
			return service.findAllLotissements();
		}
		public void supprimerLotissement(Lotissement l) {
			service.supprimerLotissement(lotissement);
		}
		public Lotissement getLotissement(long idLot) {
			return service.getLotissement(idLot);
		}
	
}
