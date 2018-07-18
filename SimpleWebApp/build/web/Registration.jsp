<%-- 
    Document   : Registration
    Created on : 12 Jul, 2018, 3:22:48 PM
    Author     : sourav.mondal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="./images/favicon.ico">

    <title>Registration</title>

    <!-- Bootstrap core CSS -->
    <link href="./css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./css/floating-labels.css" rel="stylesheet">
  </head>

  <body>
      <jsp:include page="Menu.jsp"></jsp:include>
    <form class="form-signin"  action="UserLogin" method="post">
      <div class="text-center mb-4">
        
        <h1 class="h3 mb-3 font-weight-normal">Registration</h1>
        <br>
        <h2><%=request.getAttribute("message") %></h2>
      </div>

      <div class="form-label-group">
        <input name="email" type="email" id="email" class="form-control" placeholder="Email address" required autofocus>
        <label for="email">Email address</label>
      </div>
      <div class="form-label-group">
        <input name="password" type="password" id="password" class="form-control" placeholder="Password" required>
        <label for="password">Password</label>
       
      </div>
      <div class="form-label-group">
        <input name="username" type="username" id="username" class="form-control" placeholder="username" required>
        <label for="username">Username</label>      
      </div>
      <div class="form-label-group">
        <input name="contact" type="contact" id="contact" class="form-control" placeholder="contact" required>
        <label for="contact">Contact</label>
      </div>
        <br>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Create User</button>
      <p class="mt-5 mb-3 text-muted text-center">&copy; 2017-2018</p>
    </form>
  </body>
</html>
