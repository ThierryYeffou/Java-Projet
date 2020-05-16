package AppliGestionDesEmployes;
import java.util.ArrayList;
public class TestAppli {

	public static void main(String[] args) throws EmployesException {
		// TODO Auto-generated method stub
		ListeEmployes liste = new ListeEmployes();
		
		liste.ajouterEmploye(new Cadre("EDAJ4156", "Thierry", -1, -25000, "Developpeur"));
		liste.ajouterEmploye(new Cadre("EDAJ4156", "Titi", 52, 2500, "Developpeur"));
		liste.ajouterEmploye(new Ouvrier("EDAJ4156", "Pierre", 48, 2500));
		liste.ajouterEmploye(new Cadre("EDAJ4156", "Thierry", 35, 2500, "Developpeur"));
		
		liste.augmenter();
		
		
		liste.affiche();
		
		liste.presenter();
		
		int [] tab = new int [5];
		ArrayList<String> tab1 = new ArrayList<String>();
	}

}
