package Interface;
import java.util.Scanner;
public class Upper {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int a=sc.nextInt();
		int fact=1;
		for(int i=a;i>=1;i--)
		{ 	
		
			fact=fact*i;
			
		}
		
		System.out.println(fact);
	}


}
