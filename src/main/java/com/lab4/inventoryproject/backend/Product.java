/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab4.inventoryproject.backend;

/**
 *
 * @author Mashaal
 */
public class Product implements Record {

    private String productId;
    private String productName;
    private String manufacturerName;
    private String supplierName;
    private int quantity;
    private float price;

    public Product(String productId, String productName, String manufacturerName, String supplierName, int quantity, float price) {
        this.productId = productId;
        this.productName = productName;
        this.manufacturerName = manufacturerName;
        this.supplierName = supplierName;
        setQuantity(quantity);
        if (price < 0)
        {
            System.out.println("Price can't be less than 0");
            this.price = 0;
        }
        else
            this.price = price;
    }
    
    public float getPrice(){
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int quantity)
    {
        if (quantity < 0)
        {
            System.out.println("Quantity can't be less than 0");
            this.quantity = 0;
            return;
        }
        this.quantity = quantity;
        
    }
    
    @Override
    public String getSearchKey(){
        return this.productId;
    }
    
    @Override
    public String lineRepresentation()
    {
        return  this.productId + ',' + this.productName + ','
                + this.manufacturerName + ',' + this.supplierName + ',' 
                + this.quantity + ',' + this.price;
    }
}
