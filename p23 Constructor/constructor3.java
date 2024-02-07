class B{
	public String name;
	B(){
		System.out.println("Hello i'm from B.");
	}
	B(String s){        
		name=s;
	System.out.println("The name is "+name);
	}
	B(String s, int no){
		name=s;
	}
}
class A extends B{
	public String name;
	A(){
		this("A1");     
		System.out.println("Hello i'm from A.");
	}
	A(String name){        
		super(); //meka dammt natat call wennne super ekta
		//super("B");       
		//super("B",10);
		this.name=name;
	}
	public void displayName(){
		System.out.println("The name is "+name);
	}
}
public class constructor3{
	public static void main(String[] args){
		A a1 = new A();
		A a2 = new A("A");
		a1.displayName();
		a2.displayName();
	}
}
/*Output
Hello i'm from B.
Hello i'm from A.
Hello i'm from B.  methanath aaye super class ekta call wenwa
The name is A1
The name is A */