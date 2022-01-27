package Interface;

public class Driver1 {
		public static void main(String[]args)
		{
			Employee e=new Employee("Arpitha",123,30000,"ASE");
			e.setsalary(.5000);
			displayDetails(e);
		}
		public static void displayDetails(Employee e)
		{
			System.out.println(e.getname());
			System.out.println(e.geteid());
			System.out.println(e.getsalary());
			System.out.println(e.getdesignation());
		}
}
