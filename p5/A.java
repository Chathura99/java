public class A {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		c.setp(b.getprice());
		System.out.println(" The value p is " + c.p);
	}
}

class B {
	public float price = 70.5f;

	public float getprice() {
		return price;
	}

}

class C {
	public float p;

	public void setp(float f) {
		p = f;
	}
}