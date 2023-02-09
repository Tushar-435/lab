package Feb_9;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		System.out.println("Enter Three Number");
		//scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		int c=sc.nextInt();
		
		if(a < b && a < c)
        {
          System.out.println("The Smallest Is"+a);
        }
     else if(b < c)
        {
           System.out.println("The Smallest Is"+b);
        }
     else
        {
           System.out.println("The Smallest Is"+c);
	}

}
}
