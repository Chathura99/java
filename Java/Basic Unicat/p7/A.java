public class A {
	public static void main(String[] args){
		byte b1= 126;
		byte b2= 1;
		byte b3= (byte)(b1+b2);
	System.out.printf("%05d \n %03d \n %07d \n",b3,b1,b2);
	System.out.println(b3+"\n"+b1+"\n"+b2);
	}
}

//byte -128 : +127