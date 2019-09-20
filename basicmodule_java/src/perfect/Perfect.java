package perfect;
import java.io.*;
public class Perfect {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int n,i,sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number ");
		n = Integer.parseInt(br.readLine());
		for(i=1;i<n;i++) {
			if(n%i==0) {
				System.out.print(" "+i);
				sum = sum + i;
			}
		}
		System.out.println("\n");
		if(sum==n) {
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Not perfect");
		}
	}

}
