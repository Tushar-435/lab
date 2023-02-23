package Feb_22;

import java.util.Scanner;

public class Employee1 {
		int IncrementSalary() {
			return 0;
			
		}}
	class Devloper extends Employee1 {
		int IncrementSalary() {
			return 30000;
		}}
	class Manager extends Employee1  {
	int IncrementSalary() {
		return 45000;
		}}
	
	class Salary {
		public static void main(String[] args) {
			/* System.out.println("Enter the Employee");
			Scanner sc=new Scanner(System.in);
			int Employee=sc.nextInt();*/
			Employee1 employee;
			
			employee=new Devloper();
	        System.out.println(employee.IncrementSalary());
	        employee=new Manager();
	        System.out.println(employee.IncrementSalary());
	        
		}

}
