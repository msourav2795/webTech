/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourweb.dtos;

/**
 *
 * @author sourav.mondal
 */
public class Employee extends AbstractEmployee{

    public static Employee getEmployee(int empId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int employeeId;
    private String firstName;
    private String lastName;
    private String middleName;
    private double salary;
    private String designation;
    private String team;
    private String contact;
    
    public static final String organizationName="Mjunction";
    
    public Employee(){
        firstName="";
                
    }
    public Employee(int id,String fName,String lName,String d,String t,String c, double s){
        employeeId=id;
        firstName=fName;
        lastName=lName;
        designation=d;
        team=t;
        salary=s;
        contact=c;
    }
    public Employee(String fName,String mName,String lName,String d,String t,String c, double s){
        firstName=fName;
        middleName=mName;
        lastName=lName;
        designation=d;
        team=t;
        salary=s;
        contact=c;
    }
    public Employee(int id,String fName,String mName,String lName,String d,String t,String c, double s){
        employeeId=id;
        firstName=fName;
        middleName=mName;
        lastName=lName;
        designation=d;
        team=t;
        salary=s;
        contact=c;
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * @param middleName the middleName to set
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        String info="Employee Id \t: "+this.employeeId+"\nFirst Name \t: "+this.firstName+"\nMiddle Name \t: "+this.middleName+"\nLast Name \t: "+this.lastName+"\nDesignation \t: "+this.designation+"\nTeam \t\t: "+this.team+"\nSalary \t\t: "+this.salary+"\nContact No. \t: "+this.contact;
        return info;
    }

    @Override
    public double provideIncrement(double factor) {
        double sal=this.salary;
        sal+=sal*factor*0.01;
        return sal;
    }

    @Override
    public String fullName() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.firstName+"  "+this.lastName;
    }

    @Override
    public double provideIncrement(double factor, double sal) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(sal>10000)
            return sal+sal*0.05;
        return sal+sal*factor*0.01;
    }
    
    
    
}
