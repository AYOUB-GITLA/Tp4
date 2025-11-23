package com.example2.tp;
import java.util.*;

public class Bibliotheque {
	
	private static int compteur = 0;
    private final int id;
    private String nom;
    private Set<Livre> collection = new HashSet<>();
	/**
	 * @param nom
	 */
	public Bibliotheque(String nom) {
		this.id=compteur++;
		this.nom = nom;
	}
	
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public Set<Livre> getCollection() {
		return collection;
	}
    
	 public void ajouterLivre(Livre livre) {
	        collection.add(livre);
	    }

	 @Override
	 public String toString() {
		 return "Bibliotheque[id=" + id +
	               ", nom=" + nom +
	               ", taille=" + collection.size() +
	               "]";
	 }
	 
    

}
