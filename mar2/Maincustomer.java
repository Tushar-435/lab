package Mar_02;

public class Maincustomer {
	public static void main(String[] args) {
		customer c=new customer();
		c.setAccountName("Pallabhi");
		c.setAccountNumber(646546465468484l);
		c.setAccountBalance(454645f);
		System.out.println("Name:"+c.getAccountName());
		System.out.println("Acc Num:"+c.getAccountNumber());
		System.out.println("Acc Bal:"+c.getAccountBalance());
		
		c.setAccountName("Riya");
		c.setAccountNumber(464646464364334l);
		c.setAccountBalance(4544343f);
		
		System.out.println("Name:"+c.getAccountName());
		System.out.println("Acc Num:"+c.getAccountNumber());
		System.out.println("Acc Bal:"+c.getAccountBalance());
		
	}

}
