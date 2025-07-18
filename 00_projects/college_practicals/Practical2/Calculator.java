import java.util.Scanner;

//A program for Calculator

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter #1 Number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter What operation you want to do (+,-,*,/,^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter #2 Number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("cannot divide by zero");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);

            default -> {
                System.out.print("Enter Valid Input");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.printf("Your result is: %.2f", result);
        }

        scanner.close();
    }
}
