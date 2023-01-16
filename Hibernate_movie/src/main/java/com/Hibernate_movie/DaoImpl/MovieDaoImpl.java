package com.Hibernate_movie.DaoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Hibernate_movie.Dao.MovieDao;
import com.Hibernate_movie.config.HibernateUtil;
import com.Hibernate_movie.entity.Movie;



public class MovieDaoImpl implements MovieDao{
	public void addMovie() {
		Scanner sc=new Scanner(System.in);
		String n,d,e;
		double p;
		System.out.println("Enter Movie name: ");
		n=sc.nextLine();
		System.out.println("Enter Genre: ");
		d=sc.nextLine();
		System.out.println("Enter show timing: ");
		e=sc.nextLine();
		System.out.println("Enter ticket price: ");
		p=sc.nextDouble();
		Movie s=new Movie();
		s.setName(n);
		s.setGenre(d);
		s.setShowtiming(e);
		s.setPrice(p);
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(s);
		t.commit();}
		public void updatetiming() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ID: ");
			int id=sc.nextInt();
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			Movie m=session.get(Movie.class, id);
			System.out.println("Enter New showtime: ");
			String timing=sc.next();
			m.setShowtiming(timing);
			session.update(m);
			System.out.println("Updated successfully...");
			t.commit();}
			
			public void deleteMovie() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter ID: ");
				int id=sc.nextInt();
				Session session=HibernateUtil.getSessionFactory().openSession();
				Transaction t=session.beginTransaction();
				Movie m=session.get(Movie.class, id);
				session.delete(m);
				System.out.println("deleted successfully...");
				t.commit();
			}
				public void fetchmoviedetails() {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter ID: ");
					int id=sc.nextInt();
					Session session=HibernateUtil.getSessionFactory().openSession();
					Transaction t=session.beginTransaction();
					Movie m=session.get(Movie.class, id);
					
					System.out.println(m.getId()+" "+m.getName()+" "+m.getGenre()+" "+m.getShowtiming()+" "+m.getPrice());
					t.commit();
	}
	}

