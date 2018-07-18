/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author sourav.mondal
 */
public class SearchEmployees {
    private int empId;
    private double salary;
    public double searchedEmployeeSalary(HashMap<Integer,Double> map, int search){
        Iterator<Map.Entry<Integer,Double>>  itr= map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,Double> entry=itr.next();
            if(entry.getKey()==search)
                return entry.getValue();
        }
        return 0;
    }
}
