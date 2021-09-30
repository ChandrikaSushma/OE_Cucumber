package Product_Cucumber.Product_Cucumber;

import java.util.Scanner;

public class PalidromeString {

	public static void main(String[] args) {
		int r, s = 0;
		Scanner src = new Scanner(System.in);
		System.out.println("enter no");
		String n = src.next();
		src.close();
		String data = n; // madam
		String rev = "";
		int len = n.length(); // 5
		for (int i = len - 1; i >= 0; i--) { // 4 //3 //2 //1 //0
			rev = rev + n.charAt(i); // m //a //d //a //m
		}
		if (rev.equals(data))
			System.out.println(data + " " + "is plaindrome");
		else
			System.out.println(data + " " + " is not plaindrome");

	}
}
