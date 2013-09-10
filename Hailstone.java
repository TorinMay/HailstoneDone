import java.util.Scanner;

public class Hailstone {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Please enter a positive interger: ");
		int n = reader.nextInt();
		oddoreven();
		
	}


	public static void oddoreven(int i, int n) {
		if((n%2)==0) {
			return even;
		}else {
			return odd;
		}
		for (i==n;i>0;n) {
			int n = n / 2;
			return n;
			System.out.println("Even, next value is " + n + "/2");
		}
		for (i!=n;i>0;n) {
			int n = (3*n) + 1;
			return n;
			System.out.println("Odd, next value is 3*" + n + "+1");
		}
		if (n == 1) {
			System.out.println("Stop Calculation");
		}
	}

	}
	
}