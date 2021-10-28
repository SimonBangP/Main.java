package com.company;

public class Pizza {
    private String pizzaName;
    private int pizzaID;
    private int pizzaPrice;

    public Pizza (String pizzaName, int pizzaID, int pizzaPrice) {

        this.pizzaName = pizzaName;
        this.pizzaID = pizzaID;
        this.pizzaPrice = pizzaPrice;
    }

        public String toString () {
            return ("pizzaName" + pizzaName + "pizzaID" + pizzaID + "pizzaPrice" + pizzaPrice );

    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getPizzaID() {
        return pizzaID;
    }

    public void setPizzaID(int pizzaID) {
        this.pizzaID = pizzaID;
    }

    public int getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
}
