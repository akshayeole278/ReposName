package Array;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int b[][]= {{2,3,4},{5,6,7},{8,9,10}};
		
		for(int i[]:b)
		{
			for(int j:i)
			{
				System.out.print(j +"  ");
			}
			System.out.println();
		}

	}

}
