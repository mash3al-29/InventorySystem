/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Omar is admin
package com.lab4.inventoryproject.backend;

import java.util.ArrayList;

/**
 *
 * @author Mashaal
 */
public class AdminRole implements Role{
    private EmployeeUserDatabase database;
    
    public AdminRole(){
        this.database = new EmployeeUserDatabase();
    }
    
    public boolean addEmployee(String employeeId, String name, String email, String address, String phoneNumber){
        EmployeeUser user = new EmployeeUser(employeeId,name, email, address, phoneNumber);
        boolean status = database.insertRecord(database.createRecordFrom(user.lineRepresentation()));
        return status;
        //database.saveToFile();
    }
    
    public Record[] getListOfEmployees(){
        ArrayList<Record> arrayList =  database.returnAllRecords();
        Record[] employeeArray = new EmployeeUser[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            employeeArray[i] = arrayList.get(i);
        }
        return employeeArray;
    }
    
    public boolean removeEmployee(String key){
        boolean status = database.deleteRecord(key);
        return status;
        //database.saveToFile();
    }
    
    @Override
    public void logout(){
        database.saveToFile();
    }
}
