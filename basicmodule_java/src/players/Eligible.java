package players;
import java.io.*;
public class Eligible {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		int n,i,count=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of playerss");
		n = Integer.parseInt(br.readLine());
		int [] a = new int[n];
		
		System.out.println("Enter the number of fouls made by each player");
		for(i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<60)
			{
				count++;
			}
		}
		int min = a[0];
	for(i=0;i<n;i++)
	{
		if(a[i]<min)
		{
			min = a[i];
		}
	}
	System.out.println("The eligible player is player no "+min + "("+count+" fouls)");

}
}
