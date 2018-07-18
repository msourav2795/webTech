/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourweb.daos;

import com.ourweb.dtos.Employee;
import com.ourweb.helpers.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sourav.mondal
 */
public class EmployeeDao {
 public static boolean insertEmployee(Employee emp){
        boolean response=false;
        DbConnection dbConnection=DbConnection.getInstance();
        Connection conn=dbConnection.getConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.cj.jdbc.Driver");
        if(conn==null){
            return response;
        }
        String sql="INSERT INTO employees(firstName, lastName, middleName, designation, team, contact, salary)"
                    +" VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt=conn.prepareStatement(sql);
            //stmt.setInt(1,emp.getEmployeeId());
            stmt.setString(1,emp.getFirstName());
            stmt.setString(2,emp.getLastName());
            stmt.setString(3,emp.getMiddleName());
            stmt.setString(4,emp.getDesignation());
            stmt.setString(5,emp.getTeam());
            stmt.setString(6,emp.getContact());
            stmt.setDouble(7,emp.getSalary());
            
            int row=stmt.executeUpdate();
            
            if(row>0){
                response=true;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(DatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return response;
    }
 public static boolean updateEmployee(Employee emp){
        boolean response=false;
        DbConnection dbConnection=DbConnection.getInstance();
        Connection conn=dbConnection.getConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.cj.jdbc.Driver");
        if(conn==null){
            return response;
        }
        String sql="UPDATE employees set firstName=?, lastName=?, designation=?, team=?, contact=?, salary=? where employeeId=?";
        try {
            PreparedStatement stmt=conn.prepareStatement(sql);
            //stmt.setInt(1,emp.getEmployeeId());
            stmt.setString(1,emp.getFirstName());
            stmt.setString(2,emp.getLastName());
            stmt.setString(3,emp.getDesignation());
            stmt.setString(4,emp.getTeam());
            stmt.setString(5,emp.getContact());
            stmt.setDouble(6,emp.getSalary());
            stmt.setInt(7,emp.getEmployeeId());
            
            int row=stmt.executeUpdate();
            
            if(row>0){
                response=true;
            }
        } catch (SQLException ex) {
            //Logger.getLogger(DatabaseOperations.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return response;
    }
    public static ArrayList getEmployees(){
        ArrayList arrList=new ArrayList();
        DbConnection dbConnection=DbConnection.getInstance();
        Connection conn=dbConnection.getConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.cj.jdbc.Driver");
        if(conn==null){
            return arrList;
        }
        String sql="select * from employees";
        try{
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                Employee emp=new Employee(rs.getInt("employeeId"), rs.getString("firstName"), rs.getString("middlename"), rs.getString("lastName"), rs.getString("designation"), rs.getString("team"), rs.getString("contact"), rs.getDouble("salary"));
                arrList.add(emp);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return arrList;
    }
    public static ArrayList getEmployees(int id){
        ArrayList arrList=new ArrayList();
        DbConnection dbConnection=DbConnection.getInstance();
        Connection conn=dbConnection.getConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.cj.jdbc.Driver");
        if(conn==null){
            return arrList;
        }
        String sql="select * from employees where employeeId="+id;
        try{
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                Employee emp=new Employee(rs.getInt("employeeId"), rs.getString("firstName"), rs.getString("middlename"), rs.getString("lastName"), rs.getString("designation"), rs.getString("team"), rs.getString("contact"), rs.getDouble("salary"));
                arrList.add(emp);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return arrList;
    }
    public static Employee getEmployee(int id){
        ArrayList arrList=new ArrayList();
        Employee emp=new Employee();
        DbConnection dbConnection=DbConnection.getInstance();
        Connection conn=dbConnection.getConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.cj.jdbc.Driver");
        if(conn==null){
            return emp;
        }
        String sql="select * from employees where employeeId="+id;
        try{
            PreparedStatement stmt=conn.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                emp=new Employee(rs.getInt("employeeId"), rs.getString("firstName"), rs.getString("middlename"), rs.getString("lastName"), rs.getString("designation"), rs.getString("team"), rs.getString("contact"), rs.getDouble("salary"));
 
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return emp;
    }
    public static boolean updateEmployees(int id, double sal){
        ArrayList arrList=new ArrayList();
        DbConnection dbConnection=DbConnection.getInstance();
        Connection conn=dbConnection.getConnection("jdbc:mysql://localhost:3306/", "employeedb", "app_user", "qwerty", "com.mysql.cj.jdbc.Driver");
        if(conn==null){
            return false;
        }
        String sql="UPDATE employees " + "SET salary ="+ sal + " WHERE employeeId ="+id;
        try{
            PreparedStatement stmt=conn.prepareStatement(sql);
            stmt.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return true;
    }
}

