package Dao;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public interface implEmployee {
		//C
		void addEmp(Object o);
		
		//R
		List<Object> queryAll();
		Object queryById(int empId);
		Object queryByName(String name);
		List<Object> queryByDepart(String department);
		List<Object> queryByDate(Date date);
		
		//U
		Object updateEmp(Object o);
		
		//D
		void deleteEmp(int empId);
		
		//get sqlDate
		Date convertDate(int y, int m, int d);
		Date convertDate(String date);
}	
