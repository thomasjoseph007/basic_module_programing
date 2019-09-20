package sum;
import java.io.*;
public class Sum {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		int n,sum=0,i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		n = Integer.parseInt(br.readLine());
		
		if(n<0)
		{
			System.out.println("Enter a number");
			n = Integer.parseInt(br.readLine());
			for(i=1;i<=n;i++)
			{
				sum = sum + i;
			}
		}
		else
		{
		for(i=1;i<=n;i++)
		{
			sum = sum + i;
		}
		}
		System.out.println("The sum is "+sum);
	}

}
