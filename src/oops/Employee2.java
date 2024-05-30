package oops;

public class Employee2 
{
	String empname;
	int empid;
	int deptid;
	String role;
	
	//using constructor
	Employee2(String name, int id1, int id2, String rname)
	{
		empname=name;
		empid=id1;
		deptid=id2;
		role=rname;
	}
	
	void department2()
	{
		System.out.println("Employee Name is " +empname);
		System.out.println("Employee ID is " +empid);
		System.out.println("Department ID is " +deptid);
		System.out.println("Role is " +role);
	}
	
	public static void main(String[] args) 
	{
		Employee2 emp03=new Employee2("Akshay",278,1,"QA");
		emp03.department2();
	}	
}
