package oops;

public class StaticExample 
{
	int a;
	static int b;
	
	void m1()
	{
		System.out.println("M1 is non static method");
	}
	
	static void m2()
	{
		System.out.println("M2 is static method");
	}
	
	public static void main(String[] args) 
	{
		//without object create
		//Static methods can access only static stuff
		b=200;
		System.out.println("Value of b is " + b);
		m2();
		
		//a=200; //a is non static variable, a is not accessible
		//m1(); //m1 is non static method, m1 is not accessible 
		
		System.out.println("________________________");
		//with object Create
		StaticExample ES=new StaticExample();
		ES.a=20;
		System.out.println("Value of a is " + ES.a);
		ES.m1();
		
		System.out.println("________________________");
		System.out.println("________________________");
	}
		void m3() 
		{
			a=150; //non static
			b=130; //static
			m1();  //non static
			m2();  //static
		}
		
	}
