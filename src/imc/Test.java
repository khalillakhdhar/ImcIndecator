package imc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1=new Personne(52, 1.80);
		System.out.println(p1.imc());
		System.out.println(p1.interpretation());
		Maths m=new Maths();
		m.setX(12);
		m.setY(9);
		System.out.println(m.toString());
	}

}
