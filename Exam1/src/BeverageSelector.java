import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        //Initializing Scanner and variable
        Scanner in = new Scanner(System.in);
        int bevChoice;
        //Asks user to input a number and then stores it in bevChoice
        System.out.println("(1) Water, (2) Coke, (3) Coffee");
        System.out.print("Please choose a number for the beverage of your choice above: ");
        bevChoice = in.nextInt();
        //prints out what the user chose by calling beverageChooser method
        System.out.print("You chose ");
        beverageChooser(bevChoice);
    }

    //a method (function) using conditionals that takes an integer and prints the true statement
    public static void beverageChooser(int beverage) {
        if (beverage == 1) {
            System.out.print("water.");
        } else if (beverage == 2) {
            System.out.print("coke.");
        } else if (beverage == 3) {
            System.out.print("coffee.");
        } else {
            System.out.print("an invalid number sorry!");
        }
    }
}