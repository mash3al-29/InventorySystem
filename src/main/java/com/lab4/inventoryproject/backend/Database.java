/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab4.inventoryproject.backend;


import java.io.*;
import java.util.*;

/**
 *
 * @author Mashaal
 */

public abstract class Database{
    private ArrayList<Record> records;
    private String filename;
    
    public Database(String filename){
        this.filename = filename;
        this.records = new ArrayList<Record>();
        readFromFile();
    }
    
    //To be overrrided
    public abstract Record createRecordFrom(String line);
    
    
    public Record getRecord(String key){
        for (Record record : records) {
            if (record.getSearchKey().equals(key)) {
                return record;
            }
        }
        return null;
    };
    
    
    public boolean contains(String key){
        if(getRecord(key) != null){
            return true;
        }
        return false;
    };
    
    //Extra function instead of repeating save files
    public String getRecordLine(Record record){
        return record.lineRepresentation();
    };
    

    public void readFromFile(){
        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                Record record = createRecordFrom(line);
                records.add(record);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Record> returnAllRecords(){
        return records;
    }
    

    public boolean insertRecord(Record record){
        records.add(record);
        return true;
    }

    public boolean deleteRecord(String key){
        Record record = getRecord(key);
        if (record != null) {
            records.remove(record);
            return true;
        }else{
            return false;
        }
    }
    
    
    public void saveToFile(){
        try  {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename));
            for (Record record : records){
                fileWriter.write(getRecordLine(record) + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
