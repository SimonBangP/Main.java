package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CreateOrder[] orders = new CreateOrder[10];
        Scanner console = new Scanner(System.in);
        int answer = 6;
        System.out.println("\t\t\t\t\t***** Velkommen til Mario's Pizzabar! *****\nMed dette program får du en masse muligheder som simplificer Mario's arbejde");

        /* orders[0] = new CreateOrder(1, 11, 12);
        orders[1] = new CreateOrder(2,  11, 12);
        orders[2] = new CreateOrder(3,  11, 12); */

       while (answer != 5){

           System.out.println("Enter \n\n1 : to place an order \n2 : to se the current orderlist \n3 : to delete an order from the list \n4 : to se the Menu card \n5 : to shut down ");
           answer = console.nextInt();

           switch (answer){

               case 1:
                   System.out.println("How many pizzas do you want to order? ");
                   int pizzaAmount = console.nextInt();
                   for (int i = 0; i< pizzaAmount; i++){
                   getOrder(console, orders, pizzaAmount);

               }
                   break;

               case 2:
                   showOrders(orders);
                   break;

               case 3:
                deleteOrder(console, orders);
                   break;

               case 4:

                   break;

               default:

                   break;


           }
       }




    }
public static CreateOrder[] getOrder (Scanner console, CreateOrder[] orderList, int pizzaAmount){


    System.out.println("Enter the number of the Pizza you want");
        int pizzaNumber = console.nextInt();

    System.out.println("Enter the time of ordering. (ex 12,40");
        double orderTime = console.nextDouble();

    System.out.println("Enter 1 for choosing pickup time or 2 for get order as fast as possible ");
    int answer = console.nextInt();
    double pickupTime = 0;
    if (answer == 1){
        System.out.println("Enter time for pick up the order");
        pickupTime = console.nextDouble();
    }
    else {
        System.out.println("Your order is ready in about 15 minutes");
        System.out.println();
    }



        for (int i = 0; i < orderList.length; i++){
            if (orderList[i] == null){
                orderList[i] = new CreateOrder(pizzaNumber, orderTime, pickupTime);
            break;
            }

        }

        return orderList;
}
    public static void showOrders(CreateOrder[] orderList){
        for (int i = 0; i < orderList.length; i++){
            System.out.println(orderList[i]);
            System.out.println();

        }
}
    public static void deleteOrder (Scanner console, CreateOrder[] orders){

        for (int i = 0; i < orders.length; i++) {
            System.out.println("order number " + (i + 1) + ":" + "\n\n" + orders[i] );
            System.out.println("");
        }
        System.out.println("Enter the number of the order you want to change");
        int answer = console.nextInt();

        orders[answer-1] = null;
    }

}
