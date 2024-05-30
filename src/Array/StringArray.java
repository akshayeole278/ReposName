package Array;

public class StringArray {

	public static void main(String[] args) {
		
		String b[]=new String[5];
		
		b[0]="Krios";
		b[1]="Info";
		b[2]="Solutions";		
		b[3]="Pvt";
		b[4]="Ltd";
		
		System.out.println("Value is : " + b[1]); 
		
		
		System.out.println("_________________________");
		
		System.out.println("Array Length is " +b.length);
		
			System.out.println("_________________________");
			System.out.println("_________________________");
			
			//For Each Loop
		for (String i:b)
		{ 
			System.out.print(i);
		}
		}

}
