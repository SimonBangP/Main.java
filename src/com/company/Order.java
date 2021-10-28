package com.company;

import java.util.Arrays;

public class Order {
private int[] pizzaNumber = new int[10];
private double orderTime;
private double pickupTime;

public Order(){}

public Order (int [] pizzaNumber, double orderTime, double pickupTime){
    this.pizzaNumber = pizzaNumber;
    this.orderTime = orderTime;
    this.pickupTime = pickupTime;

}
public String toString(){
    return ("Pizza number: " + Arrays.toString(pizzaNumber) +  "\nOrderTime: " + orderTime + "\nPickup time: " +pickupTime);
}

    public int[] getPizzaNumber() {
        return pizzaNumber;
    }

    public void setPizzaAmount(int[] pizzaNumber) {
        this.pizzaNumber = pizzaNumber;
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

