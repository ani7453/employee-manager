package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoDepartment;
import Model.department;

public class ConDepartCreate extends HttpServlet{
	
public ConDepartCreate() { super(); }
	
	protected void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		String name = request.getParameter("dpartName");
		
		department dpart = new department(name.toUpperCase());
		
		new DaoDepartment().addDepart(dpart);
		
		response.sendRedirect("editDepart.jsp");
	}
	
}
