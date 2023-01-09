package com.HibernateCrud;

import java.util.Scanner;

import com.HibernateCrud.DaoImp.StudentDaoImp;

public class App 
{
    public static void main( String[] args )
    {
        StudentDaoImp dao=new StudentDaoImp();
        char c;
        do {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Press 1 for add student \n Press 2 for display student \n"
        			+"Press 3 for update \n Press 4 for delete \n Press 5 for exit");
        	int a=sc.nextInt();
        	switch(a) {
        	case 1:dao.addStudent();
        	break;
        	case 2:dao.fetchStudent();
        	break;
        	case 3:dao.updateStudent();
        	break;
        	case 4:dao.deleteStudent();
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

