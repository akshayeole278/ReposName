package oops;

public class Calculation1 
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
		Calculation1 calc=new Calculation1();
		calc.a=120;
		calc.b=100;
		calc.sub();
	}

}
