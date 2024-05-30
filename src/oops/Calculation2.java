package oops;

public class Calculation2 
{
	
	int a;
	int b;
	
	//method may not takes parameter
	void sub()
	{
		System.out.println(a-b);
	}
	
	public static void main(String[] args) 
	{
		Calculation2 calc=new Calculation2();
		calc.a=120;
		calc.b=100;
		calc.sub();
	}

}
