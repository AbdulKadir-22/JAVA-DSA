import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int temp = x;
        int y = 0;

        while (temp != 0) {
            int digit = temp % 10;
            y = y * 10 + digit;
            temp = temp / 10;
        }

        if (y == x) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
