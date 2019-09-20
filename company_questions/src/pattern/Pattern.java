package pattern;
public class Pattern {
	public static void main(String args[]) {
		String s = "WELCOME";
		int v=0,c=0;;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I'
	                || ch == 'O' || ch == 'U') {
				
	               v++;
	               for(int j=0;j<v;j++)
	               {

	   				System.out.print("*"); 
	               }
	               System.out.print(ch);
	               for(int j=0;j<v;j++)
	               {
	   				System.out.print("*"); 
	               }         
	            
	            }
			else
			{
				
				System.out.print(ch);

			}
		}
	}

}
