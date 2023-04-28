package Student;

import org.hibernate.Session;
import org.hibernate.Transaction;

import TusharOneToOne.HibernateUtil;

public class MainSys { // main class
	public static void main(String[] args) { // main method
	StudentDetails details = new StudentDetails("Tushar Singh","B-Tech","UK");
	Student_Id si = new Student_Id (1670993);
	details.setSid(si);
	Transaction txn;
	try(Session session=HibernateUtil.getSessionFactory().openSession()){
	txn = session.beginTransaction();
	session.save(details);
	txn.commit();
}
}
}