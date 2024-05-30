package Array;

public class ObjectArray {

	public static void main(String[] args) {
		
	Object b[]=new Object[6];
		
		b[0]=2;
		b[1]="Krios";
		b[2]='A';		
		b[3]=true;
		b[4]=10.88d;
		b[5]=2.3f;
		
		System.out.println("Value is " + b[4]); 
		
		
		System.out.println("_________________________");
		
		//For Each Loop
		for (Object i:b)
		{
			System.out.println(i);
		}}

}
