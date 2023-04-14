package LinkedList;

import java.util.ArrayList;

public class OddNumber{	
	
	static ArrayList<Integer>A1 = new ArrayList<>();
	static ArrayList<Integer>A2 = new ArrayList<>();
	public static ArrayList<Integer>strodeOddNumber(int n) {
		
		for(int i=2; i<=n; i++) {
			A1.add(i); 
		}
		return A1; 
		}
	public static ArrayList<Integer>printOddNumber() {
		
		for (int i : A1) {
            int oddNum = i * 5;
            System.out.print(oddNum);
            if (i != A1.get(A1.size() - 1)) {
                System.out.print(",");
            }
            A2.add(oddNum);
        }
        System.out.println();
        return A2;
    }
	// Method to search for number N in ArrayList A1 and return it if found, otherwise return 0
			 int retrieveOddNumber(int N) {
			for (int num : A1) {
			if (num == N) {
			return num;
			}}	           
			return 0;
			}
	public static void main(String[] args) { 	// main method 
		
			
		OddNumber store = new OddNumber();
		store.strodeOddNumber(30);
		store.printOddNumber();
		System.out.println();
		System.out.println(store.retrieveOddNumber(5));
 }}

	
		
	
	

