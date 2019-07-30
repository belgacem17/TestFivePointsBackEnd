package com.FivePoints.Test.Entities;

import javax.persistence.*;

@Entity
@Table(name = "vote")
public class Vote {

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "etatVote")
	private boolean etatVote;
	
	@Column(name = "nbreVote")
	private float nbreVote;
	
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Utilisateur utilisateur;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Sujet sujet;

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Sujet getSujet() {
		return sujet;
	}

	public void setSujet(Sujet sujet) {
		this.sujet = sujet;
	}

	public boolean isEtatVote() {
		return etatVote;
	}

	public void setEtatVote(boolean etatVote) {
		this.etatVote = etatVote;
	}

	public float getNbreVote() {
		return nbreVote;
	}

	public void setNbreVote(float nbreVote) {
		this.nbreVote = nbreVote;
	}
}
