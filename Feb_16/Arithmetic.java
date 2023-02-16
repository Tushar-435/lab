package Feb_16;

 class Arithmetic {
	int add(int a,int b)
    {
        return a+b;
    }}
class Adder extends Arithmetic {
	public static void main(String[] args) {
		 Arithmetic a = new Arithmetic();
		 System.out.println(a.add(10,20)+" "+a.add(2, 60));
	}

}
