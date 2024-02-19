<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    
    import="java.util.List"
    import="java.util.ArrayList"
    import="Dao.DaoDepartment"
    import="Model.department"
%>

<%
	// Catch List from DaoEmployee().queryAll();
	// then convert it to Array
	
	List<Object> departList = new DaoDepartment().queryAll();
	department[] departArr = departList.toArray(new department[departList.size()]);
	System.out.println(departList);
	//Do some filter here
	
	
	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="basic.css">
<title>edit department</title>
</head>
<body>
	
	<header class="text">HELLO WORLD</header>
	
	<div class="center">
		<a class="button" href="./Home.jsp" class="button">Home</a>
		<a class="button" href="./editEmp.jsp" class="button">Edit Employee</a>
		<a class="dark" href="./editDepart.jsp" class="dark">Edit Department</a>
	</div>
	
	<div class="center">
		<a href="editDepart.jsp" class="dark">Department Home</a>
		<a href="./depart/departCreate.jsp" class="button">Create Department</a>
		<a href="./depart/departUpdate.jsp" class="button">Update Department</a>
		<a href="./depart/departDelete.jsp" class="button">Delete Department</a>
	</div>
	
	
	
	
	<!-- insert employees info -->
	<table class="center">
		<tr>
			<th>id<th>name
		<%
				// get data from arr:
				for(int i=0; i<departArr.length; i++){
					
					if(departArr[i]!=null){
						out.print("<tr><td>"+departArr[i].getDepartId()+
										"<td>"+departArr[i].getDepartName()
								);
					}
				}
			%>
		
	</table>
	
</body>
</html>