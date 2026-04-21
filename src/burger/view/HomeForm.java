/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package burger.view;


import burger.controller.BurgerController;
import burger.view.PlaceOrderForm;
import java.io.IOException;

public class HomeForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(HomeForm.class.getName());


    public HomeForm() {
        initComponents();
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        placeOrderButten = new javax.swing.JButton();
        searchBestCustomerButten = new javax.swing.JButton();
        viewOrdersButten = new javax.swing.JButton();
        updateOrderDetailsButten = new javax.swing.JButton();
        exitButten = new javax.swing.JButton();
        searchOrderButten = new javax.swing.JButton();
        searchCustomerButten = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HomeBackground.jpeg"))); // NOI18N

        placeOrderButten.setBackground(new java.awt.Color(255, 0, 0));
        placeOrderButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        placeOrderButten.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderButten.setText("Place Order ");
        placeOrderButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtenActionPerformed(evt);
            }
        });

        searchBestCustomerButten.setBackground(new java.awt.Color(255, 0, 0));
        searchBestCustomerButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchBestCustomerButten.setForeground(new java.awt.Color(255, 255, 255));
        searchBestCustomerButten.setText("Search Best Customer");
        searchBestCustomerButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBestCustomerButtenActionPerformed(evt);
            }
        });

        viewOrdersButten.setBackground(new java.awt.Color(255, 0, 0));
        viewOrdersButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewOrdersButten.setForeground(new java.awt.Color(255, 255, 255));
        viewOrdersButten.setText("View Orders");
        viewOrdersButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrdersButtenActionPerformed(evt);
            }
        });

        updateOrderDetailsButten.setBackground(new java.awt.Color(255, 0, 0));
        updateOrderDetailsButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateOrderDetailsButten.setForeground(new java.awt.Color(255, 255, 255));
        updateOrderDetailsButten.setText("Update Order Details");
        updateOrderDetailsButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrderDetailsButtenActionPerformed(evt);
            }
        });

        exitButten.setBackground(new java.awt.Color(255, 0, 0));
        exitButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitButten.setForeground(new java.awt.Color(255, 255, 255));
        exitButten.setText("Exit");
        exitButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtenActionPerformed(evt);
            }
        });

        searchOrderButten.setBackground(new java.awt.Color(255, 0, 0));
        searchOrderButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchOrderButten.setForeground(new java.awt.Color(255, 255, 255));
        searchOrderButten.setText("Search Order");
        searchOrderButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOrderButtenActionPerformed(evt);
            }
        });

        searchCustomerButten.setBackground(new java.awt.Color(255, 0, 0));
        searchCustomerButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchCustomerButten.setForeground(new java.awt.Color(255, 255, 255));
        searchCustomerButten.setText("Search Customer");
        searchCustomerButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButten, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewOrdersButten, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBestCustomerButten, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placeOrderButten, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchOrderButten, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchCustomerButten, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateOrderDetailsButten, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 124, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(placeOrderButten, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBestCustomerButten, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchOrderButten, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCustomerButten, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewOrdersButten, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateOrderDetailsButten, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButten, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtenActionPerformed
        dispose();     
    }//GEN-LAST:event_exitButtenActionPerformed

    private void placeOrderButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtenActionPerformed
        try {
            new PlaceOrderForm().setVisible(true);
        } catch (IOException ex) {
            System.getLogger(HomeForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_placeOrderButtenActionPerformed

    private void searchCustomerButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtenActionPerformed
        new SearchCustomerForm().setVisible(true);
    }//GEN-LAST:event_searchCustomerButtenActionPerformed

    private void viewOrdersButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrdersButtenActionPerformed
        new ViewOrdersForm().setVisible(true);
    }//GEN-LAST:event_viewOrdersButtenActionPerformed

    private void searchBestCustomerButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBestCustomerButtenActionPerformed
        new SearchBestCustomerForm().setVisible(true);
    }//GEN-LAST:event_searchBestCustomerButtenActionPerformed

    private void searchOrderButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOrderButtenActionPerformed

        try {
            new searchOrderForm().setVisible(true);
        } catch (IOException ex) {
            System.getLogger(HomeForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_searchOrderButtenActionPerformed

    private void updateOrderDetailsButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrderDetailsButtenActionPerformed
        try {
            new UpdateOrderForm().setVisible(true);
        } catch (IOException ex) {
            System.getLogger(HomeForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_updateOrderDetailsButtenActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new HomeForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton placeOrderButten;
    private javax.swing.JButton searchBestCustomerButten;
    private javax.swing.JButton searchCustomerButten;
    private javax.swing.JButton searchOrderButten;
    private javax.swing.JButton updateOrderDetailsButten;
    private javax.swing.JButton viewOrdersButten;
    // End of variables declaration//GEN-END:variables
}
