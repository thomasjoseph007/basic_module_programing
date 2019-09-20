package height;
import java.util.Scanner;
public class Height {
public static void main(String args[]) {
	int n,i,j;
	float temp;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number");
	n = s.nextInt();
	System.out.println("Enter the heights");
	float arr[] = new float[n];
	
	for(i=0;i<n;i++)
	{
	arr[i] = s.nextFloat();  
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(arr[i]<arr[j])
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("After Sorting");
	for(i=0;i<n;i++)
	{
	System.out.println(arr[i]);  
	}
}
}
