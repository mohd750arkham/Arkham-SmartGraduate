package corejava;

public class LoopsDemo {
 
	public static void main(String []args) {
		
		int i = 5;
		for(i=0;i<5;i++) {
			System.out.println("i= " + i);
		}
		
		System.out.println("\n Demo for while loop");
		int j = 1;
		while(j<=5) {
			System.out.println("j = :" + j);
			j++;
		}
		 
		System.out.println("\n demo for do while loop");
		int k = 1;
		do {
			System.out.println("k : " +k);
			k++;
		}while(k<5);
		
		System.out.println("\n enhanced for loop");
		int[] numbers = {10 , 20 ,30 , 40};
		for(int num:numbers) {
			System.out.println("num : "+ num);
		}
	}
	
	
	
}
