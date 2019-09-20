package toll;
import java.io.*;
public class Toll {
	public static void main(String args[]) throws NumberFormatException, IOException 
	{
		int n,i,count=0,f=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of vehicles");
		n = Integer.parseInt(br.readLine());
		int [] a = new int[n];
		System.out.println("Enter the fare collected for each vehicles");
		for(i=0;i<n;i++)
		{
			a[i] = Integer.parseInt(br.readLine());
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>50)
			{
				count++;
			}
		}
		for(i=0;i<n;i++)
		{
			if((a[i]<50)&&(a[i]>0))
			{
				f++;
				//break;
			}
		}
		//System.out.println(f);
		System.out.println("TNumber of heavy vehicles "+count + "and the number of light weight vehicles is "+f);
}
}