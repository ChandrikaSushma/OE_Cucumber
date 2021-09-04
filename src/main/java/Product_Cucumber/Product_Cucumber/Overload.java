package Product_Cucumber.Product_Cucumber;

public class Overload {

	public void test1(int a, int b) {

		System.out.println(a + b);
	}

	public void test1(int a, int b, int c) {

		System.out.println(a + b + c);
		test1(10, 20);
	}

	public static void main(String[] args) {
		Overload o = new Overload();
		o.test1(1, 1, 1);

	}

}
