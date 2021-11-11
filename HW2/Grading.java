package HW2;

import java.util.Scanner;

public class Grading{

    public static void Grades() {
        Scanner sc = new Scanner(System.in);
        double grade;
        
        System.out.println("Welcome to the Grading Machine \n Please Input the Number Grade Below");
        grade = sc.nextDouble();
        grade = Math.ceil(grade);
        if(grade<60){
            System.out.println("You received an F");
    
        }
        else if(grade>=60 && grade<70){      
            System.out.println("You received a D");
        }
        else if(grade>=70 && grade<80){ 
            System.out.println("You Received a C.");
        }
        else if(grade>=80 && grade<90){
            System.out.println("You Received a B");
        }
        else if(grade>=90 && grade<=100){
            System.out.println("Congrats you Received an A");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    
    
}}
