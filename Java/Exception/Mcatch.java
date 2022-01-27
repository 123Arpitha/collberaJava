package Exception;

public class Mcatch {
	public static void main(String[]args)
	{
		int i=5,j=0;
		try
		{
			int k=i/j;
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array exception handled"+a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception handled"+e);
		}
		catch(Exception p)
		{
			System.out.println("Main method exception handled"+p);
		}
	}

}
