package offline_exercises.restaurant;

/* 
Steps to Making a Class
1. Do I need a scanner? (yes, import java.util.Scanner;)
2. Declare public/private class and name it. 
3. Declare INSTANCE VARIABLES, do I need public vs. private?
4. Define at least one CONSTRUCTOR. 
5. Define Methods.  

*/

import java.util.Scanner; 

public class Menu {
    public double cost; 
    public int numItemsOrdered; 
    public String dishName; 
    private int tableNumber; 

    public Menu() {
        this.cost = 0.0;
        this.numItemsOrdered = 0;
        this.dishName = ""; 
        this.tableNumber = 0;
    }

    public Menu(string dishName) {
        this.cost = 0.0;
        this.numItemsOrdered = 0;
        this.dishName =  dishName;
        this.tableNumber = -1; 
    } 

    

}
