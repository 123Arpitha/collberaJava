package Interface;

public class Even {
		public static void main(String[]args)
		{
			int k=2;
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=4;j++)
				{
					System.out.print(k);
					k=k+2;
				}
				if(k==10)
				{
					k=2;
				}
				System.out.println();
			}
		}
}
