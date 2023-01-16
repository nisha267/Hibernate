package com.Hibernate_college;

import java.util.Scanner;

import com.Hibernate_college.DaoImpl.CollegeDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        CollegeDaoImpl dao=new CollegeDaoImpl();
        char c;
        do {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Press 1 for add new course \n Press 2 for display course details \n"
        			+"Press 3 for update teacher \n Press 4 for deletecourse \n Press 5 for exit");
        	int a=sc.nextInt();
        	switch(a) {
        	case 1:dao.addCourse();
        	break;
        	case 2:dao.fetchCourse();
        	break;
        	case 3:dao.updateTeacher();
        	break;
        	case 4:dao.deleteCourse();
        	break;
        	case 5:System.exit(0);
        	break;
        	default:System.out.println("Invalid choice!");
        	}
        	System.out.println("Do you want to continue? Y/N");
        	c=sc.next().charAt(0);
        }while(c=='y'||c=='Y');
        System.out.println("Thank you");
        }}
    

