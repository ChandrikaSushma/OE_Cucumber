package Product_Cucumber.Product_Cucumber;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.err.println("enter no:");
		int n = src.nextInt();
		src.close();
		for (int i = 0; i <= n; i++) {
			// even
			if (i % 2 == 0)
				System.out.println(i + "even");
			// odd
			else
				System.out.println(i + "odd");
		}

	}

}
