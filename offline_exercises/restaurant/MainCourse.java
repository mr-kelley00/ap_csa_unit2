package offline_exercises.restaurant;

import java.util.Scanner; 

public class MainCourse {
    private double cookTemp; 
    private String sideItem0;
    private String sideItem1; 


    public MainCourse() {
        this.cookTemp = 0.0; 
        this.sideItem0 = "";
        this.sideItem1 = ""; 
    }

    public MainCourse(double cookTemp) {
        this.cookTemp = cookTemp;
        this.sideItem0 = "Baked Potato"; 
        this.sideItem1 = "Hot Pocket (Pepperoni)"; 
    } 

    private static void cookFish() {
        System.out.println("I hope you enjoy the catch of the day.\n");
        boolean needsButter = false; 
        Scanner myScanner = new Scanner(System.in); 
        System.out.println("Do you want butter on your fish? Yes or no?\n");
        String answer;
        answer = myScanner.nextLine(); 

        if (answer == "yes") {
            needsButter = true; 
            System.out.println("I will bring you some fresh butter.\n");
        } else {
            System.out.println("Very well, no butter for your fish tonight.\n")
        }
    }


    


    
}
