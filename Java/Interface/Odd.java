package Interface;

public class Odd {
	public static void main(String[]args)
	{
		for(int i=100;i<=200;i++)
		{
			if(i%2==1)
			{
				if(i%3==0 && i%5==0)
				{
					break;
				}
				System.out.println(i);
			}
		}
	}

}
