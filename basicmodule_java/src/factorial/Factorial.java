package factorial;
import java.io.*;
public class Factorial {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int n,f=1,i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number alphabets in your name");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			f = f * i;
		}
		System.out.println("The number of combination is "+f);
	}

}
