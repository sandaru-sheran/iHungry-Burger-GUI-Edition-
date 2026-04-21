/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package burger.view;
import burger.model.Burger;
import javax.swing.JOptionPane;
import burger.controller.BurgerController;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author sanda
 */
public class PlaceOrderForm extends javax.swing.JFrame {
    
    BurgerController bc=new BurgerController();
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PlaceOrderForm.class.getName());

    public PlaceOrderForm() throws IOException {
        
        initComponents();
        
        orderIdLable.setText(bc.genarateOrderId());
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        placeOrderButten = new javax.swing.JButton();
        cancelButten = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalLable = new javax.swing.JLabel();
        orderIdLable = new javax.swing.JLabel();
        customerIdTextField = new javax.swing.JTextField();
        burgerQTYTextField = new javax.swing.JTextField();
        orderStatesLable = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Order");
        jLabel1.setOpaque(true);

        placeOrderButten.setBackground(new java.awt.Color(51, 255, 51));
        placeOrderButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        placeOrderButten.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderButten.setText("Place Order");
        placeOrderButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtenActionPerformed(evt);
            }
        });

        cancelButten.setBackground(new java.awt.Color(255, 0, 0));
        cancelButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelButten.setForeground(new java.awt.Color(255, 255, 255));
        cancelButten.setText("Cancel");
        cancelButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Order Id :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer Id :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Burger QTY :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Order Status :");

        jLabel7.setText("NET Total :");

        totalLable.setForeground(new java.awt.Color(255, 0, 0));

        customerIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdTextFieldActionPerformed(evt);
            }
        });

        burgerQTYTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerQTYTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Customer Name :");

        customerNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56)
                                .addComponent(orderIdLable))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(placeOrderButten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelButten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalLable, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderStatesLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customerIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(burgerQTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(orderIdLable))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placeOrderButten, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(burgerQTYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(orderStatesLable))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(cancelButten, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(totalLable, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdTextFieldActionPerformed
        
    }//GEN-LAST:event_customerIdTextFieldActionPerformed

    private void burgerQTYTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerQTYTextFieldActionPerformed
        
    }//GEN-LAST:event_burgerQTYTextFieldActionPerformed

    private void cancelButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtenActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtenActionPerformed

    private void customerNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameTextFieldActionPerformed

    private void placeOrderButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtenActionPerformed
        if (customerIdTextField.getText().isEmpty() || customerNameTextField.getText().isEmpty()  || burgerQTYTextField.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(
            this, 
            "Text Field Cannot Be Empty Try Again", 
            "Success", 
            JOptionPane.INFORMATION_MESSAGE
            );
            customerIdTextField.setText("");
            customerNameTextField.setText("");
            burgerQTYTextField.setText("");
        }else{
        
            Burger burger = null;
            try {
                burger = new Burger(bc.genarateOrderId(),customerIdTextField.getText(),customerNameTextField.getText(),Integer.parseInt(burgerQTYTextField.getText()) );
            } catch (FileNotFoundException ex) {
                System.getLogger(PlaceOrderForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            } catch (IOException ex) {
                System.getLogger(PlaceOrderForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            try {
                if(bc.addNewBurger(burger)){
                    customerIdTextField.setText("");
                    customerNameTextField.setText("");
                    burgerQTYTextField.setText("");
                    JOptionPane.showMessageDialog(
                            this,
                            "Burger successfully added to the list!",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }else{
                    JOptionPane.showMessageDialog(
                            this,
                            "Failed to add the burger. An error occurred or the list is full.",
                            "Addition Failed",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            } catch (IOException ex) {
                System.getLogger(PlaceOrderForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }//GEN-LAST:event_placeOrderButtenActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField burgerQTYTextField;
    private javax.swing.JButton cancelButten;
    private javax.swing.JTextField customerIdTextField;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel orderIdLable;
    private javax.swing.JLabel orderStatesLable;
    private javax.swing.JButton placeOrderButten;
    public javax.swing.JLabel totalLable;
    // End of variables declaration//GEN-END:variables


}
