package corejava;



public class ArrayDemo2 {
	
		public static void main(String [] args) {
			
		Student [] arr  = new Student[3];
		
		arr[0] = new Student( 1 ,"aj");
		arr[1] = new Student( 2 ,"bj");
		arr[2] = new Student( 3 ,"cj");
		
		for(int i=0; i<arr.length;  i++) {
			
			System.out.println("the element in index i is : " + arr[i].roll_no + " and name is : "+ arr[i].name);
		}
		
		}
		
	}
	


