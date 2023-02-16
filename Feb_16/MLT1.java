package Feb_16;


class SingleParent5a { // parent class
	int a =20;
	int b=30;
	}
class SingleParent6 extends SingleParent5a { // parent class
	int c=a-b;}
class SingleParent7 extends SingleParent6 { // parent class
	int d=a/c;
	
	public class  MLT1 {
		public static void main(String[] args) {
			SingleParent7 child = new SingleParent7();
			System.out.println("sum="+child.c);
			System.out.println( "divid="+child.d);
		}
	}

}
