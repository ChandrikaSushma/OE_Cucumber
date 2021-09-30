package Product_Cucumber.Product_Cucumber;

public class Prime {

	public static void main(String[] args) {
		int n = 4, status = 0;

		for (int i = 2; i < n; i++) {
			status = 0;
			if (n % i == 0) {
				status = 1;
				break;
			}
		}

		if (status == 0)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");

	}

}
