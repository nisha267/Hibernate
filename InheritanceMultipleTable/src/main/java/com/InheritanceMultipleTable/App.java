package com.InheritanceMultipleTable;

import com.InheritanceMultipleTable.daoImpl.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        DaoImpl dao=new DaoImpl();
        dao.addVehicle();
    }
}
