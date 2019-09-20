package auction;
import java.io.*;
public class Auction {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int n,i,max=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of applicants");
		n = Integer.parseInt(br.readLine());
		int [] a = new int[n];
		System.out.println("Enter the amount");
		for(i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println("he winning bid is "+max + " crore");
	}
	

}
