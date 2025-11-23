package com.example.tp;

public class Main {

	public static void main(String[] args) {
		 Etudiant e1 = new Etudiant("Ayoub", "Lahmimsi");
	        Etudiant e2 = new Etudiant("Khalil", "Taha");

	        e1.ajouterNote(14.5);
	        e1.ajouterNote(15.5);
	        e1.ajouterNote(16.5);

	        e2.ajouterNote(10.0);
	        e2.ajouterNote(13.5);

	        e1.afficherNotes();
	        System.out.println(e1);

	        e2.afficherNotes();
	        System.out.println(e2);
	}

}
