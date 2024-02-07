package input;
import java.util.Scanner;
public class Input{
public static double takeInput1(){
	Scanner N= new Scanner(System.in);
	System.out.println("Enter your first no");
	double d1= N.nextDouble();
	return d1;
}	
	public static double takeInput2()
{
	Scanner N= new Scanner(System.in);
	System.out.println("Enter your second no");
	double d2=N.nextDouble();
	return d2; 
}
}

