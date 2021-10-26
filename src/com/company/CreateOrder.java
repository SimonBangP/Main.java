package com.company;

public class CreateOrder {
private int pizzaNumber;
private double orderTime;
private double pickupTime;

public CreateOrder (int pizzaNumber, double orderTime, double pickupTime){
    this.pizzaNumber = pizzaNumber;

    this.orderTime = orderTime;
    this.pickupTime = pickupTime;

}
public String toString(){
    return ("Pizza number: " + pizzaNumber +  "\nOrderTime: " + orderTime + "\nPickup time" +pickupTime);
}

    public int getPizzaNumber() {
        return pizzaNumber;
    }

    public void setPizzaNumber(int pizzaNumber) {
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

