import java.io.*;
import java.net.*;
public class Server04 {
        static ServerSocket ss;
        static String str; 
    	public static void main(String[] args){
            try{
                ss=new ServerSocket(6666);
            }catch(Exception e){
                System.out.println(e);
            }
            do{
                System.out.println("Server is running...");
	            try{//ServerSocket ss=new ServerSocket(6666);
		            Socket s=ss.accept();//establishes connection
		            DataInputStream dis=new DataInputStream(s.getInputStream());
		            str=(String)dis.readUTF();
		            System.out.println("The message Recieved from Client was= "+str);
		            s.close();
                    //ss.close();
	            }catch(Exception e){
            		System.out.println(e);
                }
                if(str.equals("shutdown")){
                    try{                    
                        ss.close();
                    }catch(Exception e){
            		    System.out.println(e);
                    }
                    System.out.println("Server shuted down..., by client");
                    break;
                }
            }while(true);
	    }
}
