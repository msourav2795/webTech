/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tc.employeeExecutable;

import com.tc.dao.EmployeeDao;
import com.tc.dto.Employee;
import java.util.ArrayList;

/**
 *
 * @author techcluster001
 */
public class EmployeeController {
    
    private Employee employee;
    
    private String employeeName;
    private int employeeId;
    private int employeeSalary;
    
    

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * @return the employeeName
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the employeeSalary
     */
    public int getEmployeeSalary() {
        return employeeSalary;
    }

    /**
     * @param employeeSalary the employeeSalary to set
     */
    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    
}
