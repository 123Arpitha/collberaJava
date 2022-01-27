package Exception;

import java.util.Scanner;

public class Uexception {
	public static void main(String[]args)throws UnderAgeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		try
		{
			if(age<=21)
			{
				throw new UnderAgeException(" 'UnderAge Exception':age is underage");
			}
			else
			{
				System.out.println("show profile");
			}
		}
		catch(UnderAgeException u)
		{
			System.out.println("exception occured but it is handled"+u.getErrorMessage());
		}
		
	}
}
	class UnderAgeException extends Exception
	{
		String ErrorMessage;
		UnderAgeException(String ErrorMessage)
		{
			this.ErrorMessage=ErrorMessage;
		}
		public String getErrorMessage()
		{
			return ErrorMessage;
		}
	}


		
	


	
