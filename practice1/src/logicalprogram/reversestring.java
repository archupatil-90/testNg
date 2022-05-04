package logicalprogram;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org = "sanjay";
		String rev = "";  //ya

		//5		 3>=0
		for (int i = org.length()-1 ; i>=0; i--) 
		{
			rev = rev + org.charAt(i);  // ya + j
		}
		
		System.out.println(rev);
		

	}

}
