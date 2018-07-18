/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ourweb.helpers;

/**
 *
 * @author sourav.mondal
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sourav.mondal
 */
public class DbConnection {
    //Only one object of this class is allowed
    private static DbConnection dbConnection=null;
    private DbConnection(){
        
    }
    public static DbConnection getInstance(){
        if(dbConnection==null){
            dbConnection=new DbConnection();
        }
        return dbConnection;
    }

    public Connection getConnection(String url, String dbName, String userName, String password, String driver) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Connection conn=null;
        try{
            Class.forName(driver).newInstance(); //provide instance of DriverManager
            conn=DriverManager.getConnection(url + dbName, userName, password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}

