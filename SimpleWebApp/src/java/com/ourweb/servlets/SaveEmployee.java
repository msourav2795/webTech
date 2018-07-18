/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourweb.servlets;

import com.ourweb.daos.EmployeeDao;
import com.ourweb.daos.RegisterUser;
import com.ourweb.dtos.Employee;
import com.ourweb.dtos.MessageDto;
import com.ourweb.dtos.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sourav.mondal
 */
public class SaveEmployee extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getSession().getAttribute("user")==null){
            request.getRequestDispatcher("HomePAge.jsp").forward(request, response);
        }
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String designation=request.getParameter("designation");
        String team=request.getParameter("team");
        String contact=request.getParameter("contact");
        double salary=Double.parseDouble(request.getParameter("salary"));
        int employeeId=Integer.parseInt(request.getParameter("employeeId"));
        
        Employee emp=new Employee(employeeId, firstName, lastName, designation, team, contact, salary);      
        boolean res=EmployeeDao.updateEmployee(emp);
        
        MessageDto msgObject=new MessageDto();  
        String msg="";
        if(res){
            //msgObject.setMessageString("Successfully Entered Data");   
            msg="Successfully Entered Data";
            request.getRequestDispatcher("ListEmployees").forward(request, response);
        }
        else{
            //request.getRequestDispatcher("Error.html").forward(request, response);
            //msgObject.setMessageString("Data cannot be entered");
            msg="Data cannot be entered";
            request.getRequestDispatcher("InsertEmployee.jsp").forward(request, response);
        }
        //request.setAttribute("message", msg);
        //request.setAttribute("message", msgObject);
        
        
        //boolean validUser=true;
        //if(validUser){
        //    request.getRequestDispatcher("homepage.html").forward(request, response);
        //}
        //else{
        //    request.getRequestDispatcher("Login.html").forward(request, response);
       // }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
