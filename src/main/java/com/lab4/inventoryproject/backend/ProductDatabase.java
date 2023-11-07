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
class ProductDatabase extends Database{
    public ProductDatabase() {
        super(FileNames.PRODUCT_FILENAME);
    }
    
    @Override
    public void insertRecord(Record record){
        Record product = getRecord(record.getSearchKey());
        if(product != null){
            super.deleteRecord(record.getSearchKey());
        }
        super.insertRecord(record);
    }
    
    @Override
    public Product createRecordFrom(String line){
        String[] data = line.split(",");
        String productId = data[0];
        String productName = data[1];
        String manufacturerName = data[2];
        String supplierName = data[3];
        int quantity = Integer.parseInt(data[4]);
        float price = Float.parseFloat(data[5]);
        return new Product(productId, productName, manufacturerName,supplierName,quantity,price);
    }

    
}