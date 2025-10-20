package corejava;

public class StringDemo1 {

	
	public static void main(String [] args) {
	String str = new String("Hi!");
	
	str.concat(" hello ");
	
	System.out.println(str);
	
	str = str.concat("hello ");
	
	System.out.println(str);
	
	
	//2
	
		StringBuffer str2 = new StringBuffer("Sachin");
		
		str2.append(" Tendulkar");
		
		System.out.println(str2);
		

	}
	
	
}
