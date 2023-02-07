public static void main(String[] args) { // Method 
		
		
		// 5! = 5 x 4 x 3 x 2 x 1 = 120 This is the example of factorial. 
		
		
		int num  = 5; // create a variable and i set in to 5.  
		int factorial; // i create a factorial name and i used it later. 
		factorial = factorial(num);
		System.out.println("The factorial of  " + num + " is " + factorial); 
	}
	
	public static int factorial(int num) { // create this method to purpose this is to return the factorial of a number and i'm using int because they don't have decimal number used it.  
		// And remember if the one statement only used even without the need a curly braces. 
		if(num==1)// 
			return 1; // Base Case. 
		
		return num * factorial(num-1); // And i using this because if when the number is not 1 we fell in the num-1. 
		
		
