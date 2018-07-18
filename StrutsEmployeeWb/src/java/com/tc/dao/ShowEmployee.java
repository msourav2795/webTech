/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tc.dao;

import com.tc.dto.Employee;
import java.util.ArrayList;

/**
 *
 * @author techcluster001
 */
public class ShowEmployee {
    
    private ArrayList<Employee> list=new ArrayList<>();

    /**
     * @return the list
     */
    public ArrayList<Employee> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }
    
    public String execute() {

        String forward="success";
        list = EmployeeDao.showAllEmployeeInfo();
        if(list.isEmpty())
        {
            forward="failure";
        } 
        return forward;
    }
    
    
}
