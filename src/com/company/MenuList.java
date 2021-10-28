package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class MenuList {
//Scanner input = new Scanner(new File("menuCard.txt"));



     public static Pizza[] getMenu() {

         Pizza [] menu = {
                 new Pizza(1 , "Vesuv", 57),
                 new Pizza(2,"Amerikaner",53),
                 new Pizza(3, "Caccioatoriae", 57),
                 new Pizza(4, "Carbona", 63),
                 new Pizza(5, "Dennis", 65),
                 new Pizza(6, "Bertil",57),
                 new Pizza(7, "Silvia", 61),
                 new Pizza(8, "Victoria", 61),
                 new Pizza(9, "Toronfo", 61),
                 new Pizza(10, "Capricciosa", 61),
                 new Pizza(11, "Hawai", 61),
                 new Pizza(12, "Le Bllissola", 61),
                 new Pizza(13, "Venezia", 61),
                 new Pizza(14, "Mafia", 61),
                 new Pizza(15, "Cay", 70),
                 new Pizza(16, "Hardy", 72),
                 new Pizza(17, "David", 69),
                 new Pizza(18, "Torino", 65),
                 new Pizza(19, "Italiano", 62),
                 new Pizza(20, "Sille", 80),
                 new Pizza(21, "Mohammad", 80),
                 new Pizza(22, "Marcus", 80),
                 new Pizza(23, "Nikolaj", 80),
                 new Pizza(24, "Simon", 80),

         };
        return menu;
     }

   }
