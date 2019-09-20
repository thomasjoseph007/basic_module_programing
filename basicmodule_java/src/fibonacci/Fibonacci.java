package fibonacci;
import java.io.*;
public class Fibonacci {
public static void main(String args[]) throws NumberFormatException, IOException {
	int n1=0,n2=1,n,n3,i;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number");
	n=Integer.parseInt(br.readLine());
	System.out.print("The fibonacci series is ");
	System.out.print(n1+" "+n2);
	for(i=2;i<=n;i++)
	{
		
		n3 = n1 + n2;
		System.out.print(" "+n3);
		n1 = n2;
		n2 = n3;
	}
}
}
