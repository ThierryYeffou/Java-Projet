package AppliGestionDesEmployes;

public class Ouvrier extends Employes {

	public Ouvrier(String matricule, String nom, int age, int salaire) throws EmployesException {
		super(matricule, nom, age, salaire);
		// TODO Auto-generated constructor stub
	}
	
	public void affiche() {
		System.out.println(super.toString());
	}

	@Override
	public void augmenter() {
		// TODO Auto-generated method stub
		this.salaire = super.getSalaire() + 100;
		//super.setSalaire(super.getSalaire() +100);
	}

	@Override
	public void presenter() {
		// TODO Auto-generated method stub
		System.out.println("je suis Ouvrier");
	}

}
