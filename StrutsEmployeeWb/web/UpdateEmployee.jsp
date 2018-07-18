<%-- 
    Document   : ShowAllEmployee.jsp
    Created on : 12 Jun, 2015, 12:09:20 PM
    Author     : techcluster001
--%>

<%@page import="com.tc.dto.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>


<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="./images/favicon.ico">

    <title>Edit Employee</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/style.css" rel="stylesheet">
  </head>

  <body class="text-center">
      <jsp:include page="./menu/menu.jsp"></jsp:include>
    <form class="form-signin" action="updateEmployee" method="post">
      <img class="mb-4" src="./images/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Edit Employee Form</h1>
      <br>
      <h2></h2>

      <label for="inputEmail" class="sr-only">First Name</label>
      <input value="<s:property value="firstName"/>" name="firstName" type="text" id="firstName" class="form-control" placeholder="Enter First Name" required autofocus>
      
      <label for="inputEmail" class="sr-only">Middle Name</label>
      <input value="<s:property value="middleName"/>" name="middleName" type="text" id="middleName" class="form-control" placeholder="Enter Middle Name" required autofocus>
      
      <label for="inputEmail" class="sr-only">Last Name</label>
      <input value="<s:property value="lastName"/>" name="lastName" type="text" id="lastName" class="form-control" placeholder="Enter Last Name" required autofocus>
      
      <label for="inputEmail" class="sr-only">Designation</label>
      <input value="<s:property value="designation"/>" name="designation" type="text" id="designation" class="form-control" placeholder="Enter Designation" required autofocus>
      
      <label for="inputEmail" class="sr-only">Team</label>
      <input value="<s:property value="team"/>" name="team" type="text" id="team" class="form-control" placeholder="Enter Team" required autofocus>
      
      <label for="inputEmail" class="sr-only">Contact</label>
      <input value="<s:property value="contact"/>" name="contact" type="text" id="contact" class="form-control" placeholder="Enter Contact" required autofocus>
      
      <label for="inputEmail" class="sr-only">Salary</label>
      <input value="<s:property value="salary"/>" name="salary" type="text" id="salary" class="form-control" placeholder="Enter Salary" required autofocus>
      
      <input type="hidden" name="employeeId" id="employeeId" value="<s:property value="employeeId"/>">
      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Save</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
    </form>
  </body>
</html>



