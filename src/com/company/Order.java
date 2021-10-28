package com.company;

import java.util.Arrays;

public class Order {
    private String customerName;
    private int[] pizzaAmount;
    private double orderTime;
    private double pickupTime;

public Order(int pizzaAmount){
    this.pizzaAmount = new int[pizzaAmount];
}

public Order (String customerName, int [] pizzaNumber, double orderTime, double pickupTime){
    this.customerName = customerName;
    this.pizzaAmount = pizzaNumber;
    this.orderTime = orderTime;
    this.pickupTime = pickupTime;

}
public String toString(){
    return ("Name: "+ customerName + "\nPizza Amount: " + Arrays.toString(pizzaAmount) +  "\nOrderTime: " + orderTime + "\nPickup time: " +pickupTime);
}

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int[] getPizzaAmount() {
        return pizzaAmount;
    }

    public void setPizzaAmount(int[] pizzaNumber) {
        this.pizzaAmount = pizzaNumber;
    }


    public double getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(double orderTime) {
        this.orderTime = orderTime;
    }

    public double getOrderPickUp() {
        return pickupTime;
    }

    public void setOrderPickUp(double orderPickUp) {
        this.pickupTime = orderPickUp;
    }
}

