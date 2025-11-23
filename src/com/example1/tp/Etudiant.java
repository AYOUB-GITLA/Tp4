package com.example1.tp;

public class Etudiant {
	
	private static int compteur = 0;
    private final int id;
    private String nom;
    private String prenom;
    private Filiere filiere;
	/**
	 * @param nom
	 * @param prenom
	 */
	public Etudiant(String nom, String prenom) {
		this.id = ++compteur;
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom 
	            + ", filiere=" + filiere + "]";
	    }
	
    
    

}
