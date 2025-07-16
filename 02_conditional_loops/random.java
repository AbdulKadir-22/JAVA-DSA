import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(7);

        System.out.print("Your number is " + number);

        scanner.close();
    }
    
}
