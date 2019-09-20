package gold;
import java.io.*;
public class Gold { 
	public static void main(String args[]) throws NumberFormatException, IOException {
		int n,k;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the kgs of gold");
		n = Integer.parseInt(br.readLine());
		k=n/5;
		n=n+k+k/5;
		System.out.println("Number of Sculptors can be made is "+n);
	}

}
