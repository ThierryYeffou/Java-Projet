package heritage;

public class Cylindre extends Cercle{
	
	private double h;
	
	public Cylindre(double r, double h) {
		super(r);
		this.h=h;
	}
	public Cylindre() {
		super();
		//h=2;
	}
	public Cylindre(double r) {
		super(r);
		//h=2;
	}
	
	public double getHauteur() {
		return this.h;
	}
	
	public double getVolume() {
		return getAire() * getHauteur();
	}

}
