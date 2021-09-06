package Product_Cucumber.Product_Cucumber;

interface TestInterface {
	int a = 10;

	void m1();

	void m2();
}

class test implements TestInterface {
	public void m1() {
		System.out.println("m1");

	}

	public void m2() {
		System.out.println("m2");

	}

	public void m3() {
		System.out.println("m3");

	}
}

public class Interface {
	public static void main(String[] args) {
		TestInterface i = new test();
		test t = new test();
		i.m1();
		i.m2();
		System.out.println("----------------------");
		t.m1();
		t.m2();
		t.m3();
	}

}
