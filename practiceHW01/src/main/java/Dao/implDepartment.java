package Dao;

import java.util.List;

public interface implDepartment {
	//C
	int addDepart(Object o);
	
	//R
	List<Object> queryAll();
	Object queryById(int departId);
	Object queryByName(String name);
	
	//U
	void updateDepart(Object o);
	
	//D
	void deleteDepart(int departId);
	
}
