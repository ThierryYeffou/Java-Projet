package AppliGestionDesEmployes;

import java.util.ArrayList;

public class ListeEmployes {
	
	private Employes [] liste;
	//private int [] tab;
	//private ArrayList<Employes> tab;
	private int nombreEmploye ;
	
	public ListeEmployes() {
		this.nombreEmploye = 0;
		this.liste = new Employes [1000];	
	}
	
	public void ajouterEmploye(Employes e) {
		this.liste[nombreEmploye] = e;
		this.nombreEmploye++;
	}
	
	public void affiche() {
		for (int i=0; i<this.nombreEmploye; i++) {
			System.out.println(this.liste[i]);
		}
	}
	
	public void augmenter() {
		for (int i=0; i<this.nombreEmploye; i++) {
			liste[i].augmenter();
		}
	}
	
	public void presenter() {
		// TODO Auto-generated method stub
		for (int i=0; i<this.nombreEmploye; i++) {
			liste[i].presenter();
		}
	}

}
