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
		<a href="./empCreate.jsp" class="button">Create Employee</a>
		<a href="./empUpdate.jsp" class="button">Update Employee</a>
		<a href="./empDelete.jsp" class="dark">Delete Employee</a>
	</div>
	
	<!-- Delete employees info -->
	<div class="center" style="height:50px; margin-top:10px; backgound-color:white;">
		<form action="../ConEmpDelete" name="" method="post" >
			Employee ID: <input name="empId" id="impId" type="number"/>
			<input type="submit" value="Comfirm"/>
		</form>
	</div>
	
	

</body>
</html>