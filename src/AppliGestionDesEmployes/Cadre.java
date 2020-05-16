package AppliGestionDesEmployes;

public class Cadre extends Employes{
	
	private String fonction;

	public Cadre(String matricule, String nom, int age, int salaire, String fonction) throws EmployesException {
		super(matricule, nom, age, salaire);
		this.fonction= fonction;
		// TODO Auto-generated constructor stub
	}

	public void affiche() {
		System.out.println(super.toString());
	}

	@Override
	public String toString() {
		return "Employes [matricule=" + matricule + ", nom=" + nom + ", age=" + age + ", salaire=" + salaire + ", fonction=" + fonction + "]";
	}

	@Override
	public void augmenter() {
		// TODO Auto-generated method stub
		if (this.age < 35) {
			this.salaire = super.getSalaire() + 200;
		}
		else if (this.age>=35 && this.age<45) {
			this.salaire = super.getSalaire() +300;
		}
		else {
			this.salaire = super.getSalaire() +400;
		}
	}

	@Override
	public void presenter() {
		// TODO Auto-generated method stub
		System.out.println("je suis Cadre");
	}
}
