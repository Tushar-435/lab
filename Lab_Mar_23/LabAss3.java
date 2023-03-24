package Mar_23;

public class LabAss3 {
		public static void check(int a, int b) { // static method
			try {
				if(a<0 || b<0) { // logic for finding negative
				throw new ArithmeticException("Non-positive integer sent"); // throw InputMismatchException
				}
			else {
				int c = (a+b); // logic for product
				System.out.println("Sum of "+a+" & "+b+"  is : "+c);
			}}
			finally { // final block
				System.out.println("Final block executed.");
			}
	}
		public static void main(String[] args) { // main class
			
			// method functioning
			check(5,-2);
		}
	}


