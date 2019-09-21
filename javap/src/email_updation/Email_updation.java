package email_updation;
import java.io.*;
import java.lang.reflect.Array;
public class Email_updation {
	public static String name;
	public static String address;
	public static  String phone;
	public static String email;
	public static String pidt;
	public static String pid;
	public static String c = "y";
	public static String e = "y";
	public static  int i;
	public static  int a[] = new int[25];
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
			break;
		}
	}
	System.out.println("Thank you for  for registering. Your id is "+a[i]);
	System.out.println("Do you want to continue registration (y/n)?");
	e = br.readLine();
	if(c.equals("y")) {
	System.out.println("Do you want to update the email id?(yes/no");
	 e= br.readLine();
	 if(c.equals("y")) {
		 System.out.println("Update Email:");
		 System.out.println("Enter new Email...");
			email = br.readLine();
			System.out.println("Email Updated:");
			System.out.println("Your Details are");
			System.out.println("Name: "+name);
			System.out.println("Address: "+address);
			System.out.println("Contact Number: "+phone);
			System.out.println("Email id: "+email);
			System.out.println("Proof type: "+pidt);
			System.out.println("Proof id: "+pid);
	}
	}
	else
	{
		System.out.println("Your Details are");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Contact Number: "+phone);
		System.out.println("Email id: "+email);
		System.out.println("Proof type: "+pidt);
		System.out.println("Proof id: "+pid);	
	}
	
	}	
}

