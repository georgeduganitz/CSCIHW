package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
    
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        {
        
        String pyramidOutput = Pyramid.Output();
        System.out.println(pyramidOutput);
    }

        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
    {
        String adlibInput = Adlibs.Input();
        System.out.println(adlibInput);
    }
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        
      {

          String charReplace = Replace.Wrecker();
          System.out.println(charReplace);
      }


    }
}