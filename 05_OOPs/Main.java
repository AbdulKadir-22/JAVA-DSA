public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Abdulkadir",18, 8.8);
        Student student2 = new Student("Alfisha",19, 9.9);
        Student student3 = new Student("Zed",18, 9.28);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.cgpa);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.cgpa);
        student2.display();

        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.cgpa);
    }
 
    
}
