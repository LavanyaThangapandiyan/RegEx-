package regexbasic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoValidation 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Mobile NUmber");
		String String=sc.nextLine();
	    Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
	    Matcher m=p.matcher(String);
	if(m.find())
		System.out.println(m.group()+"is valid mobile no.");
	else
	System.out.println(String+"is not valid mobile no");
	}

}
