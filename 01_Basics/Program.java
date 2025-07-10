import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String Name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int Age = scanner.nextInt();

        System.out.print("Enter Your GPA: ");
        double GPA = scanner.nextDouble();

        System.out.print("Enter Your grade: ");
        char Grade = scanner.next().charAt(0);

        System.out.println("Your name is " + Name);
        System.out.println("Your Age is " + Age);
        System.out.println("Your GPA is " + GPA);
        System.out.println("Your Grade is " + "\"" + Grade + "\"");

        scanner.close();
    }
}
