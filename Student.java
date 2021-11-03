import java.util.Scanner;

// Unit 2, Topic 2.1, Classes and Objects, 11/01/21, version 0.2


public class Student {
    // These are INSTANCE VARIABLES.  
    private int studentID; 
    private int gradeLevel; 
    private double gradePointAvg; 
    private String studentName; 


    // Creating a Constructor 
    public Student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradePointAvg = 0.0;
        this.studentName = "";
    }

    // Value Constructor 
    public Student(int studentID, int gradeLevel, double GPA, String studentName) {
        this.studentID = studentID; 
        this.gradeLevel = gradeLevel;
        this.gradePointAvg = GPA;
        this.studentName = studentName;
    }

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gradeLevel = 9;
        this.gradePointAvg = 4.0; 
    
    // More than one constructor is known as OVERLOADING. 
  
    }

    // Creating Methods 

    public static void calcGPA() {
        int grade0; 
        int grade1;
        int grade2;
        int grade3; 
        double newGPA; 

        
        Scanner myScanner = new Scanner(System.in); 

        System.out.println("What is the first grade?");
        grade0 = myScanner.nextInt();
        System.out.println("What is the second grade?");
        grade1 = myScanner.nextInt();
        System.out.println("What is the third grade?");
        grade2 = myScanner.nextInt();
        System.out.println("What is the fourth grade?");
        grade3 = myScanner.nextInt();

        newGPA = (grade0 + grade1 + grade2 + grade3) / 4;
        System.out.print("The new GPA is");
        System.out.println(newGPA);
    } 

    public static void newLine() {
        System.out.println(); 

    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args) {
        Student student0 = new Student(); 
        Student student1 = new Student(12345678, 11, 0.57, "Dr. Strange");

        System.out.println("Hello there!");
        threeLine();
        System.out.println("General Kenobi.");
        calcGPA(); 
        


    }



}