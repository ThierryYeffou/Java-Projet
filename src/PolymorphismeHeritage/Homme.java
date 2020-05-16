package PolymorphismeHeritage;

public class Homme extends Personne{

	public Homme(String nom, String prenom, int age) {
		super(nom, prenom, age);
		// TODO Auto-generated constructor stub
	}
	
	public void afficher() {
		System.out.println("je suis un homme");
		System.out.println(getNom() +" " + getPrenom() + " " + getAge());
	}

}
