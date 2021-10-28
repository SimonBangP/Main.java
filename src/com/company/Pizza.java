package com.company;

public class Pizza {
    private int pizzaNumber;
    private String pizzaName;
    private int pizzaPrice;

    public Pizza (int pizzaNumber, String pizzaName, int pizzaPrice) {

        this.pizzaNumber = pizzaNumber;
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
    }

        public String toString () {
            return ("pizza number: " + pizzaNumber + "." + " \tpizzaName: " + pizzaName + "." +  " \t\tPrice....... " + pizzaPrice );

    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getPizzaID() {
        return pizzaNumber;
    }

    public void setPizzaID(int pizzaID) {
        this.pizzaNumber = pizzaID;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
}
