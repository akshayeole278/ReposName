package Array;

public class IntegerArray {

	public static void main(String[] args) {
		
		int b[]=new int[5];
		
		b[0]=2;
		b[1]=4;
		b[2]=6;		
		b[3]=8;
		b[4]=10;
		
		System.out.println("Value is " + b[3]); 
		
		
		System.out.println("_________________________");
		
		for (int i=0;i<=4;i++)
		{
			System.out.println(b[i]);
		}
		
			System.out.println("_________________________");
			System.out.println("_________________________");
			
			//For Each Loop
		for (int i:b)
		{
			System.out.println(i);
		}}

}
