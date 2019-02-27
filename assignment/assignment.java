package assignment;
import java.util.ArrayList;
import java.util.Scanner;
public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> n=new ArrayList<>();
		Scanner scn =new Scanner(System.in);
		String r=scn.next();
		
		StringBuilder t=new StringBuilder();
		for(int i=0;i<r.length();i++)
		{
			if(r.charAt(i)!=',')
			{
				t.append(r.charAt(i));
			}
			if(r.charAt(i)==',')
			{
				n.add(t.toString());
				t=new StringBuilder("");
			}
			if(i==r.length()-1)
			{
				n.add(t.toString());
			}
		}
		for(String x:n)
		{
			
			validate(x);
		}
	}

	private static void validate(String x) {
		String upperCaseChars = "(.*[A-Z].*)";
		 String lowerCaseChars = "(.*[a-z].*)";
		 String numbers = "(.*[0-9].*)";
		 String specialChars = "(.*[@,#,$,*,_,=].*)";
		 String marks ="(.*[%,!,),(].*)";
		if(x.length()<6)
		{
			System.out.println(x+"  "+"Failure"+" "+"password must be at least 6 characters long");
		}
		else if(x.length()>12)
		{
			System.out.println(x+"  "+"Failure"+" "+"password length must be be less than 13 characters");
		}
		   
		else if (!x.matches(upperCaseChars ))
           {
                   System.out.println(x+"  "+"Failure"+" "+"Password should contain atleast one upper case alphabet");
                  
           }
          
		else if (!x.matches(lowerCaseChars ))
           {
                   System.out.println(x+"  "+"Failure"+" "+"Password should contain atleast one lower case alphabet");
                  
           }
          
		else if (!x.matches(numbers ))
           {
                   System.out.println(x+"  "+"Failure"+" "+"Password should contain atleast one number.");
                   
           }
		else if(!x.matches(specialChars))
		{
			 System.out.println(x+"  "+"Failure"+" "+"Password must contain at least one from @,#,$,*,_,=.");
		}
		else if(x.matches(marks))
		{
			System.out.println(x+"  "+"Failure"+" "+"Password must not contain %,!,),(");
		}
		else
			System.out.println(x+"  "+"Success");
	}
	
}
