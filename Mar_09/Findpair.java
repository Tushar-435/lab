package Mar_09;

public class Findpair {
	public static void main(String[] args) {
		int [] arrays= {5,4,6,4,2,1};
		int sum=6;
		Findpair(arrays, sum);
	}

	public static void Findpair(int[] arrays, int sum) {
		for(int i=0; i<arrays.length;i++) {
			for(int j=i+1; j<arrays.length;j++) {
				if (arrays[i] + arrays[j] == sum) {
                    System.out.println(arrays[i] + " + " + arrays[j] + " = " + sum);
			}
		
		
	}

		}}}
