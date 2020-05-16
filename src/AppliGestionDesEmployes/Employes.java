package AppliGestionDesEmployes;

public abstract class Employes {
	
	protected String matricule;
	protected String nom;
	protected int age;
	protected int salaire;
	
	public Employes(String matricule, String nom, int age, int salaire) throws EmployesException{
		this.matricule = matricule;
		this.nom = nom;
		try {
			if(age<0) {
				throw new EmployesException();
			}
			this.age = age;
		}catch(EmployesException a) {
			a.ageException();
		}
		try {
			if(salaire<0) {
				throw new EmployesException();
			}
			this.salaire = salaire;
		}catch(EmployesException s) {
			s.salaireException();
		}
		
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	public void affiche() {
		//use toString to show propertie in class Employes
		System.out.println(this.toString());
	}
	public abstract void presenter();
	public abstract void augmenter();

	@Override
	public String toString() {
		return "Employes [matricule=" + matricule + ", nom=" + nom + ", age=" + age + ", salaire=" + salaire + "]";
	}
	
	
	
	

}
