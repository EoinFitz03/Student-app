package ie.atu;

import java.util.Scanner;

public class Student {
    String name;
    String email;
    String course;


    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public Student() {
        this.name = "";
        this.email = "";
        this.course = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nemail: " + email + "\ncourse: " + course);
    }


    public void getUserinput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name for second student: ");
        this.name = scanner.nextLine();

        System.out.println("Enter email for second student: ");
        this.email = scanner.nextLine();

        System.out.println("Enter course for second student : ");
        this.course = scanner.nextLine();

    }

}