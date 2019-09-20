package first;
import java.io.*;
public class First {
	String name;
	String age;
	String degree;
	String branch;
	String mobile;
public First(String name, String age, String degree, String branch, String mobile) {
		this.name=name;
		this.age=age;
		this.degree=degree;
		this.branch=branch;
		this.mobile=mobile;
	}
public static void main(String args[])throws IOException {
	String name;
	String age;
	String degree;
	String branch;
	String mobile;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name");
	name=br.readLine();
	System.out.println("Enter age");
	age=br.readLine();
	System.out.println("Enter degree");
	degree=br.readLine();
	System.out.println("Enter branch");
	branch=br.readLine();
	System.out.println("enter mobile");
	mobile=br.readLine();
	First f = new First(name,age,degree,branch,mobile);
	f.resume(name,age,degree,branch,mobile);
	
}
void resume(String name,String age,String degree,String branch,String mobile) {
	System.out.println("Name : " + this.name);
	System.out.println("Age:" +this.age);
	System.out.println("Degree:"+this.degree);
	System.out.println("Branch:"+this.branch);
	System.out.println("Contact Number"+this.mobile);
	
}
}
