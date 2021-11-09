package offline_exercises.restaurant;

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
}
