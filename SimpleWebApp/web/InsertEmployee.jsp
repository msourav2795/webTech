
<!doctype html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="./images/favicon.ico">

    <title>Insert Employee</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/signin.css" rel="stylesheet">
  </head>

  <body class="text-center">
      <jsp:include page="Menu.jsp"></jsp:include>
    <form class="form-signin" action="Login" method="post">
      <img class="mb-4" src="./images/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">Employee Form</h1>
      <br>
      <h2><%=request.getAttribute("message") %></h2>

      <label for="inputEmail" class="sr-only">First Name</label>
      <input name="firstName" type="text" id="firstName" class="form-control" placeholder="Enter First Name" required autofocus>
      
      <label for="inputEmail" class="sr-only">Middle Name</label>
      <input name="middleName" type="text" id="middleName" class="form-control" placeholder="Enter Middle Name" required autofocus>
      
      <label for="inputEmail" class="sr-only">Last Name</label>
      <input name="lastName" type="text" id="lastName" class="form-control" placeholder="Enter Last Name" required autofocus>
      
      <label for="inputEmail" class="sr-only">Designation</label>
      <input name="designation" type="text" id="designation" class="form-control" placeholder="Enter Designation" required autofocus>
      
      <label for="inputEmail" class="sr-only">Team</label>
      <input name="team" type="text" id="team" class="form-control" placeholder="Enter Team" required autofocus>
      
      <label for="inputEmail" class="sr-only">Contact</label>
      <input name="contact" type="text" id="contact" class="form-control" placeholder="Enter Contact" required autofocus>
      
      <label for="inputEmail" class="sr-only">Salary</label>
      <input name="salary" type="text" id="salary" class="form-control" placeholder="Enter Salary" required autofocus>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
    </form>
  </body>
</html>
