<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../basic.css">
<title>Edit Department</title>
</head>
<body>
	<header class="text">HELLO WORLD</header>
	
	<div class="center">
		<a class="button" href="../Home.jsp" >Home</a>
		<a class="button" href="../editEmp.jsp"  >Edit Department</a>
		<a class="dark" href="../editDepart.jsp" >Edit Department</a>
	</div>
	
	<div class="center">
		<a href="../editDepart.jsp" class="button">Department Home</a>
		<a href="./departCreate.jsp" class="button">Create Department</a>
		<a href="./departUpdate.jsp" class="button">Update Department</a>
		<a href="./departDelete.jsp" class="dark">Delete Department</a>
	</div>
	
	<!-- Update employees info -->
	<div class="center" style="height:50px; margin-top:10px; backgound-color:white;">
		<form action="../ConDepartDelete" name="" method="post">
			Department ID: <input type="number" id="dpartId" name="dpartId"/>
			<input type="submit" value="comfirm"/>
		</form>
	</div>
	

</body>
</html>