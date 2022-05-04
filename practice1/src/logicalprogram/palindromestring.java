package logicalprogram;

public class palindromestring {

	public static void main(String[] args) {
		String org = "abcba11";
		String rev = "";

		for (int i = org.length() - 1; i >= 0; i--) 
		{
			rev = rev + org.charAt(i);
		}
		System.out.println("original string is: " + org);
		System.out.println("reverse string is:  " + rev);
		
		if (org.equals(rev)) {
			System.out.println("Given string is palindrome ");
		} else {
			System.out.println("given string is not palindrome");
		}


	}

}
