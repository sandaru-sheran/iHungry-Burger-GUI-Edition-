/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burger.model;

public class  Burger { //Burger==Order
    public static final int UNIT_PRICE=500;
    
    public static final int PREPAIRING=0;
    public static final int CANCEL=1;
    public static final int DELIVERED=2;
    
    private String orderId;
    private String customerId;
    private String customerName;
    private int orderQty;
    private int orderStatus;

    public Burger() {
    }

    public Burger(String orderId, String customerId, String customerName, int orderQty) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.orderQty = orderQty;
        this.orderStatus=PREPAIRING; //0
    }

    public Burger(String orderId, String customerId, String customerName, int orderQty,int orderStates) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.orderQty = orderQty;
        this.orderStatus=orderStatus;
    }



    public String getOrderId() {
        return orderId;
    }


    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }


    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    @Override
    public String toString() {
        return orderId+"-"+customerId+"-"+customerName+"-"+orderQty+"-"+orderStatus;
    }


    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }
    
            
}
    
