package Mar_23;

import java.util.InputMismatchException;

public class labAss1 {
		static int a =10; // making 10 static variable
		// 1st sample variable
	    	static void run() {
			try {
				int y=3;
				System.out.println(a/y);
			}
			catch (Exception e) {
				System.out.println(e);
			}}	
	    // 2nd sample variable
			static void print() {
				try {
					int b=0; 
					System.out.println(a/b);
					}
					catch (Exception e) {
						System.out.println(e);	
				}}
		// 3rd sample variable
			static void display() {
				try {
					String s="Hello";
					 int n=Integer.parseInt(s);
					
					System.out.println(s);
				}
					catch(InputMismatchException e) {
					System.out.println(e);
				}}
		// 4th sample variable
			static void show() {
				try {
					float a= 23.33f;
					float b=0;
					System.out.println(a/b);
					}
					catch (InputMismatchException e) {
					System.out.println(e);	
				}}
			public static void main(String[] args) {
				labAss1 ob=new labAss1 ();
				// calling static method
				run();
				print();
				display();
				show();
			}}