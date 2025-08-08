import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions
        String[] Questions = { "Which of the following is a primitive data type in Java? ",
                "Which keyword is used to handle exceptions in Java? ",
                "In Java, which of these is an entry point for a program?" };

        String[][] options = { { "A: String", "B: Integer", "C: int", "D Array" },
                { "A: throw", "B: throws", "C: try...catch", "D: finally" },
                { "A: public static void main(String[] args)", "B: public void main(String[] args)",
                        "C: static void main(String[] args)", "D: void main()" } };

        int[] ans = { 3, 3, 1 };
        int guess;
        int score = 0;

        System.out.println("-------------------------------------------------");
        System.out.println("Welcome to the quiz game");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < Questions.length; i++) {
            System.out.println(Questions[i]);

            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter Your answer(1,2,3,4): ");
            guess = scanner.nextInt();

            if (guess == ans[i]){
                System.out.println("Correct");
                score++;
            }
            else{
                System.out.println("Wrong");
            }

        }

        System.out.println("Your score is: " + score);

        scanner.close();
    }

}
