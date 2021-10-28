package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class MenuList {
Scanner input = new Scanner(new File("menuCard.txt"));



     public MenuList() throws FileNotFoundException {
   
       int [] pizzaNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
   
       String [] pizzaName = {"Vesuv", "Amerikaner", "Cacciatoriae", "Carbona", "Dennis", "Bertil", "Silvia", "Victoria", "Toronfo", "Capricciosa", "Hawai", "Le Blissola", "Venezia", "Mafia", "Cay"};
   
       int [] pizzaPrice = {57, 53, 57, 63, 65, 57,61,61,61,61,61,61,61,61,50};
   
       PrintStream addToFile = new PrintStream (new File("menuCard.txt"));
       addToFile.println(Arrays.toString(pizzaNumber));
       addToFile.println(Arrays.toString(pizzaName));
       addToFile.println(Arrays.toString(pizzaPrice));
     }
   }
