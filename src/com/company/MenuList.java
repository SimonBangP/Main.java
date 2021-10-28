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
                 new Pizza(1, "Vesuv", "Tomatsauce, ost, skinke og oregano", 57),
                 new Pizza(2,"Amerikaner","tomatsauce, ost, oksefars og oregano", 53),
                 new Pizza(3, "Caccioatoriae", "tomatsauce, ost, pepperoni og oregano", 57),
                 new Pizza(4, "Carbona", "tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano", 63),
                 new Pizza(5, "Dennis", "tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65),
                 new Pizza(6, "Bertil","tomatsauce, ost, bacon og oregano", 57),
                 new Pizza(7, "Silvia", "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61),
                 new Pizza(8, "Victoria", "tomatsauce, ost, skinke, ananas, champognin, løg og oregano", 61),
                 new Pizza(9, "Toronfo", "tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61),
                 new Pizza(10, "Capricciosa", "tomatsauce, ost, skinke, champignon og oregano", 61),
                 new Pizza(11, "Hawai", "tomatsauce, ost, skinke, ananas og oregano", 61),
                 new Pizza(12, "Le Bllissola", "tomatsauce, ost, skinke, rejer og oregano", 61),
                 new Pizza(13, "Venezia", "tomatsauce, ost, skinke, bacon og oregano", 61),
                 new Pizza(14, "Mafia", "tomatsauce, ost, pepperoni, bacon, løg og oregano", 61),
                 new Pizza(15, "Cay", "Tomatsauce, ost, kødsovs og spaghetti",  70),
                 new Pizza(16, "Hardy", "Tomatsauce, ost, kylling, pasta, dressing", 72),
                 new Pizza(17, "David", "Tomatsauce, ost, skinke, kylling, kebab, kartofler", 69),
                 new Pizza(18, "Torino","Tomatsauce, ost, kartofler, oregano, løg" , 65),
                 new Pizza(19, "Italiano", "Tomatsauce, roquefort, feta ost, cheddar ost, pepperoni", 62),
                 new Pizza(20, "Sille", "Tomatsauce, ost, tomatskiver, icebergsalat, agurk skiver", 80),
                 new Pizza(21, "Mohammad", "Tomatsauce, ost, lasagne, revet parmesan", 80),
                 new Pizza(22, "Marcus","Tomatsauce, ost, æg, bacon" , 80),
                 new Pizza(23, "Nikolaj","Tomatsauce, gedeost, tatar, hummus " , 80),
                 new Pizza(24, "Simon", "Tomatsauce, slik, karamel dressing, vaniljeis", 80),

         };
        return menu;
     }

   }
