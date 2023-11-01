package ie.atu;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Eoin", "EoinFitz28@gmail.com", " science\n");
        System.out.println("Details for first student are");

        student1.displayInfo();

        Student student2 = new Student();
        student2.getUserinput();
    }
}