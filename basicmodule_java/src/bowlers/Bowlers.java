package bowlers;
import java.io.*;
public class Bowlers {
public static void main(String args[]) throws NumberFormatException, IOException
{
int n,i,count=0;
float sum=0,avg,temp;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of bowlers");
n = Integer.parseInt(br.readLine());
int [] a = new int[n];
System.out.println("Enter the runs conceded by the bowlers");
for(i=0;i<n;i++)
{
	a[i] = Integer.parseInt(br.readLine());
}
int [] b = new int[n];
System.out.println("Enter the number of balls for each bowler");
for(i=0;i<n;i++)
{
	b[i] = Integer.parseInt(br.readLine());
}
System.out.println("Economy of the bowlers is");
float [] run = new float[n];
for(i=0;i<n;i++)
{
	 temp= b[i]/6;
	 run[i] = a[i] /temp;
	 System.out.printf("%.1f\n",run[i]);
}
for(i=0;i<n;i++)
{
	sum = sum + run[i];
}
avg = sum /n;
System.out.println("The overall economy of the teanm is"+avg);
for(i=0;i<n;i++)
{
	if(run[i]<=5)
	{
		count++;
	}
}
System.out.println("The number of bowlers eligible are "+count);
}
}
