/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.lab4.inventoryproject.frontend;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mashaal
 */
public class AddProduct extends AddWindow {
    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        super("Product ID","Product Name","Manafacturer Name","Supplier Name","Quantity","Price",0);
        this.setTitle("Add Product");
        initComponents();
    }
    
    @Override
    protected void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        super.jButton1ActionPerformed(evt);
        boolean numericQuantity = true;
        int quantity = 0;
        try {
            quantity = Integer.parseInt(text5);
        } catch (NumberFormatException e) {
            numericQuantity = false;
        }
        if(numericQuantity == false){
            JOptionPane.showMessageDialog(null, "You should enter a numeric value with the field whose name is Quantity");
            return;
        }
        
        boolean numericPrice = true;
        float price = 0;
        try {
            price = Float.parseFloat(text6);
        } catch (NumberFormatException e) {
            numericPrice = false;
        }
        if(numericPrice == false){
            JOptionPane.showMessageDialog(null, "You should enter a numeric value with the field whose name is Price");
            return;
        }
        //check here for 1 as price
         boolean status = EmployeeRoleMenu.employeeRole.addProduct(super.text1, super.text2, super.text3, super.text4, quantity, price);
        if(status == false){
            JOptionPane.showMessageDialog(null, "The Product with ID = " + super.text1 + " already exists!");
        }else{
            JOptionPane.showMessageDialog(null, "The Product with ID = " + super.text1 + " has been successfully added.");
            // pop when press close
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setTitle("Add Product");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
