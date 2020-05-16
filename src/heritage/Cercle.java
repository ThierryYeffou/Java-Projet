package heritage;

public class Cercle {
	private double r;
	private double s;
	
	public Cercle() {
		r= 1 ;
	}
	public Cercle(double r) {
		this.r=r;
	}
	
	public double getRayon() {
		return r;
	}
	public void setRayon(double r) {
		if (r < 10) {
			this.r=r;
		}	
		else {
			System.out.println("erreur valeur doit être plus petite que 10");
		}
	}
	
	public double getAire() {
		return Math.PI * Math.sqrt(r);
	}

}
