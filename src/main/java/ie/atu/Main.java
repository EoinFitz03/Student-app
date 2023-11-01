package ie.atu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student1 = new Student("Eoin", "EoinFitz28@gmail.com", " science");
        System.out.println("Details are " + student1.getName());

        student1.displayInfo();
    }
}