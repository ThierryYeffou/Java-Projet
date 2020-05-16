package PolymorphismeHeritage;

public class Femme extends Personne{

	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}
	
	public void afficher() {
		System.out.println("je suis une femme");
		System.out.println(getNom() +" " + getPrenom() + " " + getAge());
	}


}
