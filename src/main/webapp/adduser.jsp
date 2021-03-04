<%@ page import="com.youcode.youcodePlatforme.DAO.UserDAO" %>
<%@ page import="com.youcode.youcodePlatforme.DAOImpl.UserDAOImlp" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	<title>Result Page</title>
</head>
<body>
<center>

	<div class="container">
<form action="/ServletCrud">
	<div class="mb-3">
		<label for="exampleInputEmail1" class="form-label">Email address</label>
		<input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
	</div>

	<div class="mb-3">
		<label for="exampleInputPassword1" class="form-label">Password</label>
		<input type="password" name="password" class="form-control" >
	</div>
	<div class="mb-3">
		<label for="exampleInputPassword1" class="form-label">Nom</label>
		<input type="password" name="nom" class="form-control" >
	</div>
	<div class="mb-3">
		<label for="exampleInputPassword1" class="form-label">Prenom</label>
		<input type="password" name="prenom" class="form-control" id="exampleInputPassword1">
	</div>
	<div>
	<label class="container">Java JEE
		<input type="radio" name="speciality" value="9">

	</label>
	<label class="container">C#
		<input type="radio" name="speciality" value="12">

	</label>
	<label class="container">Full Stack
		<input type="radio" name="speciality" value="13">
	</label>
	<%--	<label class="container">admin
			<input type="radio" name="speciality" value="2000">
		</label>--%>
	</div>
	<div>
	<%--	<label >Admin
			<input type="radio" name="role" value="2">

		</label>--%>
		<label class="container">Student
			<input type="radio" name="role" value="3">

		</label>
		<label class="container">Formateur
			<input type="radio" name="role" value="4">
		</label>
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>


</form>
	</div>
</center>
</body>
</html>