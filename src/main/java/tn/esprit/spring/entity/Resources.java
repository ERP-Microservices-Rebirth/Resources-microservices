package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resources implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	public Long cin;
	public String nomEmploye;
	public String numTel;
	public String specialité;
	public int nbHeureTravail;
	public Long getCin() {
		return cin;
	}
	public void setCin(Long cin) {
		this.cin = cin;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getSpecialité() {
		return specialité;
	}
	public void setSpecialité(String specialité) {
		this.specialité = specialité;
	}
	public int getNbHeureTravail() {
		return nbHeureTravail;
	}
	public void setNbHeureTravail(int nbHeureTravail) {
		this.nbHeureTravail = nbHeureTravail;
	}
	public Resources(Long cin, String nomEmploye, String numTel, String specialité, int nbHeureTravail) {
		super();
		this.cin = cin;
		this.nomEmploye = nomEmploye;
		this.numTel = numTel;
		this.specialité = specialité;
		this.nbHeureTravail = nbHeureTravail;
	}
	public Resources(String nomEmploye, String numTel, String specialité, int nbHeureTravail) {
		super();
		this.nomEmploye = nomEmploye;
		this.numTel = numTel;
		this.specialité = specialité;
		this.nbHeureTravail = nbHeureTravail;
	}
	public Resources() {
		super();
	}
	@Override
	public String toString() {
		return "Resources [cin=" + cin + ", nomEmploye=" + nomEmploye + ", numTel=" + numTel + ", specialité="
				+ specialité + ", nbHeureTravail=" + nbHeureTravail + "]";
	}
	
	

}
