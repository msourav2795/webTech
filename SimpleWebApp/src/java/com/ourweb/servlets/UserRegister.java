/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourweb.servlets;

import com.ourweb.daos.EmployeeDao;
import static com.ourweb.daos.EmployeeDao.insertEmployee;
import com.ourweb.daos.RegisteDao;
import com.ourweb.dtos.Employee;
import com.ourweb.dtos.MessageDto;
import com.ourweb.dtos.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sourav.mondal
 */
@WebServlet(name = "UserRegister", urlPatterns = {"/UserRegister"})
public class UserRegister extends HttpServlet {

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
        // we will verify from our database
        
        //int employeeId;
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String username=request.getParameter("username");
        String contact=request.getParameter("contact");
        
        User user=new User(email, password, username, contact);      
        boolean res=RegisteDao.insertUser(user);
        
        MessageDto msgObject=new MessageDto();  
        String msg="";
        if(res){
            //msgObject.setMessageString("Successfully Entered Data");   
            msg="Successfully Entered Data";
        }
        else{
            //request.getRequestDispatcher("Error.html").forward(request, response);
            //msgObject.setMessageString("Data cannot be entered");
            msg="Data cannot be entered";
        }
        request.setAttribute("message", msg);
        //request.setAttribute("message", msgObject);
        request.getRequestDispatcher("Registration.jsp").forward(request, response);
        
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
