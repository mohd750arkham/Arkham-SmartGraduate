package tutorial.junit;
//
//public class VariablesDemo {
//
//	int instanceVar = 10;
//	
//	static String StaticVar = "i am static ";
//	
//	public void ShowVariables() {
//		
//		System.out.println("instance var : "+ instanceVar);
//		
//		System.out.println("Static Var : " + StaticVar);
//		
//		int localVar = 5;
//		
//		System.out.println("local var : "+ localVar);
//		
//	}
//	
//	public static void main (String [] args) {
//		VariablesDemo vardem = new VariablesDemo();
//		vardem.ShowVariables();
//		
//		System.out.println("Accessing Static Variables thru Class : " + VariablesDemo.StaticVar);
//	}
//}




















public class VariablesDemo {
	
	int instanceVar = 10;
	
	static String StaticVar = "this is StaticVar";
	
	public void showVariables() {
		
		System.out.println("This is instance Variable: " + instanceVar);
		int LocalVar = 5;
		System.out.println("Local var: "+ LocalVar);
	}
	
	public static void main(String[] args) {
		VariablesDemo varDem = new VariablesDemo();
		
	varDem.showVariables();
	
	System.out.println("the static var is : "+ varDem.StaticVar);
	}
}











