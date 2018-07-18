<%-- 
    Document   : Menu
    Created on : 12 Jul, 2018, 2:48:14 PM
    Author     : sourav.mondal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.ourweb.dtos.User" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
      <img class="mb-4" src="./images/bootstrap-solid.svg" alt="" width="40" height="40" >
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="HomePage.jsp">Home <span class="sr-only">(current)</span></a>
          </li>
          <c:if test="${user.loggedIn}">
            <li class="nav-item">
                <a class="nav-link" href="ListEmployees">List Employees</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="InsertEmployee.jsp">Add Employees</a>
            </li>
            <li class="nav-item">
               <a class="nav-link" href="Logoff">Logoff</a>
            </li>
            
          </c:if>
          <c:if test="${!user.loggedIn}">
            <li class="nav-item">
               <a class="nav-link" href="Login.jsp">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Registration.jsp">Registration</a>
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