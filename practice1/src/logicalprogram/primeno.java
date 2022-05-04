package logicalprogram;

public class primeno {

	public static void main(String[] args) {
		int num = 55;
		int count = 0;   //5<5
		for (int i = 2; i < num ; i++) {
			// 5%4=1==0
			if (num % i == 0) {
				count++;
				break;
			}
		}

		if (count ==1) {
			System.out.println("given number is not a prime number");
		} else {
			System.out.println("given number in a prime number");
		}


	}

}
