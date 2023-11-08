/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.lab4.inventoryproject.frontend;

import com.lab4.inventoryproject.backend.EmployeeRole;
import javax.swing.JFrame;

/**
 *
 * @author Mashaal
 */
public class EmployeeRoleMenu extends javax.swing.JFrame implements Node {
    protected static EmployeeRole employeeRole = new EmployeeRole();
    private Node parent = this;
    /**
     * Creates new form EmployeeRoleMenu
     */
    public EmployeeRoleMenu() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addProduct = new javax.swing.JButton();
        viewProducts = new javax.swing.JButton();
        purchaseProduct = new javax.swing.JButton();
        viewPurchasedProducts = new javax.swing.JButton();
        returnProduct = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        addProduct.setBackground(new java.awt.Color(0, 0, 0));
        addProduct.setForeground(new java.awt.Color(255, 255, 255));
        addProduct.setText("Add Product");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });

        viewProducts.setBackground(new java.awt.Color(0, 0, 0));
        viewProducts.setForeground(new java.awt.Color(255, 255, 255));
        viewProducts.setText("View Products");
        viewProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductsActionPerformed(evt);
            }
        });

        purchaseProduct.setBackground(new java.awt.Color(0, 0, 0));
        purchaseProduct.setForeground(new java.awt.Color(255, 255, 255));
        purchaseProduct.setText("Purchase Product");
        purchaseProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseProductActionPerformed(evt);
            }
        });

        viewPurchasedProducts.setBackground(new java.awt.Color(0, 0, 0));
        viewPurchasedProducts.setForeground(new java.awt.Color(255, 255, 255));
        viewPurchasedProducts.setText("View Purchased Products");
        viewPurchasedProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPurchasedProductsActionPerformed(evt);
            }
        });

        returnProduct.setBackground(new java.awt.Color(0, 0, 0));
        returnProduct.setForeground(new java.awt.Color(255, 255, 255));
        returnProduct.setText("Return Product");
        returnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnProductActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(0, 0, 0));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewPurchasedProducts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(purchaseProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(addProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchaseProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPurchasedProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        System.out.println("Navigate to add product window");
        setVisible(false);
        AddProduct addProduct = new AddProduct();
        addProduct.setParentNode(this.parent);
        addProduct.setVisible(true);
//        AddProduct();
    }//GEN-LAST:event_addProductActionPerformed

    private void viewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductsActionPerformed
        System.out.println("Navigate to view products");
        setVisible(false);
        ViewProducts viewProducts = new ViewProducts();
        viewProducts.setVisible(true);
    }//GEN-LAST:event_viewProductsActionPerformed

    private void purchaseProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseProductActionPerformed
        System.out.println("Navigate to purchase product");
    }//GEN-LAST:event_purchaseProductActionPerformed

    private void viewPurchasedProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPurchasedProductsActionPerformed
        System.out.println("Navigate to view purcahsed products");
    }//GEN-LAST:event_viewPurchasedProductsActionPerformed

    private void returnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnProductActionPerformed
        System.out.println("Navigate to return product");
    }//GEN-LAST:event_returnProductActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        System.out.println("Close window and return to admin role and employee role window");
        employeeRole.logout();
    }//GEN-LAST:event_logoutActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(EmployeeRoleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeRoleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeRoleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeRoleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeRoleMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduct;
    private javax.swing.JButton logout;
    private javax.swing.JButton purchaseProduct;
    private javax.swing.JButton returnProduct;
    private javax.swing.JButton viewProducts;
    private javax.swing.JButton viewPurchasedProducts;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setParentNode(Node node) {
       this.parent = node;
    }

    @Override
    public Node getParentNode() {
        return parent;
    }
}
