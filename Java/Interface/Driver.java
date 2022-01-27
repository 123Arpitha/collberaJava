package Interface;

public class Driver {
	public static void main(String[]args)
	{
		A1 a=new A1(10);
		System.out.println(a.geteid());
		a.seteid(20);
		System.out.println(a.geteid());
	}

}
