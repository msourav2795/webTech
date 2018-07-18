<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page import="com.ourweb.dtos.Employee" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="./images/favicon.ico">

    <title>List Employee</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <!-- Custom styles for this template -->
    <link href="./css/signin.css" rel="stylesheet">
  </head>
   <body>
<jsp:include page="Menu.jsp"></jsp:include>


<div class="container-fluid">
  <table class="table table-striped">
      <br><br><br><br><br>S
  <thead>
    <tr>
      <th>EmployeeId</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Designation</th>
      <th>Team</th>
      <th>Contact</th>
      <th>Salary</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${empList}" var="emp">
    <tr>
      <th scope="row">${emp.employeeId}</th>
      <td>${emp.firstName}</td>
      <td>${emp.lastName}</td>
      <td>${emp.designation}</td>
      <td>${emp.team}</td>
      <td>${emp.contact}</td>
      <td>${emp.salary}</td>
      <td><a href="EditEmployee?empId=${emp.employeeId}">Edit</a> </td>
      <td><a href="#">Delete</a> </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
    <script src="./js/jquey-3.3.1.slim.min" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="./js/bootstrap.min.js"></script>
</div>
</body>