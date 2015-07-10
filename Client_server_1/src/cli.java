import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class cli {

	public static void main(String args[]) throws UnknownHostException, IOException{
		
		int number,result;
		/*accept the input from client*/
		Scanner sc= new Scanner(System.in);
		Socket s= new Socket("localhost",5000);
		/*accept the message from server using sc1 object*/
		Scanner sc1=new Scanner(s.getInputStream());
		System.out.println("Enter any number");
		number = sc.nextInt();
		/*pass the number to the server using s object*/
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(number);
		/*accept the result from server using sc1 object*/
		result=sc1.nextInt();
		System.out.println(result);
		sc.close();
		sc1.close();
		s.close();
		
	}
}
