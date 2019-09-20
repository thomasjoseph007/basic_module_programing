package retest;
import java.io.*;
public class Retest {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		int n,i,count=0;
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
			if(a[i]<50)
			{
				count++;
			}
		}
		System.out.println("Number of students appearing for retest is"+count);
	}

}
