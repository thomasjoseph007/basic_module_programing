package average;
import java.io.*;
public class Average
{
	public static void main(String args[]) throws NumberFormatException, IOException 
	{
		int n,i,sum=0,avg=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students");
		n = Integer.parseInt(br.readLine());
		int [] a = new int[n];
		System.out.println("Enter the marks of students");
		for(i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			sum = sum + a[i];
		}
		avg = sum /n;
		System.out.println("The average"+avg);
	}

}
