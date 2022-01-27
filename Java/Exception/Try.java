package Exception;

public class Try {
	public static void main(String[]args)
	{
		int i=5,j=0;
		try
		{
			int k=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled"+e);
		}
	}

}
