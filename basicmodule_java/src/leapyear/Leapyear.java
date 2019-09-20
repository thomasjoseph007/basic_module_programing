package leapyear;
import java.io.*;
public class Leapyear {
public static void main(String args[]) throws NumberFormatException, IOException
{
	int y;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a year");
	y = Integer.parseInt(br.readLine());
	if((y%4==0) && (y%100!=0)||(y%400==0)) {
		
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
	
}
}
