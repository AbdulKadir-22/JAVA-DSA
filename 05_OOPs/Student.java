public class Student {
    String name;
    int age;
    double cgpa;
    boolean isEnrolled;
    static int noOfStudents;

    Student(String name, int age, double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.isEnrolled =true;
        noOfStudents++;
    }

    void display(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.cgpa);
    }

    static void showStudent(){
        System.out.println("Total number of students we have are: " + noOfStudents);
    }
}
