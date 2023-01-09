package com.HibernateLab1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	    public static void main( String[] args )
	    {
	    	SessionFactory s1= new Configuration().configure().buildSessionFactory();
	    	//Opens an connection with db and session object perform CRUD
	    	Session ses = s1.openSession();
	    	//Operation performed in db, save permanent
	    	Transaction t1 = ses.beginTransaction();
	    	//Create object of persistent class
	    	Employee  em = new  Employee();
	    	Employee  em1 = new  Employee();
	    	Employee  em2 = new  Employee();
	    	Employee  em3 = new  Employee();
	    	Employee  em4 = new  Employee();
	    	//Use object to enter data in table using setter method
	    	em.setEmpId(101);
	    	em.setEmpFirstName("Nisha");
	    	em.setEmpLastName("Sutradhar");
	    	em.setEmpEmail("nisha@gmail.com");
	    	em.setEmpPhone(1234567);
	    	em.setEmpAddr("Asansol");
	    	em.setEmpSalary(12300.98);
	    	em.setEmpDept("IT");
	    	ses.save(em);
	    	em1.setEmpId(102);
	    	em1.setEmpFirstName("Shifa");
	    	em1.setEmpLastName("Iqbal");
	    	em1.setEmpEmail("shifa@gmail.com");
	    	em1.setEmpPhone(4532167);
	    	em1.setEmpAddr("Durgapur");
	    	em1.setEmpSalary(13300.98);
	    	em1.setEmpDept("CS");
	    	ses.save(em1);
	    	em2.setEmpId(103);
	    	em2.setEmpFirstName("Soumya");
	    	em2.setEmpLastName("Chatterjee");
	    	em2.setEmpEmail("soumya@gmail.com");
	    	em2.setEmpPhone(5431278);
	    	em2.setEmpAddr("Kolkata");
	    	em2.setEmpSalary(33300.98);
	    	em2.setEmpDept("IT");
	    	ses.save(em2);
	    	em3.setEmpId(104);
	    	em3.setEmpFirstName("Niladri");
	    	em3.setEmpLastName("Chowdhury");
	    	em3.setEmpEmail("niladri@gmail.com");
	    	em3.setEmpPhone(324178);
	    	em3.setEmpAddr("Mumbai");
	    	em3.setEmpSalary(43300.98);
	    	em3.setEmpDept("Finance");
	    	ses.save(em3);
	    	em4.setEmpId(105);
	    	em4.setEmpFirstName("Misbah");
	    	em4.setEmpLastName("Chowdhury");
	    	em4.setEmpEmail("misbah@gmail.com");
	    	em4.setEmpPhone(564321);
	    	em4.setEmpAddr("Pune");
	    	em4.setEmpSalary(50300.98);
	    	em4.setEmpDept("Marketing");
	    	//session object is used to save the persistent object
	    	ses.save(em4);
	    	//transaction object to commit changes
	    	t1.commit();
	    	ses.close();
	    }}
	    



