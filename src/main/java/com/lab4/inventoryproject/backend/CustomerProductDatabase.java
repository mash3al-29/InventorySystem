/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab4.inventoryproject.backend;
import java.time.format.DateTimeFormatter;
import java.time.*;
import com.lab4.inventoryproject.constants.FileNames;
/**
 *
 * @author Mashaal
 */
class CustomerProductDatabase extends Database{
    public CustomerProductDatabase() {
        super(FileNames.CUSTOMERPRODUCT_FILENAME);
        
    }
    
    @Override
    public void insertRecord(Record record){
        Record customerProduct = getRecord(record.getSearchKey());
        if(customerProduct != null){
            super.deleteRecord(record.getSearchKey());
        }
        super.insertRecord(record);
    }

    @Override
    public CustomerProduct createRecordFrom(String line){
        String[] data = line.split(",");
        String customerId = data[0];
        String productId = data[1];
        String purchaseDate = data[2];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return new CustomerProduct(customerId, productId, LocalDate.parse(purchaseDate,formatter));
    }
}
