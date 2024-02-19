<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    import="java.util.List"
    import="java.util.ArrayList"
    import="Dao.DaoEmployee"
    import="Model.employee"
%>

<%
	// Catch List from DaoEmployee().queryAll();
	// then convert it to Array
	
	List<Object> empList = new DaoEmployee().queryAll();
	employee[] empArr = empList.toArray(new employee[empList.size()]);
	
	//Do some filter here
	String sId = request.getParameter("sId");
	String sName = request.getParameter("sName");
	String sDepart = request.getParameter("sDepart");
	String sDate = request.getParameter("sDate");
	
	
	
	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="basic.css">
<title>Edite Employee</title>
</head>
<body>
	<header class="text">HELLO WORLD</header>
	
	<div class="center">
		<a class="button" href="./Home.jsp" >Home</a>
		<a class="dark" href="./editEmp.jsp"  >Edit Employee</a>
		<a class="button" href="./editDepart.jsp" >Edit Department</a>
	</div>
	
	<div class="center">
		<a href="./editEmp.jsp" class="dark">Employee Home</a>
		<a href="./emp/empCreate.jsp" class="button">Create Employee</a>
		<a href="./emp/empUpdate.jsp" class="button">Update Employee</a>
		<a href="./emp/empDelete.jsp" class="button">Delete Employee</a>
	</div>
	
	<!-- search condition -->
	<div class="center">
		<form action="editEmp.jsp" method="post">
			<input type="text" placeholder ="id" id="sId" name="sId"/>
			<input type="text" placeholder ="name" id="sNmae" name="sName"/></p>
			Department:<label for="sDepart" />
				<select id="sDepart">
					<option value="none">N/A</option>
					<option value="IT">IT</option>
					<option value="SUPPORT">SUPPORT</option>
					<option value="MARKETING">MARKETING</option>
					<option value="sells">SELLS</option>
				</select>
			Date:<input type="date" value="date" id="sDate" name="sDate"/>
			<input type="submit" value="Search" name="btnSearch"/></p>
		</form>
	</div>
	
	<!-- Catch data -->
	<div class="center">
		<!-- insert employees info -->
		<table class="center">
			<tr>
				<th>id</th><th>name</th><th>department</th><th>Date of join</th>
			</tr>
			
			<!-- Use js to catch data from mysql by DaoEmp.java -->
			<%
				// get data from arr:
				for(int i=0; i<empArr.length; i++){
					
					if(empArr[i]!=null){
						out.print("<tr><td>"+empArr[i].getEmpId()+
										"<td>"+empArr[i].getEmpName()+
										"<td>"+empArr[i].getDepartment()+
										"<td>"+empArr[i].getDateOfJoin()
								);
					}
				}
			%>
			
			
		</table>
	</div>
	
	

</body>
</html>