package practiceprogram;

public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=2;
		double a;
		float r=7.5f;
		double p=100000;
		System.out.println("calculate interest" );
		a = (p*r*t)/100;
		System.out.println(a);
		a=p*(1+r*t);
		System.out.println(a);

	}

}
