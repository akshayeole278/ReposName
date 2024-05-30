package Array;

public class TwoDimentional_Array {

	public static void main(String[] args) {
		
		int b[][]=new int [3][2];
		
		b[0][0]=2;
		b[0][1]=4;
		
		b[1][0]=6;
		b[1][1]=8;
		
		b[2][0]=10;
		b[2][1]=12;
		
		//for loop
		
		for (int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
			System.out.print(b[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("____________________________");
		System.out.println("____________________________");
		

		//For Each Loop
		
		for(int k[]:b)
		{
			for(int l:k)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
	
	
	
	
	}

}
