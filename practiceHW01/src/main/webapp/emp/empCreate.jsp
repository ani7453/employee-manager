<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../basic.css">
<title>Edite Employee</title>
</head>
<body>
	<header class="text">HELLO WORLD</header>
	
	<div class="center">
		<a class="button" href="../Home.jsp" >Home</a>
		<a class="dark" href="../editEmp.jsp" >Edit Employee</a>
		<a class="button" href="../editDepart.jsp" >Edit Department</a>
	</div>
	
	<div class="center">
		<a href="../editEmp.jsp" class="button">Employee Home</a>
		<a href="./empCreate.jsp" class="dark">Create Employee</a>
		<a href="./empUpdate.jsp" class="button">Update Employee</a>
		<a href="./empDelete.jsp" class="button">Delete Employee</a>
	</div>
	
	<!-- create employees info -->
	<div class="center" style="height:50px; margin-top:10px; backgound-color:white;">
		<form action="../ConEmpCreate" name="" method="post">
			Employee Name:<input type="text" id="empName" name="empName"/>
			Department:<label for="OptDepart" id="" name=""/>
			<select id="OptDepart" name="OptDepart">
			  <option value="it">IT</option>
			  <option value="support">SUPPORT</option>
			  <option value="marketing">MARKETING</option>
			  <option value="sells">SELLS</option>
			</select>
			Join Date:<input type="date" id="empDate" name="empDate"/>
			<input type="submit" value="create"/>
		</form>
	
	</div>
	

</body>
</html>