package com.Hibernate_college.DaoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Hibernate_college.Dao.CollegeDao;
import com.Hibernate_college.Entity.College;
import com.Hibernate_college.config.HibernateUtil;

public class CollegeDaoImpl implements CollegeDao {
	
	public void addCourse() {
		Scanner sc=new Scanner(System.in);
		String n,e;
		int d;
		long p;
		System.out.println("Enter Course ID: ");
		d=sc.nextInt();
		System.out.println("Enter name of the course: ");
		n=sc.nextLine();
		
		System.out.println("Enter Teacher name: ");
		e=sc.nextLine();
		
		College s=new College();
		s.setCoursename(n);
		s.setId(d);
		s.setTeacher(e);
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(s);
		t.commit();}
		public void updateTeacher() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ID: ");
			int id=sc.nextInt();
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			College std=session.get(College.class, id);
			System.out.println("Enter Teacher name: ");
			String teacher=sc.nextLine();
			std.setTeacher(teacher);
			session.update(std);
			System.out.println("Updated successfully...");
			t.commit();}
			
			public void deleteCourse() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter ID: ");
				String id=sc.next();
				Session session=HibernateUtil.getSessionFactory().openSession();
				Transaction t=session.beginTransaction();
				College std1=session.get(College.class, id);
				session.delete(std1);
				System.out.println("deleted successfully...");
				t.commit();
			}
				public void fetchCourse() {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter ID: ");
					String id=sc.next();
					Session session=HibernateUtil.getSessionFactory().openSession();
					Transaction t=session.beginTransaction();
					College s1=session.get(College.class, id);
					
					System.out.println(s1.getCoursename()+" "+s1.getId()+" "+s1.getTeacher());
					t.commit();
	}
	}


