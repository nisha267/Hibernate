package com.HibernateExample;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	//Configuration --> Activates hibernate framework
    	//Configure -->Read both cfg files and mapping details
    	//buildSessionFactory -->from cfg object it takes jdbc information and create a JDBC connector
SessionFactory s= new Configuration().configure().buildSessionFactory();
    	//Opens an connection with db and session object perform CRUD
    	Session ses = s.openSession();
    	//Operation performed in db, save permanent
    	Transaction t = ses.beginTransaction();
    	//Create object of persistent class
    	Student  s1 = new  Student();
    	//Use object to enter data in table using setter method
    	s1.setStuId(101);
    	s1.setStuFirstName("Nisha");
    	s1.setStuLastName("Sutradhar");
    	s1.setStuEmail("nisha@gmail.com");
    	s1.setStuPhone(1234567);
    	s1.setStuAddr("Asansol");
    	s1.setStuFee(12300.98);
    	//session object is used to save the persistent object
    	ses.save(s1);
    	//transaction object to commit changes
    	t.commit();
    	ses.close();
    }}