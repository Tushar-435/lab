package Mar_23;

import java.util.InputMismatchException;

public class LabAss2 {
	public static void check(int x, int y) { // static method
		if (x<0 || y<0) { // logic for finding negative
			throw new InputMismatchException("x and y should not be zero "); // throw InputMismatchException
	}
		else {
			int c = (x*y); // logic for product
			System.out.println("Product of "+x+" & "+y+"  is : "+c);
		}
}
	public static void main(String[] args) { // main class
        check(20,8);
	}
}


