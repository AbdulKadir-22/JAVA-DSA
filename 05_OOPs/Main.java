public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Abdulkadir", 18, 8.8);
        Student student2 = new Student("Alfisha", 19, 9.9);
        Student student3 = new Student("Zed", 18, 9.28);
        Student student4 = new Student("MZed", 18, 9.22);

        Student students[] = { student1, student2, student3, student4 };

        for (Student student : students) {
            student.display();
            System.out.println();
        }

        Student.showStudent();
    }

}
