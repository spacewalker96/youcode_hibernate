<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding= "ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.youcode.youcodePlatforme.DAOImpl.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.youcode.youcodePlatforme.entity.User"%>
<%@ page import="com.youcode.youcodePlatforme.DAO.UserDAO" %>
<%@ page import="com.youcode.youcodePlatforme.DAOImpl.UserDAOImlp" %>
<%@ page import="com.youcode.youcodePlatforme.controller.ServletCrud" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Admin Page</title>
</head>
<body>
<center>

    <div class="container">

        <h1>Admin List</h1>
            <%= new Date() %></br>
     <%--    <%  User user = (User) session.getAttribute("user"); %>
         <b>Welcome <%= user.getEmail() + " " + user.getPrenom()%></b>--%>
        <br/>
        <a href="adduser.jsp">Logout</a>
        </p>

        <table class="table table-hover table-dark">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Email</th>
                <th scope="col">Role</th>
                <th scope="col">Delete</th>

            </tr>
            </thead>


            <tbody>
                <%   UserDAO listUser = new UserDAOImlp() ;
					 List<User> list = listUser.getListOfUsers();
					 for (User u : list) {
                                                %>
            <tr>
                <th scope="row"><%= u.getId() %></th>
                <td><%= u.getNom() %></td>
                <td><%= u.getPrenom() %></td>
                <td><%= u.getEmail() %></td>
                <td><%= u.getRole().getRoleName() %></td>
                <td><a href="delete?id=<%= u.getId()%>">Delete</a></td>
            </tr>
                <% } %>
            <tbody>
        </table>
        <br/>
    </div>
</center>
</body>
</html>
