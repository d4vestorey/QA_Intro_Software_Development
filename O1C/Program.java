package Labs.O1C;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    static Utils utils = new Utils(); // Create a single instance of Utils that can be used throughout the class
    
    public static void main(String[] args) {
        
        //int number = getInt("Enter an integer: ");
        //String string = getString("Enter a string: ");

        //System.out.println("You entered integer: " + number);
        //System.out.println("You entered string: " + string);

        theLunchQueue();
        //scanner.close();

        //convertInputToStonesPounds(getInt("Enter your weight in pounds: "));
        //convertKgsToStonesPounds(utils.getInt("Enter your weight in kgs: "));
        
    }


    public static void theLunchQueue() {
        String name = utils.getString("What is your name?");
        String mainCourse = utils.getString("What main dish would you like (Fish, Burgers or Veg?");
        int roastPotatoes = utils.getInt("How many roast potatoes would you like?");
        int brussels = utils.getInt("How many brussel sprouts would you like?");

        System.out.println("Hello, " + name + ". Your order is: " + mainCourse + " with " + roastPotatoes + " roast potatoes and " + brussels + " brussel sprouts.");
    }

    static void convertInputToStonesPounds(int pounds){
        int stones = pounds / 14;
        int remainingPounds = pounds % 14;
        System.out.println(pounds + " pounds is " + stones + " stones and " + remainingPounds + " pounds.");
    }

    static void convertKgsToStonesPounds(int kg){
        double pounds = kg * 2.20462;
        convertInputToStonesPounds((int)pounds);
    }
}

