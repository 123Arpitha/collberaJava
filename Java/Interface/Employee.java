package Interface;

public class Employee {
	private String name;
	private int eid;
	private double salary;
	private String designation;
	Employee(String name,int eid,double salary,String designation)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
		this.designation=designation;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int geteid()
	{
		return eid;
	}
	public void seteid(int eid)
	{
		this.eid=eid;
	}
	public double getsalary()
	{
		return salary;
	}
	public void setsalary(double salary)
	{
		if(salary>this.salary)
		{	
			this.salary=salary;
			System.out.println("salary got updated");
		}
		else {
		
		System.out.println("salary cannot be updated");
	}
		
	}
		
	public String getdesignation()
	{
		return designation;
	}
	public void setdesignation(String designation)
	{
		this.designation=designation;
	}
	
}
