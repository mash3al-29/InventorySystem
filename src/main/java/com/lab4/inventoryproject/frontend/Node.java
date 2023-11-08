/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab4.inventoryproject.frontend;

/**
 *
 * @author Mashaal
 */
public interface Node {
    public abstract void setParentNode(Node node);
    public abstract Node getParentNode();
}
