package org.eclipse.classes;

import org.eclipse.interfaces.*;
public class Personne implements IMiseEnForme{

	private int id;
	private String nom;
	private String prenom;
	private Addresse addresse;

	public Personne() {
		super();
	}

	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(int id, String nom, String prenom, Addresse addresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.addresse = addresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Addresse getAddresse() {
		return addresse;
	}

	public void setAddresse(Addresse addresse) {
		this.addresse = addresse;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", addresse=" + addresse + "]";
	}

	@Override
	public void afficherNomMajiscule() {
		System.out.println(nom.toUpperCase());
	}
	@Override
		public void afficherPrenomMiniscule() {
			System.out.println(prenom.toLowerCase());
					
		}
}