/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourweb.servlets;

import com.ourweb.daos.EmployeeDao;
import static com.ourweb.daos.EmployeeDao.insertEmployee;
import com.ourweb.daos.RegisterUser;
import com.ourweb.dtos.Employee;
import com.ourweb.dtos.MessageDto;
import com.ourweb.dtos.User;
import com.ourweb.helpers.DbConnection;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sourav.mondal
 */
@WebServlet(name = "verifyLogin", urlPatterns = {"/verifyLogin"})
public class verifyLogin extends HttpServlet {

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
        
        User user=new User(email, password);
        
        MessageDto msgObject=new MessageDto();  
        String msg="";
        user=checkUser(user);
        if(user.isLoggedIn()){
            
            request.getSession().setAttribute("user", user);
            
            
            //msgObject.setMessageString("Successfully Entered Data");   
            msg="Successfully Entered Data";
            request.getRequestDispatcher("InsertEmployee.jsp").forward(request, response);
        }
        else{
            //request.getRequestDispatcher("Error.html").forward(request, response);
            //msgObject.setMessageString("Data cannot be entered");
            msg="Data cannot be entered";
            request.getRequestDispatcher("Registration.jsp").forward(request, response);
        }

    }
    public static User checkUser(User user){
        DbConnection dbConnection=DbConnection.getInstance();
        Connection conn=dbConnection.getConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.cj.jdbc.Driver");
        if(conn==null){
            user.setLoggedIn(false);
        }
        String sql="SELECT * FROM usertable WHERE email= ? AND password= ?;";
        try{
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.setString(1,user.getEmail());
            stmt.setString(2,user.getPassword());
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                user.setUsername(rs.getString("username"));
                user.setLoggedIn(true);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return user;
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
