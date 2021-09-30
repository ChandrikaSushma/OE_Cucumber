package Product_Cucumber.Product_Cucumber;

public class FabonacciSeries {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 55
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2); // 0 1
		for (int i = 2; i <= 10; i++) {
			sum = n1 + n2; // s= 0+1 = 1 // 1+1 = 2
			System.out.print(" " + sum); // 1 //2
			n1 = n2; // n1=1 //1
			n2 = sum; // n2 = 1 //2
		}

	}

}
