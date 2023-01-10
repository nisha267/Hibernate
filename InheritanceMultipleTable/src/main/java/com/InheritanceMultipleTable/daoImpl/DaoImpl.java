package com.InheritanceMultipleTable.daoImpl;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.InheritanceMultipleTable.config.HibernateUtil;
import com.InheritanceMultipleTable.dao.Dao;
import com.InheritanceMultipleTable.entity.FourWheels;
import com.InheritanceMultipleTable.entity.TwoWheels;

public class DaoImpl implements Dao {
	public void addVehicle() {
		Session session=HibernateUtil.activateSession();
		Transaction t=session.beginTransaction();
		TwoWheels tw=new TwoWheels();
		tw.setFuel("Diesel");
		tw.setEnginePower("500cc");
		tw.setSpeed(200);
		tw.setVtype("Bike");
		tw.setPrice(200000);
		tw.setModelno(1234);
		tw.setModelname("abc");
		tw.setAbs(true);
		tw.setTyretype(140);
		tw.setBtype("Sports bike");
		
		FourWheels fw=new FourWheels();
		fw.setFuel("electric");
		fw.setEnginePower("1000cc");
		fw.setSpeed(400);
		fw.setVtype("Car");
		fw.setPrice(800000);
		fw.setModelNo(12345);
		fw.setModelname("swift");
		fw.setMusicSystem(true);
		fw.setEtype("auto");
		fw.setAc(true);
		session.save(tw);
		session.save(fw);
		t.commit();
		System.out.println("Joining done.....");
		
		
	}

}