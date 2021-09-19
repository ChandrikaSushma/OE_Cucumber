package Product_Cucumber.Product_Cucumber;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		int n, r, s = 0;
		Scanner src = new Scanner(System.in);
		System.out.println("enter no");
		n = src.nextInt();
		src.close();
		int t = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			s = s * 10 + r;
		}
		if (t == s)
			System.out.println(s + " " + "number is palidrome");
		else
			System.out.println(s + " " + "number is not a palidrome");

	}

}
