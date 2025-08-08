import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   

        System.out.println("Enter how many you want to input: ");
        int enter = scanner.nextInt();
        int[] numbers = new int[enter];
        int total = 0;

        for (int i = 0;i < enter;i++ ){
            System.out.printf("Enter Num #%d: ", i + 1);
            numbers[i] = scanner.nextInt();  
        }

        for (int num : numbers) {
            total += num;
        }

        System.out.printf("Total: %d\n", total); 
        scanner.close();
    }
}
