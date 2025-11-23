package com.example1.tp;

import java.util.Arrays;

public class Filiere {
	
	private static int compteur = 0;
    private final int id;
    private String nom;
    private Etudiant[] etudiants;
    private int nbEtudiants;
	/**
	 * @param nom
	 */
	public Filiere(String nom) {
		this.id = ++compteur;
		this.nom = nom;
		this.etudiants = new Etudiant[5]; 
        this.nbEtudiants = 0;
	}
	public int getId() {
		return id;
	}
	public Etudiant[] getEtudiants() {
		return etudiants;
	}
	public int getNbEtudiants() {
		return nbEtudiants;
	}
	public void setEtudiants(Etudiant[] etudiants) {
		this.etudiants = etudiants;
	}
	public void setNbEtudiants(int nbEtudiants) {
		this.nbEtudiants = nbEtudiants;
	}
	  public void ajouterEtudiant(Etudiant e) {
	        if (nbEtudiants == etudiants.length) {
	            Etudiant[] tmp = new Etudiant[etudiants.length * 2];
	            System.arraycopy(etudiants, 0, tmp, 0, etudiants.length);
	            etudiants = tmp;
	        }
	        etudiants[nbEtudiants++] = e;
	        e.setFiliere(this);
	    }

	    public void afficherEtudiants() {
	        System.out.println("Filiere " + nom + " (id=" + id + ") → " + nbEtudiants + " étudiants :");
	        for (int i = 0; i < nbEtudiants; i++) {
	            System.out.println("  • " +
	                etudiants[i].getNom() + " " +
	                etudiants[i].getPrenom() +
	                " (id=" + etudiants[i].getId() + ")"
	            );
	        }
	    }
		@Override
		public String toString() {
			return "Filiere [id=" + id +
			           ", nom=" + nom +
			           ", nbEtudiants=" + nbEtudiants +
			           "]";
		}
    

}
