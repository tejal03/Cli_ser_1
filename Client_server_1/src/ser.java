import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ser {
	
	public static void main(String args[]) throws IOException{
		
		int number,result;
		/*Server accepts connection from client on port number 5000*/
		ServerSocket s1= new ServerSocket(5000);
		Socket ss=s1.accept();
		/*Accept data from the client*/
		Scanner sc = new Scanner(ss.getInputStream());
		number=sc.nextInt();
		/*server increment the number by 1*/
		result = number+1;
		/*send the result to the client*/
		PrintStream pr=new PrintStream(ss.getOutputStream());
		pr.println(result);
		sc.close();
		ss.close();
		s1.close();
	}

}
