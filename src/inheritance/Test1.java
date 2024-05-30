package inheritance;

class A
{
	int x;
	int y;
	void m1()
	{
		System.out.println(x+y);
	}
}

class B extends A
{
	int p;
	int q;
	void m2()
	{
		System.out.println(p+q);
	}
	
}

public class Test1 {
	public static void main(String[] args) 
	{
		//without using Extend
		A aobject=new A();
		aobject.x=20;
		aobject.y=30;
		aobject.m1();
		
		B bobject=new B();
		bobject.p=40;
		bobject.q=50;
		bobject.m2();
		
		System.out.println("______________________");
		
		//using Extend keyword
		
		bobject.x=120;
		bobject.y=130;
		bobject.m1();
		


	}

}
