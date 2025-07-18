import java.util.Scanner;

// Write a program that reads a number in meters, converts it to feet, and displays the result.

public class conversions {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double meters,feet;

        System.out.print("\nEnter Number in Meters: ");
        meters = scanner.nextDouble();

        feet = meters * 3.28084;

        System.out.printf("%.3f meters in feet is: %.3f feet \n\n", meters, feet);

        scanner.close();
    }
    
}
