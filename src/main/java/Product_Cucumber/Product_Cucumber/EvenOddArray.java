package Product_Cucumber.Product_Cucumber;

public class EvenOddArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// for loop
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i] + " " + "even");
		}
		// enhanced for loop
		for (int j : a) {
			if (j % 2 != 0)
				System.out.println(j + " " + "odd");
		}
		for (int j : a) {
			if (j % 2 != 0)
				System.out.println(j + " " + "odd");
		}

	}
}
