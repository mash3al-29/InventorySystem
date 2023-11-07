/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab4.inventoryproject.inventoryproject;

import java.util.ArrayList;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mashaal
 */
public class EmployeeRole implements Role{
    private ProductDatabase productsDatabase;
    private CustomerProductDatabase customerProductDatabase;
    
    EmployeeRole(){
        this.productsDatabase = new ProductDatabase("Products.txt");
        this.customerProductDatabase = new CustomerProductDatabase("CustomersProducts.txt");
    }
    
    public void addProduct(String productID, String productName, String manufacturerName, String supplierName, int quantity,float price){
        Product product = new Product(productID,productName, manufacturerName, supplierName, quantity,price);
        productsDatabase.insertRecord(product);
        productsDatabase.saveToFile();
    }
    
    public Record[] getListOfProducts(){
        ArrayList<Record> arrayList =  productsDatabase.returnAllRecords();
        Record[] productArray = new Product[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            productArray[i] = arrayList.get(i);
        }
        return productArray;
    }
    
    public Record[] getListOfPurchasingOperations(){
        ArrayList<Record> arrayList =  customerProductDatabase.returnAllRecords();
        Record[] customerProductArray = new CustomerProduct[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            customerProductArray[i] = arrayList.get(i);
        }
        return customerProductArray;
    }
    
    public boolean purchaseProduct(String customerSSN, String productID, LocalDate purchaseDate){
           Product product = (Product) productsDatabase.getRecord(productID);
                if( product == null || product.getQuantity() == 0){
                    System.out.println("No Product with that Id was found");
                    return false;
                }else{
                    product.setQuantity(product.getQuantity() - 1);
                    CustomerProduct customerProduct = new CustomerProduct(customerSSN,productID, purchaseDate);
                    customerProductDatabase.insertRecord(customerProduct);
                    productsDatabase.saveToFile();
                    customerProductDatabase.saveToFile();
                    return true;
                }        
    }
    
    //needs to be implmented
    public double returnProduct(String customerSSN, String productID, LocalDate purchaseDate ,LocalDate returnDate){
         if (returnDate.isBefore(purchaseDate)) {
            return -1;
        }
         if(productsDatabase.contains(productID) == false){
                 return -1;
             }
        if(customerProductDatabase.contains(customerSSN + ',' + productID + ','
                + purchaseDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))) == false){
            return -1;
        }
        Period period = Period.between(purchaseDate, returnDate);
        int days = period.getDays();
        if(days > 14){
            return -1;
        }
        Product product = (Product) productsDatabase.getRecord(productID);
        if(product != null){
             product.setQuantity(product.getQuantity() + 1);
             customerProductDatabase.deleteRecord(customerSSN + ',' + productID + ','
                + purchaseDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
             productsDatabase.saveToFile();
             customerProductDatabase.saveToFile();
             return product.getPrice();
        }
        return -1;
    }
    
    @Override
    public void logout(){
        customerProductDatabase.saveToFile();
        productsDatabase.saveToFile();
    }
}
