import pack1.C;
import pack1.pack2.B;
public class A{
 public static void main(String[] args){
		 C c=new C();  
		c.mc1();
}
}
//javac -d .\ C.java
//javac -d .\ B.java
//javac -cp .\ -d .\ A.java
//java A
// ".\"--->This file
// "../p_"--->Other file(path)