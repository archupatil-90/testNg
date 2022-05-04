package logicalprogram;

import java.util.Scanner;

public class armstrongno {

	public static void main(String[] args) {
		System.out.println("enter number: ");
		Scanner scan = new Scanner(System.in);
		int OrgNum = scan.nextInt();    // 145
	
		int sum = 0; //125
		           // 145   1>0      145/10 = 14/10 = 1/10
		for (int i = OrgNum; i > 0; i = i / 10)
		{
			int	rem = i % 10;    // 1%10= 1
			sum = sum + (rem * rem * rem);  // 125 + 64 = 189 +1 =190
		}

		if (OrgNum == sum) {
			System.out.println("given number " + OrgNum + " is an armstrong number");
		} else {
			System.out.println("given number " + OrgNum + " is not an armstrong number");
		}


	}

}
