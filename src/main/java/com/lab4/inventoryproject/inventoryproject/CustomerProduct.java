/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab4.inventoryproject.inventoryproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mashaal
 */
public class CustomerProduct implements Record {

    private String customerSSN;
    private String productId;
    private LocalDate purchaseDate;

    public CustomerProduct(String customerSSN, String productId, LocalDate purchaseDate) {
        this.customerSSN = customerSSN;
        this.productId = productId;
        this.purchaseDate = purchaseDate;
    }
    public String getCustomerSSN()
    {
        return this.customerSSN;
    }
    public String getProductID()
    {
        return this.productId;
    }
    public LocalDate getPurchaseDate()
    {
        return this.purchaseDate;
    }

    @Override
    public String lineRepresentation() {
        return customerSSN + ',' + productId + ','
                + purchaseDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    @Override
    public String getSearchKey() {
        return customerSSN + ',' + productId + ','
                + purchaseDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}