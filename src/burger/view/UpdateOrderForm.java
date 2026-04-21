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
public class UpdateOrderForm extends javax.swing.JFrame {
    
    BurgerController bc=new BurgerController();
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UpdateOrderForm.class.getName());

    public UpdateOrderForm() throws IOException {
        
        initComponents();
        
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        updateOrderButten = new javax.swing.JButton();
        cancelButten = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerIdTextField = new javax.swing.JTextField();
        burgerQTYTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        orderIdTextField = new javax.swing.JTextField();
        orderStatesComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Order");
        jLabel1.setOpaque(true);

        updateOrderButten.setBackground(new java.awt.Color(51, 255, 51));
        updateOrderButten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateOrderButten.setForeground(new java.awt.Color(255, 255, 255));
        updateOrderButten.setText("Update Order");
        updateOrderButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrderButtenActionPerformed(evt);
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

        orderIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIdTextFieldActionPerformed(evt);
            }
        });

        orderStatesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prepairing", "Cancled", "Deleverd", " ", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(orderIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateOrderButten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelButten, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(burgerQTYTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(orderStatesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
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
                            .addComponent(orderIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateOrderButten, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(orderStatesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(cancelButten, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
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
        
    }//GEN-LAST:event_customerNameTextFieldActionPerformed

    private void updateOrderButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrderButtenActionPerformed
        try {
            String orderId=orderIdTextField.getText();
            Burger burger =BurgerController.srarchBurger(orderId);
            if (burger!=null){
                customerIdTextField.setText(burger.getCustomerId());
                customerNameTextField.setText(burger.getCustomerName());
                burgerQTYTextField.setText(String.valueOf(burger.getOrderQty()));
              String status = switch (burger.getOrderStatus()) {
                case 0 -> "Prepairing";
                case 1 -> "Cancled";
                case 2 -> "Deleverd";
                default -> ""; // Should handle unknown status if possible
            };
            orderStatesComboBox.setSelectedItem(status);
                
            }} catch (IOException ex) {
            System.getLogger(UpdateOrderForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
       
    }//GEN-LAST:event_updateOrderButtenActionPerformed

    private void orderIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIdTextFieldActionPerformed
        try {
            String orderId=orderIdTextField.getText();
            Burger burger =BurgerController.srarchBurger(orderId);
            if (burger!=null){
                customerIdTextField.setText(burger.getCustomerId());
                customerNameTextField.setText(burger.getCustomerName());
                burgerQTYTextField.setText(String.valueOf(burger.getOrderQty()));
              String status = switch (burger.getOrderStatus()) {
                case 0 -> "Prepairing";
                case 1 -> "Cancled";
                case 2 -> "Deleverd";
                default -> ""; // Should handle unknown status if possible
            };
            orderStatesComboBox.setSelectedItem(status);
                
            }} catch (IOException ex) {
            System.getLogger(UpdateOrderForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_orderIdTextFieldActionPerformed

    
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField orderIdTextField;
    private javax.swing.JComboBox<String> orderStatesComboBox;
    private javax.swing.JButton updateOrderButten;
    // End of variables declaration//GEN-END:variables


}
