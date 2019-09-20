package armstrong;
import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		int n,temp,a,count=0;
		double c=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = s.nextInt();
		temp = n;
		int m =n;
		while(n!=0)
		{
			n = n/10;
			count++;
		}
		while(m!=0)
		{
			a = m % 10;
			c=c+Math.pow(a, count);
			m = m /10;
		}
		//System.out.println(c);
		//System.out.println(count);

		if (c==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not");
		}
		
	}

}
