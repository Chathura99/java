class B{
	B(){
		System.out.println("Hello i'm from B.");
	}
}
class A extends B{
	A(){
		super();
		System.out.println("Hello i'm from A overridden constructor.");
	}
}
public class constructor1{
	public static void main(String[] args){
		A a1 = new A();
	}
}