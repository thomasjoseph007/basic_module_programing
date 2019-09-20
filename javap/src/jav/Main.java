package jav;
import java.io.*;
import java.io.BufferedReader;
public class Main {


	
	
	public static void main(String[] args)throws IOException

	{
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofId;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Your Name...");
		name = br.readLine();
		System.out.println("Enter Your Address...");
		address = br.readLine();
		System.out.println("Enter Your Number...");
		contactNumber = br.readLine();
		System.out.println("Enter Your Email...");
		email = br.readLine();
		System.out.println("Enter Your Proof TypeT...");
		proofType = br.readLine();
		System.out.println("Enter Your Proof ID...");
		proofId = br.readLine();
		Customer customer = new Customer(name, address, contactNumber, email, proofType, proofId);
		customer.register(name, address, contactNumber, email, proofType, proofId);

	}

	
}