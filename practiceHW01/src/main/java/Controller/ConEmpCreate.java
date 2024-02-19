package Controller;

import java.io.IOException;
import java.sql.Date;

import Model.employee;
import Dao.DaoEmployee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConEmpCreate extends HttpServlet{
	
	public ConEmpCreate() { super(); }
	
	protected void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		String name = request.getParameter("empName");
		String department = request.getParameter("OptDepart");
		String date = request.getParameter("empDate");
		
		//convert date to Date type
		Date sqlDate = new DaoEmployee().convertDate(date);
		
		
		System.out.println(name);
		System.out.println(department);
		System.out.println(sqlDate);
		
		employee emp = new employee(name, department.toUpperCase(), sqlDate);
		new DaoEmployee().addEmp(emp);
		
		
		
		response.sendRedirect("editEmp.jsp");
	}
}
