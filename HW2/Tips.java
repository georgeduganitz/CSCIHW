package HW2;

import java.util.Scanner;

public class Tips {

    public static void Bill() {
        
    
        Scanner key = new Scanner(System.in);
        double bill, percent, tip;
        int people, total, split;
       
        System.out.println("Welcome to the Tip Calculator!");
        System.out.println("Please Enter Amount of People");
            people = key.nextInt();
        System.out.println("What is the total cost?");
            bill =  key.nextDouble();
        System.out.println(" what percent would you like to tip \nPlease enter as a decimal.");
            percent = key.nextDouble();
            tip = (bill * percent);
            total = (int) (bill + tip);
        System.out.println("The total comes to $" + total);
        split = (int) (total/people);
        System.out.println("If you split the bill it would cost \n $" + split + " each.");
    }
}