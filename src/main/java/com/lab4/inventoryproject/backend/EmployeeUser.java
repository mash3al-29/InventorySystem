/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab4.inventoryproject.backend;

/**
 *
 * @author Mashaal
 */
public class EmployeeUser implements Record{

    private String employeeId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public EmployeeUser(String employeeId, String name, String email,
            String address, String phoneNumber){
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String getSearchKey(){
        return this.employeeId;
    }

    @Override
    public String lineRepresentation(){
        return this.employeeId + ',' + this.name + ','
                + this.email + ',' + this.address + ',' + this.phoneNumber;
    }

}
