package Interface;

public class Driver3 
{
	public static void main(String[]args)
	{
		C c=new C();
		c.A1();
		c.A2();
		B b=c;
		b.A2();
		A a=c;
		a.A1(); 
    }
}
