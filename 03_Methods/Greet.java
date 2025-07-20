public class Greet {
    static String greetUser(String name) {
        return "Welcome, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greetUser("Yusu"));
    }
}