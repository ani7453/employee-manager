package Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.employee;
import Dao.DaoEmployee;

public class ConEmpUpdate extends HttpServlet{
	
	public ConEmpUpdate() { super(); }
	
	protected void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		String strId = request.getParameter("empId");
		String name = request.getParameter("empName");
		String department = request.getParameter("OptDepart");
		String Date = request.getParameter("date");
		
		System.out.println(Date);
		
		// convert ID and Date
		Date sqlDate = null;
		int id = Integer.parseInt(strId);
		
		
		//query emp then execute Update func
		employee uemp = (employee) new DaoEmployee().queryById(id);
		
		if(name ==null || name=="")
			name = uemp.getEmpName();
		
		if(department ==null || department=="")
			department = uemp.getDepartment();
		
	
		if(Date==null || Date=="")
			sqlDate = uemp.getDateOfJoin();
		else sqlDate = new DaoEmployee().convertDate(Date);
		
		System.out.println(id+" "+name+" "+department+" "+sqlDate);
		
		uemp.setEmpName(name);
		uemp.setDepartment(department.toUpperCase());
		uemp.setDateOfJoin(sqlDate);
		
		
		System.out.println(uemp.getEmpId()+" "+uemp.getEmpName()+" "+uemp.getDepartment()+" "+uemp.getDateOfJoin());
		
		new DaoEmployee().updateEmp(uemp);
		
		
		// response to editEmp.jsp
		response.sendRedirect("editEmp.jsp");
	}

}
