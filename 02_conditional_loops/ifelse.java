import java.util.Scanner;


public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int Age = scanner.nextInt();

        if(Age >= 18){
            System.out.println("You are an Adult");
        }

        else if(Age <=0){
            System.out.println("You are not even Born");
        }

        else{
            System.out.println("You are a Child");
        }
        

        scanner.close();
    }
}
