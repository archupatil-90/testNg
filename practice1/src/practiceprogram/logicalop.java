package practiceprogram;

public class logicalop {

	public static void main(String[] args) {
		int age=18;
		char bldgrp='A';
		boolean res1,res2;
		res1=(age>18);
		res2=(bldgrp=='A');
		System.out.println("result1" +res1);
		System.out.println("result2" +res2);
		System.out.println("bool1 && bool2"  +(res1 && res2));
		System.out.println("reslt for or operator is" +(res1 ||res2));
		System.out.println("reslt for not operator is"+ !(res1 && res2));
		
		
		

	}

}
