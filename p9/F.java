import java.util.Scanner;
import input.Input;              //input-->package name  Input-->class name
import process.Process;
import output.Output;
public class F{
	public static void main(String[] args){
		Input in=new Input();
		Process pr=new Process();
		Output ou=new Output();
ou.giveOutput(pr.doProcess(in.takeInput1(),in.takeInput2()));
}
}
