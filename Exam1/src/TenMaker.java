import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        //Initializing Scanner
        Scanner in = new Scanner(System.in);
        //Initializing variables
        int firstNumber;
        int secondNumber;
        //Asks user for first and second integers and stores them in firstNumber and SecondNumber
        System.out.print("Please enter an integer: ");
        firstNumber = in.nextInt();
        System.out.print("Please enter a second integer: ");
        secondNumber = in.nextInt();
        //if else statement that ouputs to screen based on whether makes10 method is true or false
        if (makes10(firstNumber, secondNumber)) {
            System.out.print("The numbers you entered add up to 10.");
        } else {
            System.out.print("The numbers you entered do not add up to 10.");
        }

    }

    //Method/function that returns true or false depending upon if  two integer add up to 10
    public static boolean makes10(int tenOne, int tenTwo) {
        return tenOne + tenTwo == 10;
    }
}