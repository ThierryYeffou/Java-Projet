package heritage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle c1 = new Cercle(3);
		//System.out.println(c1.getAire());
		
		Cylindre cy = new Cylindre();
		Cylindre cy1 = new Cylindre(5);
		Cylindre cy2 = new Cylindre(3,9);
		System.out.println(cy.getVolume());
		System.out.println(cy1.getVolume());
		System.out.println(cy2.getVolume());

	}

}
