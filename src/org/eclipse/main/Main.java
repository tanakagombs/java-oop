package org.eclipse.main;

import org.eclipse.classes.*;


public class Main {

	public static void main(String[] args) {
		
		// deux methodes pour creer un object ou une instance de classe
		Personne p1 = new Personne();
		
		//en passant par les setters
		p1.setId(1);
		p1.setNom("Wick");
		p1.setPrenom("John");
		
		//System.out.println(p1);
		
		//System.out.println(p1.getNom());

		//en passant par les constructeur
		//Personne p2 = new Personne(2, "Doe", "Pat");
		//System.out.println(p2.getPrenom());

	    
		//Addresse a1 = new Addresse("Wraysbury", 78000, "Versailles");
		
		Addresse a2 = new Addresse("Hogwarts", 75000, "Surrey");
		
		//Personne p3 = new Personne(5, "Doee", "Jack", a1);
		
		//System.out.println(p3);
		
		
		Enseignant ens1 = new Enseignant(1, "McGonagall", "Minerva", 1.03);
		
		//System.out.println(ens1);
		
		Personne ens2 = new Enseignant(4, "Snape", "Severus" , a2, 100);
		
		//System.out.println(ens2);
		
		Etudiant etu1 = new Etudiant(1, "Potter", "Harry", "seeker");
		
		//System.out.println(etu1);
		
		Personne etu2 = new Etudiant(4, "Granger", "Hermoine", a2, "Nerd");
		
		//System.out.println(etu2);
		
		ens1.afficherNomMajiscule();
		ens1.afficherPrenomMiniscule();
		
		System.out.println(ens1);
		
		
		Personne [] personnes = {ens1, ens2, etu1, etu2};
		
		for (Personne perso : personnes) {
//			if(perso instanceof Enseignant) {
//				System.out.println(((Enseignant)perso).getSalaire());
//				
//			} else {
//				System.out.println(((Etudiant)perso).getNiveau());
//			}
//			System.out.println(perso.getNom());
			System.out.println(perso);
			}
		
		}

	
	
	
	// double vitesse (double temps, double distance)
	
	//boolean triangle_possible(double c1,double c2, double c3)

	//int PGCD(int n1,int n2)

	//void initiales(String prenom, String nom)
	
	
public static double vitesse (double dist, double temps) {
		
		return dist/temps;
		
		
}	
public static int maximum(int n1, int n2) {
	if (n1>n2)
		return n1;
	return n2;		
		
	}

	

public static String repetition(String mot, int reps) 

{
	String mot_rep = " ";
	
	for (int i =1 ; i <= reps; i++) {
		mot_rep =mot_rep + mot;
	}
	return mot_rep;
}

public int entier(int num_inf, int num_sup) {
	return (int)(Math.random()*(num_sup - num_inf)+ num_inf);
	
}

public static boolean contains(int[] arr, int item) {
	for (int n : arr) {
		if (item == n) {
			return true;
		}
	}
	return false;
	}


}
