package Product_Cucumber.Product_Cucumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i, j, n, count;
		Scanner src = new Scanner(System.in);
		System.out.println("enter no:");
		n = src.nextInt();
		src.close();
		for (i = 2; i <= n; i++) {
			count = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					count = 1;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i + "prime");
			}

		}

	}

}