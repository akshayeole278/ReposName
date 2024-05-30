package oops;

public class Employees 
{
	String empname;
	int empid;
	int deptid;
	String role;
	
	void department()
	{
		System.out.println("Employee Name is " +empname);
		System.out.println("Employee ID is " +empid);
		System.out.println("Department ID is " +deptid);
		System.out.println("Role is " +role);
	}
	
	public static void main(String[] args) 
	{
		Employees emp01=new Employees();
		emp01.empname="Akshay";
		emp01.empid=278;
		emp01.deptid=01;
		emp01.role="QA";
		emp01.department();
		
		System.out.println("======================================");
		Employees emp02=new Employees();
		emp02.empname="Mayur";
		emp02.empid=123;
		emp02.deptid=01;
		emp02.role="QA";
		emp02.department();
		
	}
}
