package Mar_09;

public class Oddposition {
		   public static void main(String[] args) {
		      int[] array = {1,2,45,4,5,6,7};
		      System.out.println("Elements present in odd positions:");
		      
		      for (int i = 0; i < array.length; i = i+2) {  
		            System.out.println(array[i]);  
		      }
		   }
		}

