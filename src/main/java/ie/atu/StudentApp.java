package ie.atu;

import javax.xml.stream.events.StartDocument;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        String userInputStr;
        Integer userInt;
        Scanner input = new Scanner(System.in);

        Student student_A = new Student();

        System.out.println("Enter the student's name: ");
        userInputStr = input.next();
        student_A.setName(userInputStr);

        System.out.println("Enter the student's address: ");
        userInputStr = input.next();
        student_A.setAddress(userInputStr);

        System.out.println("Enter the student's ID: ");
        userInt = input.nextInt();
        student_A.setIdNum(userInt);

        System.out.println("Enter the student's age: ");
        userInt = input.nextInt();
        student_A.setAge(userInt);

        System.out.println(student_A);
    }
}
