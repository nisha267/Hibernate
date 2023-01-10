package com.OneToOne;

import com.OneToOne.Dao.CitizenDao;
import com.OneToOne.DaoImpl.CitizenDaoImpl;


public class App 
{
    public static void main( String[] args )
    {
       CitizenDao dao=new CitizenDaoImpl();
       dao.addCitizen();
       dao.fetchCitizen();
    }
}
