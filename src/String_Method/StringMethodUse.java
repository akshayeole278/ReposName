package String_Method;

public class StringMethodUse {

	public static void main(String[] args) {
		
		String s1="Krios";
		String s2=" InfoSolutions";
		
		//length
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println("==============================================");
		//concat
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("Krios"+" InfoSolutions");
		System.out.println("Krios".concat(s2));
		
		System.out.println("==============================================");
		//equals
		String s3="KIOSK";
		String s4="kiosk";
		
		System.out.println(s3.equals(s4));
		
		System.out.println("==============================================");
		//EqualsIgnoreCase
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println("==============================================");
		//Contains
		System.out.println(s3.contains("KIO"));
		System.out.println(s3.contains("sk"));
		
		System.out.println("==============================================");
		//substring
//		0 1 2 3 4 --> Starting Index
//		K I O S K
//		1 2 3 4 5 --> Ending Index
		System.out.println(s3.substring(1,4));
		System.out.println(s3.substring(0,5));
		
		System.out.println("==============================================");
		//Replacement
		System.out.println(s3.replace('K','T'));
		System.out.println(s3.replace("KIOSK","KRIOS"));
	}

}
