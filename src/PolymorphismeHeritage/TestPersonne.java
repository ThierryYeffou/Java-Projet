package PolymorphismeHeritage;

import java.util.ArrayList;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Personne>tab = new ArrayList<Personne>();
		tab.add(new Homme("Thierry","Henri",26));
		tab.add(new Homme("Jilles","pierre",14));
		tab.add(new Femme("Giselle","berlise",18));
		
		for(Personne p : tab) {
			p.afficher();
		}

	}

}
