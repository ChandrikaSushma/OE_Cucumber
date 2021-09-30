package Product_Cucumber.Product_Cucumber;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
//121
		int n, r, s = 0;
		Scanner src = new Scanner(System.in);
		System.out.println("enter no");
		n = src.nextInt();
		src.close();
		int t = n;
		while (n > 0) { // n=121 -----------12---------------1
			r = n % 10; // r=121%10=1 ---- 2 -----------1
			n = n / 10; // n=121/10=12 ----1 ----------0
			s = s * 10 + r; // s=0*10+1=1 -----12 ---------121
		}
		if (t == s)
			System.out.println(s + " " + "number is palidrome");
		else
			System.out.println(s + " " + "number is not a palidrome");

	}

}
