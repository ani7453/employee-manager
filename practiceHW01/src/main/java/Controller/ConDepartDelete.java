package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoDepartment;
import Model.department;

public class ConDepartDelete extends HttpServlet{
	
public ConDepartDelete() { super(); }
	
	protected void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		String strId = request.getParameter("dpartId");
		
		int id = Integer.parseInt(strId);
		
		new DaoDepartment().deleteDepart(id);
		
		
		response.sendRedirect("editDepart.jsp");
	}
	
}	
