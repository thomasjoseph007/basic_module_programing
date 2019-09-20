package case_study2;
import java.io.*;
import java.lang.reflect.Array;
public class Casestudy {
	public static  int a[] = new int[25];
public static void main(String args[]) throws NumberFormatException, IOException {
	int n;	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	do {		
	System.out.println("1 for Booking");
	System.out.println("2 for Check Status");
	System.out.println("3 for Exit ");
	System.out.println("Enter Your Choice...");
	n=Integer.parseInt(br.readLine());
	switch (n) {
	case 1:
		book();
		break;
	case 2:
		checking();
		break;
	case 3:
		System.exit(0);
		break;
	}
	}while(n!=3);
}
public static void checking() throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int r,i;
	System.out.println("Checking ");
	System.out.println("Enter room number ");
	r = Integer.parseInt(br.readLine());
	for(i=1;i<=r;i++) {
		if((a[i]==i)&&(r==i))
		{
			System.out.println("Room number " + r+" is booked.");
		}
		else
		{
			System.out.println("Room number " + r+" is not booked.");
		}
	}	
}
public static void book() throws IOException {
	String ac,cot,cable,wifi,laundary,e="Not enabled",wi="Not enabled",la="without",ya;
	int av,cv,cav,wv,lv,tv,i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
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
	if(ya.equals("yes")) {			
		for(i=1;i<=25;i++) {
			if(a[i]==0) {
				Array.setInt(a, i, i); 
				break;
			}
		}
		System.out.println("Thank you for booking. Your room number is "+a[i]);
	}	
}
}
