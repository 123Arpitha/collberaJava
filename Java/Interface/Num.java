package Interface;

public class Num {
		public static void main(String[]args)
		{
			for(int i=10;i<=20;i++)
			{
				if(i==13 || i==18)
				{
					i++;
					continue;
				}
				System.out.println(i);
			}
		}
}
