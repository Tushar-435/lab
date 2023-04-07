package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOAss {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1 to store data:");
		int i =in.nextInt();
	    
		if (i==1) {
			FileOutputStream f = new FileOutputStream("E:\\New folder (3)\\New folder\\hello.txt");
			String s ="Program will be storing in files "; 
			byte b[] = s.getBytes(); 
			f.write(b); 
			f.close();
			System.out.println("Storing data first complete");	
			}
		else { System.out.println("wrong statment");
		}
		System.out.println("Enter 2 to write data:");
		int j=in.nextInt();
	
		if (j==2) {
				
				FileInputStream f1 = new FileInputStream("E:\\New folder (3)\\New folder\\hy.txt");
				
				while((i=f1.read())!=-1) { 
					System.out.print((char)i);
				}
				f1.close();
				System.out.println(" 2nd also complete");	
		}
		else { System.out.println("Wrong statment");
		}
		
}}