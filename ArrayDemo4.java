package corejava;

public class ArrayDemo4 {

	public static void main (String [] args) {
		
		int arr[] = m1();
		
		for(int i=0; i < arr.length ; i++) {
			System.out.println("the elements are : " + arr[i] + " ");
		}
	}
	
	
	public static int[] m1() {
		return new int[] {1,2,3};
	}
}
