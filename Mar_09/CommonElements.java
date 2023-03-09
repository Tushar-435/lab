package Mar_09;

public class CommonElements {
	public static void main(String[] args) {
		int[] arr1= {4,6,6,3};
		int[] arr2= {4,0,2,5};
		int[] arr3= {3,4,2,6,1};
//		Initialize starting indexes for ar1[], ar2[] and ar3[]
		int i = 0, j = 0, k = 0, x = 0;
//initialing & instantiating array			
			System.out.print("Array1: ");
			for(x = 0; x < arr1.length; x++) {
			System.out.print(arr1[x] + " ");// array 1 declaring
			}
		System.out.println();	// to print new line
			System.out.print("Array2: ");
			for(x = 0; x < arr2.length; x++) {
			System.out.print(arr2[x] + " ");// array 2 declaring
			}
		System.out.println(); // to print new line
			System.out.print("Array3: ");
			for(x = 0; x < arr3.length; x++) {
			System.out.print(arr3[x] + " "); // array 3 declaring
			}
			System.out.println();
//common elements stored in 3 arrays				
			System.out.print("The common elements in the 3 sorted arrays are: ");
					while (i < arr1.length && j < arr2.length && k < arr3.length) {
						// If x = y and y = z, print any of them and
						// move ahead in all arrays
						if (arr1[i] == arr2[j] && arr2[j] == arr3[k] && arr3[k] == arr1[i]) {
							
							System.out.print(arr1[i] + " ");
							i++;
							j++;
							k++;
						}else if (arr1[i] < arr2[j]) {
							i++;
						}else if (arr2[j] < arr3[k]) {
							j++;
						}else {
							k++;
						}
					}
		}}

