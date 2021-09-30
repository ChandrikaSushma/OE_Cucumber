package Product_Cucumber.Product_Cucumber;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 5 factorial of a number 120
		Scanner src = new Scanner(System.in);
		System.out.println("enter no");
		int n = src.nextInt();
		src.close();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i; // fact=1*1=1 // fact=1*2=2 // fact=2*3=6// fact=6*4=24 fact=24*5=120
		}
		System.out.println("factorial of a number" + " " + fact);

	}

}
