package org.eclipse.classes;

public class Addresse {

	private String rue;
	private int codePostal;
	private String ville;

	public Addresse() {
		super();
	}

	public Addresse(String rue, int codePostal, String ville) {
		super();
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Addresse [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}

}
