package com.company;

public class Pizza {
    private int pizzaNumber;
    private String pizzaName;
    private String pizzafill;
    private int pizzaPrice;

    public Pizza (int pizzaNumber, String pizzaName, String pizzafill, int pizzaPrice) {

        this.pizzaNumber = pizzaNumber;
        this.pizzafill = pizzafill;
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
    }

        public String toString () {
            return ( pizzaNumber + ".  " + " \t " + pizzaName.toUpperCase() + ": " + pizzafill + "" + " \t\t.......... " + pizzaPrice + " DKK" );

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
