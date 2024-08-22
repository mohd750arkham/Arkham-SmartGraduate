package daily_problem_solving_DSA_array;

public class TwoSum {

	static boolean chkPair(int A[],int size, int x) {
		for(int i = 0;i< (size-1);i++) {
			for(int j = (i+1); j<size; j++) {
				if(A[i]+A[j]==x) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,0,-3,-4,2};
		int x = -2;
		int size = A.length;
		
		if(chkPair( A, size, x)){
			System.out.println(" yes!");
			
		}
		else {
			System.out.println("No!");
			
		}
	}

}

//https://www.geeksforgeeks.org/check-if-pair-with-given-sum-exists-in-array/
