package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoDepartment;
import Model.department;

public class ConDepartUpdate extends HttpServlet{
	
public ConDepartUpdate() { super(); }
	
	protected void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		String strId = request.getParameter("dpartId");
		String name = request.getParameter("dpartName");
		
		int id = Integer.parseInt(strId);
		
		department dpart = (department) new DaoDepartment().queryById(id);
		
		if(name == null || name=="") name = dpart.getDepartName();
		
		dpart.setDepartName(name.toUpperCase());
		
		new DaoDepartment().updateDepart(dpart);
		
		
		response.sendRedirect("editDepart.jsp");
	}
	
}
