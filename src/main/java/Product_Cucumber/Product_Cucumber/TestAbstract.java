package Product_Cucumber.Product_Cucumber;

abstract class AbstractClass {
	abstract void m1();

	abstract void m2();

	void m3() {
		System.out.println("m3");
	};

}

class NormalClass extends AbstractClass {
	void m2() {
		System.out.println("m2");
	}

	void m1() {
		System.out.println("m1");
	}

	void m4() {
		System.out.println("m4");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
		AbstractClass a = new NormalClass();
		NormalClass b = new NormalClass();
		a.m3();
		a.m1();
		a.m3();
		System.out.println("-----------------");
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}
}
