/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab4.inventoryproject.backend;

import com.lab4.inventoryproject.constants.FileNames;
/**
 *
 * @author Mashaal
 */
public class EmployeeUserDatabase extends Database{
    public EmployeeUserDatabase(){
        super(FileNames.EMPLOYEE_FILENAME);
    }
    
    @Override
    public boolean insertRecord(Record record){
        Record employee = getRecord(record.getSearchKey());
        if(employee != null){
            return false;
        }else{
            super.insertRecord(record);
            return true;
        } 
    }
    

    @Override
    public EmployeeUser createRecordFrom(String line){
        String[] data = line.split(",");
            String employeeId = data[0];
            String name = data[1];
            String email = data[2];
            String address = data[3];
            String phoneNumber = data[4];
            return new EmployeeUser(employeeId, name, email, address, phoneNumber);
    }
    
    
}