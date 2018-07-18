/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tc.dao;

import com.tc.dto.Employee;
import com.tc.dto.Role;
import com.tc.dto.User;
import com.tc.helpers.DatabseConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author techcluster001
 */
public class EmployeeDao {

    public static boolean saveEmployeeInfo(Employee emp) {

        boolean result = false;
//We need a connection to DB. For this we will use a Singleton Class
        //Step 1. create database connection
        DatabseConnectionClass databseConnectionClass = DatabseConnectionClass.getInstance();

        Connection conn = databseConnectionClass.getMySqlConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.jdbc.Driver");

        //Step 2. Now Use PreparedStatement class to pass SQL to create employee
        String insertSQL = "INSERT INTO employees (firstName, middleName, lastName, designation, team, contact, salary, status) VALUES (?, ?, ?, ?, ?, ?, ?, 1);";

        PreparedStatement stmt = null; //will explain later
        int row = 0;

        if (conn == null) {
            return false;
        }

        try {
            stmt = conn.prepareStatement(insertSQL);
            stmt.setString(1, emp.getFirstName());
            stmt.setString(2, emp.getMiddleName());
            stmt.setString(3, emp.getLastName());
            stmt.setString(4, emp.getDesignation());
            stmt.setString(5, emp.getTeam());
            stmt.setString(6, emp.getContact());
            stmt.setDouble(7, emp.getSalary());
            row = stmt.executeUpdate();
            if (row > 0) {
                result = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            result = false;
        } finally {
            try {
                conn.close(); //very important
            } catch (SQLException ex) {
                result = false;
            }
        }

        return result;

    }

    public static ArrayList showAllEmployeeInfo() {

        ArrayList listOfEmp = new ArrayList();

        DatabseConnectionClass databseConnectionClass = DatabseConnectionClass.getInstance();

        Connection conn = databseConnectionClass.getMySqlConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.jdbc.Driver");

        //Step 2. Now Use PreparedStatement class to pass SQL to create employee
        String selectSQL = "SELECT * FROM employees";

        PreparedStatement stmt = null; //will explain later

        try {
            stmt = conn.prepareStatement(selectSQL);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Employee emp = new Employee();

                
                emp.setEmployeeId(rs.getInt("employeeId"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setMiddleName(rs.getString("middleName"));
                emp.setLastName(rs.getString("lastName"));
                emp.setDesignation(rs.getString("designation"));
                emp.setTeam(rs.getString("team"));
                emp.setContact(rs.getString("contact"));       
                emp.setSalary(rs.getDouble("salary"));
                emp.setStatus(rs.getInt("status"));

                listOfEmp.add(emp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                conn.close(); //very important
            } catch (SQLException ex1) {
                return null;
            }
        }

        return listOfEmp;

    }

    public static Employee getEmployeeInfo(String employeeId) {

        Employee emp = new Employee();

        DatabseConnectionClass databseConnectionClass = DatabseConnectionClass.getInstance();

        Connection conn = databseConnectionClass.getMySqlConnection("jdbc:mysql://localhost:3306/",  "employeedb", "app_user", "qwerty", "com.mysql.jdbc.Driver");

        //Step 2. Now Use PreparedStatement class to pass SQL to create employee
        String selectSQL = "SELECT * FROM employees where employeeId=?";

        PreparedStatement stmt = null; //will explain later

        try {
            stmt = conn.prepareStatement(selectSQL);
            stmt.setString(1, employeeId);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                emp.setEmployeeId(rs.getInt("employeeId"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setMiddleName(rs.getString("middleName"));
                emp.setLastName(rs.getString("lastName"));
                emp.setDesignation(rs.getString("designation"));
                emp.setTeam(rs.getString("team"));
                emp.setContact(rs.getString("contact"));       
                emp.setSalary(rs.getDouble("salary"));
                emp.setStatus(rs.getInt("status"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                conn.close(); //very important
            } catch (SQLException ex1) {
                return null;
            }
        }

        return emp;

    }

    public static boolean updateEmployeeInfo(Employee emp) {

        DatabseConnectionClass databseConnectionClass = DatabseConnectionClass.getInstance();

        boolean result = true;

        Connection conn = databseConnectionClass.getMySqlConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.jdbc.Driver");

        //Step 2. Now Use PreparedStatement class to pass SQL to create employee
        String insertSQL = "UPDATE employees set firstName=?, middleName=?, lastName=?, designation=?, team=?, contact=?, salary=? where employeeId=?";

        PreparedStatement stmt = null; //will explain later
        int row = 0;

        if (conn == null) {
            return false;
        }

        try {
            stmt = conn.prepareStatement(insertSQL);
            
            //
            stmt.setString(1, emp.getFirstName());
            stmt.setString(2, emp.getMiddleName());
            stmt.setString(3, emp.getLastName());
            stmt.setString(4, emp.getDesignation());
            stmt.setString(5, emp.getTeam());
            stmt.setString(6, emp.getContact());       
            stmt.setDouble(7, emp.getSalary());
            stmt.setInt(8, emp.getEmployeeId());
            //stmt.setInt(9, emp.getStatus());

            row = stmt.executeUpdate();

            if (row > 0) {
                result = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            result = false;
        } finally {
            try {
                conn.close(); //very important
            } catch (SQLException ex) {
                result = false;
            }
        }

        return result;

    }
    
     public static boolean insertEmployeeInfo(Employee emp) {

        DatabseConnectionClass databseConnectionClass = DatabseConnectionClass.getInstance();

        boolean result = true;

        Connection conn = databseConnectionClass.getMySqlConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.jdbc.Driver");

        //Step 2. Now Use PreparedStatement class to pass SQL to create employee
        String insertSQL = "INSERT INTO employees(firstName, lastName, middleName, designation, team, contact, salary)"
                    +" VALUES (?,?,?,?,?,?,?)";;

        PreparedStatement stmt = null; //will explain later
        int row = 0;

        if (conn == null) {
            return false;
        }

        try {
            stmt = conn.prepareStatement(insertSQL);
            
            //
            stmt.setString(1, emp.getFirstName());
            stmt.setString(2, emp.getMiddleName());
            stmt.setString(3, emp.getLastName());
            stmt.setString(4, emp.getDesignation());
            stmt.setString(5, emp.getTeam());
            stmt.setString(6, emp.getContact());       
            stmt.setDouble(7, emp.getSalary());
            //stmt.setInt(8, emp.getEmployeeId());
            //stmt.setInt(9, emp.getStatus());

            row = stmt.executeUpdate();

            if (row > 0) {
                result = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            result = false;
        } finally {
            try {
                conn.close(); //very important
            } catch (SQLException ex) {
                result = false;
            }
        }

        return result;

    }

    public static ArrayList<Employee> showAllEmployeeInfo(String empName, String desgn, double sal) {
        ArrayList listOfEmp = new ArrayList();

        DatabseConnectionClass databseConnectionClass = DatabseConnectionClass.getInstance();

        Connection conn = databseConnectionClass.getMySqlConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.jdbc.Driver");
        String selectSQL;
        //Step 2. Now Use PreparedStatement class to pass SQL to create employee
        if(sal!=0.0)
            selectSQL = "SELECT * FROM employees where firstName like ? AND designation like ? AND salary ="+sal;
        else
            selectSQL = "SELECT * FROM employees where firstName like ? AND designation like ? AND salary like ?";
        
        PreparedStatement stmt = null; //will explain later

        try {
            stmt = conn.prepareStatement(selectSQL);
            stmt.setString(1, "%"+empName+"%");
            stmt.setString(2, "%"+desgn+"%");
            
            System.err.println("select query="+stmt);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmployeeId(rs.getInt("employeeId"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setMiddleName(rs.getString("middleName"));
                emp.setLastName(rs.getString("lastName"));
                emp.setDesignation(rs.getString("designation"));
                emp.setTeam(rs.getString("team"));
                emp.setContact(rs.getString("contact"));       
                emp.setSalary(rs.getDouble("salary"));
                emp.setStatus(rs.getInt("status"));

                listOfEmp.add(emp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                conn.close(); //very important
            } catch (SQLException ex1) {
                return null;
            }
        }

        return listOfEmp;

    }
    
    

    public static boolean validateUser(String email,String password) {
        
        boolean result=false;
        
        DatabseConnectionClass databseConnectionClass = DatabseConnectionClass.getInstance();

        Connection conn = databseConnectionClass.getMySqlConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.jdbc.Driver");

        //Step 2. Now Use PreparedStatement class to pass SQL to create employee
        String selectSQL = "SELECT * FROM usertable where email=? and password=?";

        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement(selectSQL);
            stmt.setString(1,email);
            stmt.setString(2,password);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next())
            {
                result=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;
        
        
    }
    public static User getUser(String email,String password) {
        
        User user=new User();
        
        DatabseConnectionClass databseConnectionClass = DatabseConnectionClass.getInstance();

        Connection conn = databseConnectionClass.getMySqlConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.jdbc.Driver");

        //Step 2. Now Use PreparedStatement class to pass SQL to create employee
        String selectSQL = "SELECT * FROM usertable where email=? and password=?";

        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement(selectSQL);
            stmt.setString(1,email);
            stmt.setString(2,password);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next())
            {
                user.setEmail(rs.getString("email"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setIsLoggedIn(true);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
        
        
    }
    public static ArrayList<Role> getRole() {
        
        //Role rol=new Role();
        ArrayList<Role> roleList=new ArrayList<>();
        DatabseConnectionClass databseConnectionClass = DatabseConnectionClass.getInstance();

        Connection conn = databseConnectionClass.getMySqlConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.jdbc.Driver");

        //Step 2. Now Use PreparedStatement class to pass SQL to create employee
        String selectSQL = "SELECT * FROM role";

        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement(selectSQL);

            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
            {
                Role rol=new Role();
                rol.setRoleId(rs.getInt("roleId"));
                rol.setRoleName(rs.getString("roleName"));
                roleList.add(rol);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return roleList;
        
        
    }


}
