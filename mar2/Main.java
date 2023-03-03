package Mar_02;

public class Main {
	public static void main(String[] args) {
		Library l=new Library();
		l.setBookAuthor("Pallabhi");
		l.setBookId(435);
		l.setBookName("SRK Un Told Story");
		System.out.println("Book Authrr is:"+l.getBookAuthor());
		System.out.println("Book id num:"+l.getBookId());
		System.out.println("Book Name is:"+l.getBookName());
	}

}
