
public class Car{
    String make = "Ferrari";
    String model = "Scuderia";
    int year = 2025;
    double price = 800000;
    boolean isRunning = false;
    
    void start(){
        System.out.println("You are starting the car");
    }

    void stop(){
        System.out.println("Your are stopping the car");
    }

    void drive(){
        System.out.println("You Drive a " + model +" " + make);
    }
}