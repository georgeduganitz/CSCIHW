package HW1;
// make a method that accepts 2 Strings and 1 int (Someones name, age, and favorite color and then returns a story about them)
// Hint1: The objects name is Adlibs and you require a name age and favoriteColor all in strings
// Hint2: You will need to return a string. You can concat the variables and the strings together
// Hint3: A sample story if you are lost can be as simple as "Hello! My name is ____, and I am ____, and my favorite  
//        color is ___"

import java.util.Scanner;

public class Adlibs
{
    public static String Input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please State Your Name ");

        String name = sc.nextLine();
        System.out.println(name.replace ("Greg" , "Hello, Professor" ));
        System.out.println("Please State Your Age");

        String age = sc.nextLine();

        System.out.println("name your favorite color, Please");

        String color = sc.nextLine();

        System.out.print("Hello my name is " + name + " and I am a computer Science teacher. ");
        System.out.println("I am " + age + " years old.");
        System.out.println("My favorite color is " + color + ".");
        

        sc.close();
        return "I hope you enjoyed!";
    }

}
