public class Student {
    String name;
    int age;
    double cgpa;
    boolean isEnrolled;

    Student(String name, int age, double cgpa){
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.isEnrolled =true;
    }

    void display(){
        System.out.println(this.name + " got the highest cgpa");
    }
}
