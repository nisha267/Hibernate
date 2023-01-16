package com.Hibernate_movie;

import java.util.Scanner;

import com.Hibernate_movie.DaoImpl.MovieDaoImpl;


public class App 
{
	public static void main( String[] args )
    {
        MovieDaoImpl dao=new MovieDaoImpl();
        char c;
        do {
        	Scanner sc=new Scanner(System.in);
        	System.err.println("Press 1 for add new Movie \n Press 2 for display movie details \n"
        			+"Press 3 for update show timing \n Press 4 for delete any movie \n Press 5 for exit");
        	int a=sc.nextInt();
        	switch(a) {
        	case 1:dao.addMovie();
        	break;
        	case 2:dao.fetchmoviedetails();
        	break;
        	case 3:dao.updatetiming();
        	break;
        	case 4:dao.deleteMovie();
        	break;
        	case 5:System.exit(0);
        	break;
        	default:System.out.println("Invalid choice!");
        	}
        	System.out.println("Do you want to continue? Y/N");
        	c=sc.next().charAt(0);
        }while(c=='y'||c=='Y');
        System.out.println("Thank you");
        }
    }

