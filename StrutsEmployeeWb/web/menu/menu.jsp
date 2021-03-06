<%@page import="com.tc.dto.User" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<body>

<!-- PULL DOWN MENU - BEGIN -->

<div>

<!--<ul>
      <li class="li_nc"><a href="CreateEmployee.jsp"  >Add Employee</a></li>
      <li class="li_nc"><a href="ShowAllEmployee"  >Show Employee</a></li>
      <li class="li_nc"><a href="SearchEmployee.jsp"  >Search Employee</a></li>
</ul>-->

<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
      <img class="mb-4" src="./images/bootstrap-solid.svg" alt="" width="40" height="40" >
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
         <c:if test="${user.isLoggedIn}">
          <li class="nav-item active">
            <a class="nav-link" href="CreateEmployee.jsp">Add Employee <span class="sr-only">(current)</span></a>
          </li>

            <li class="nav-item">
                <a class="nav-link" href="ShowAllEmployee">Show Employees</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="SearchEmployee.jsp">Search Employees</a>
            </li>
            <li class="nav-item">
               <a class="nav-link" href="Logoff">Logoff</a>
            </li>
            
          </c:if>
          <c:if test="${!user.isLoggedIn}">
            <li class="nav-item">
               <a class="nav-link" href="Role">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Registration</a>
            </li>
          </c:if>

        </ul>
        <form class="form-inline my-2 my-lg-0">
           <button class="btn-primary"> Welcome ${user.username}</button>
          <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>


</div>

<!-- END OF PULL DOWN MENU -->
</body>
</html>
