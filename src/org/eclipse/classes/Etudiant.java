package org.eclipse.classes;

public class Etudiant extends Personne {
	
	private String niveau;

	public String getNiveau() {
		return niveau;
	}

	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int id, String nom, String prenom,String niveau) {
		super(id, nom, prenom);
		this.niveau = niveau;
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int id, String nom, String prenom, Addresse addresse, String niveau) {
		super(id, nom, prenom, addresse);
		this.niveau = niveau;
		// TODO Auto-generated constructor stub
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	@Override
	public String toString() {
		return super.toString() + "Etudiant [niveau=" + niveau + "]";
	}

}
