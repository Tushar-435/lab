package Feb_9;

public class Staticvariable1 { // class1
	int rollno;
	String name;
	float fee;
	static String college="SRM";
	// static void change (){
	// college ="ITC";}
	// constructor
	Staticvariable1( int rollno, String name, float fee){
		this.rollno= rollno;
		this.name= name;
		this.fee= fee;
	}
		//method
		void display() {
		System.out.println(rollno+" "+name+"  "+fee+" "+college);
		}
		public class Staticvariable { //class2
			public static void main(String[] args) {
				// Staticvariable1.change();
				//objects
				Staticvariable1 s1 =new Staticvariable1(111,"pallabi",5000);	
				Staticvariable1 s2 =new Staticvariable1(555,"Tushar",6000);	
				s1.display();
				s2.display();
			}
		}
	}

