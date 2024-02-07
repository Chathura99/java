import Otherpackage.C; //visibility
public class A{
 public static void main(String[] args){
		B b=new B();  //accessibility
		b.bm1();
		//b.bm2();
		//b.bm3();
		//b.bm4();

		C c=new C();   //accessibility
		c.cm1();
		//c.cm2();
		//c.cm3();
		//c.cm4();
}
}
