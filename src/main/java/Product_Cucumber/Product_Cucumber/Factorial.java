package Product_Cucumber.Product_Cucumber;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("enter no");
		int n = src.nextInt();
		src.close();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of a number" + " " + fact);

	}

}
