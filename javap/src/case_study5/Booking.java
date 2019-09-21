package case_study5;
import java.io.*;
import java.lang.reflect.Array;
public class Booking {
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
public static int b[] = new int[26];
public static String date[] = new String[26];
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
			break;
		}
	
	}
	System.out.println("Thank you for  for registering. Your id is "+a[i]);
	System.out.println("Do you want to booking(y/n)?");
	c = br.readLine();
	if(c.equals("y")) {
		book();
	}
	else {
		view();
	}
	}
	
	while(c.equalsIgnoreCase("y"));	
}
public static void book() throws IOException{
	String ac,cot,cable,wifi,laundary,e="Not enabled",wi="Not enabled",la="without",ya,da,c="y";
	int av,cv,cav,wv,lv,tv,i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	do {
	System.out.println("Booking ");
	System.out.println("Please choose the services required.AC/non-AC(AC/nAC)");
	ac = br.readLine();
	System.out.println("Cot(Single/Double)");
	cot = br.readLine();
	System.out.println("With cable connection/without cable connection(C/nC)");
	cable = br.readLine();
	System.out.println("Wi-Fi needed or not(W/nW)");
	wifi = br.readLine();
	System.out.println("Laundry service needed or not(L/nL)");
	laundary = br.readLine();
	System.out.println("Enter the date of booking");
	da = br.readLine();
	if(ac.equals("AC")) {
		av=100;
	}
	else
	{
		av=50;
	}
	if(cot.equals("Double")) {
		cv=100;
	}
	else
	{
		cv=50;
	}
	if(cable.equals("C")) {
		cav=100;
		e = "enabled";
	}
	else
	{
		cav=0;
	}
	if(wifi.equals("W")) {
		wv=100;
		wi="enabled";
	}
	else
	{
		wv=0;
	}
	if(laundary.equals("L")) {
		lv=100;
		la = "with";
	}
	else
	{
		lv=0;
	}
	
	tv = av+cv+cav+wv+lv;
	System.out.println(" The total charge is Rs. "+tv);
	System.out.println(" The services chosen are ");
	System.out.println(cot+" cot "+ac+" room ");
	System.out.println("cable connection "+e);
	System.out.println("wifi connection "+wi);
	System.out.println(la+" landaury service ");
	System.out.println(" Do you want to proceed ? ");
	ya = br.readLine();
	if(ya.equals("y")) {			
		for(i=1;i<=25;i++) {
			if(b[i]==0) {
				Array.setInt(b, i, i); 
				Array.set(date, i, da);
				break;
			}
		}
		System.out.println("Thank you for booking. Your room number is "+b[i]);
		System.out.println("Thank you for booking. Your room number is "+date[i]);
		System.out.println("Do you want to continue registration (y/n)?");
		c = br.readLine();
		if(c.equals("y")) {
			register();
		}
		else {
			view();
		}
	}	
}		while(c.equalsIgnoreCase("y"));
	
}
public static void view()throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String edate,eda;
	System.out.println("View all booking");
	System.out.println("Enter the start date");
	edate = br.readLine();
	System.out.println("Enter the end date ");
	eda= br.readLine();
	for(i=1;i<=25;i++) {
		if((date[i]=="edate")&&(date[i++]=="eda")){
			System.out.println("Thank you for booking. Your room number is "+b[i]);
				System.out.println(date[i]);
			
		}
	}
	System.exit(0);
}	

}
