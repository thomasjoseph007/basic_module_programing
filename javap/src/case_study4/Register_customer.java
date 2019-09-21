package case_study4;
import java.io.*;
import java.lang.reflect.Array;
public class Register_customer {
	public static String name;
	public static String address;
	public static  String phone;
	public static String email;
	public static String pidt;
	public static String pid;
	public static String c = "y";
	public static String e = "y";
	public static  int i;
	
	public static  int f=1;
	public static  int a[] = new int[26];
	public static String b[] = new String[26];
	public static void main(String args[]) throws NumberFormatException, IOException {
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("1 Registration");
			System.out.println("2 Exit ");
			System.out.println("Enter Your Choice...");
			n=Integer.parseInt(br.readLine());
			switch (n) {
			case 1:
				register();
				break;
			case 2:
				System.exit(0);
				break;
			}
		}
	public static void register() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println("Enter Your Name...");
		name = br.readLine();
		System.out.println("Enter Your Address...");
		address = br.readLine();
		System.out.println("Enter Your Number...");
		phone = br.readLine();
		System.out.println("Enter Your Email...");
		email = br.readLine();
		System.out.println("Enter Your Proof TypeT...");
		pidt = br.readLine();
		System.out.println("Enter Your Proof ID...");
		pid = br.readLine();
		for(i=1;i<=25;i++) {
			if(a[i]==0) {
				Array.setInt(a, i, i); 
				Array.set(b, i, name);
				break;
			}
		
		}
		System.out.println("Thank you for  for registering. Your id is "+a[i]);
		System.out.println("Do you want to continue registration (y/n)?");
		c = br.readLine();
		
		
		}
		while(c.equalsIgnoreCase("y"));
		
		System.out.println("Customers list ");
		System.out.println("The registered customers are ");
		for( int i=1;i<=25;i++) {
			if(a[i]==i) {
				System.out.println(a[i]+" "+b[i]);
				
			}
		}
	}
}
