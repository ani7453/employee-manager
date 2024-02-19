package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoEmployee;

/**
 * Servlet implementation class ConEmpDelete
 */
public class ConEmpDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConEmpDelete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String idstr = request.getParameter("empId");
		
		if(idstr!=null && idstr!="") {
			int id = Integer.parseInt(idstr);
			new DaoEmployee().deleteEmp(id);
			
			response.sendRedirect("editEmp.jsp");
		}
	}

}
