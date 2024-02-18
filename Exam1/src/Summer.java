import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        //Initializing scanner and variables Doubles were used for more precision
        Scanner in = new Scanner(System.in);
        Double enterNum = 1.0;
        Double numSum = 0.0;
        //Loop that iterates as long as the user input is not equal to zero
        while (enterNum != 0) {
            //Takes input from user and sums it up until zero is entered
            System.out.print("Please enter a number(type 0 to exit): ");
            enterNum = in.nextDouble();
            numSum = numSum + enterNum;
        }
        //Prints out the sum to two decimal places
        System.out.printf("The sum of your entered numbers is: %.2f", numSum);
    }
}
