package corejava;

public class ArrayDemo {

	public static void main(String [] args) {
		
		int [] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		 for (int i=0; i<arr.length ; i++) {
			 System.out.println("the element is index " + i + " is : " + arr[i]);
		 }
	}
}
