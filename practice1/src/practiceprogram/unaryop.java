package practiceprogram;

public class unaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b;
		System.out.println("value of a is" + a);
		b = a++ + ++a + a++ + a;
		System.out.println("value of a is" + a);
		System.out.println("value of b is" + b);
		
		a=0;
		b=--a +--a + -- a + a + ++a + a++  ;
		//1+-2+-3+-3+-2+-2=-13
		
		System.out.println("value of a is" + a);
		System.out.println("value of b is" + b);
		a=0;
		b=a-- +a + ++a + a++ + ++a +a++ +a;
		//0+-1+0+0+2+2+3=6
		//-1+4=3
		System.out.println("value of a is" + a);
		System.out.println("value of b is" + b);
			
		
	}

}
