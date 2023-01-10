package com.OneToOne.DaoImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.OneToOne.Dao.CitizenDao;
import com.OneToOne.config.HibernateUtil;
import com.OneToOne.entity.Address;
import com.OneToOne.entity.Citizen;

public class CitizenDaoImpl implements CitizenDao  {
	//creating instance objects so we access globally
	Session session = HibernateUtil.activateSession();
	Transaction t = session.beginTransaction();
	Scanner scan = new Scanner(System.in);
	
	public void addCitizen() {
	
	//Adding properties
		Citizen c = new Citizen();
		c.setCname("Pallabi");
		c.setSurname("Bhaduri");
		c.setPhone(786595529);
		c.setEmail("pallabi@gmail.com");
		c.setDob("2000-05-28");
		
		
		Address a = new Address();
		a.setId(1234);
		a.setIdType("aadhar");
		a.setAddress("xyz house");
		a.setCity("Kolkata");
		a.setState("New Town");
		a.setPincode(854301);
		
		// setting aggregation property to Citizen object
		c.setAddress(a);
		
		session.save(c);
		System.out.println("Adding done");
		t.commit();
}

	public void fetchCitizen() {
		
		@SuppressWarnings("rawtypes")
		Query q =session.createQuery("from Citizen");
		
		//list with Citizen entry
		@SuppressWarnings("Unchecked")
		List<Citizen> a2 = q.getResultList();
		
		//traverse
		Iterator<Citizen> itr = a2.iterator();
		while (itr.hasNext())  {
			Citizen c1 = itr.next();
			Address a1 =c1.getAddress();
			
			//Output
			System.out.println("Customer Details : "+c1.getCid()+" "+c1.getCname()+" "+c1.getSurname()+" "+c1.getPhone()+" "+c1.getEmail()+" "+c1.getDob());
			
			System.out.println("Address Details : "+a1.getId()+" "+a1.getIdType()+" "+a1.getCity()+" "+a1.getState()+" "+a1.getAddress());
		}
	}
}