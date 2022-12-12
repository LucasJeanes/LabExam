package ie.atu;

import java.io.*;
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

        System.out.println("All details entered, printing values now: ");
        System.out.println(student_A);

        System.out.println("\nEnter a filename to store the student's info (example.txt): ");
        userInputStr = input.next();

        try {
            PrintWriter studentFile = new PrintWriter(new FileWriter(userInputStr, true));
            studentFile.println("Student Name: " + student_A.getName());
            studentFile.println("Student id: " + student_A.getIdNum());
            studentFile.println("Student Address: " + student_A.getAddress());
            studentFile.println("Student Age: " + student_A.getAge());
            studentFile.close();
            System.out.println("Information entered has been saved in: " + userInputStr + "\n");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try{
            File studentFile = new File(userInputStr);
            Scanner fileReader = new Scanner(studentFile);
            System.out.println("Printing data saved in: " + userInputStr);
            while(fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred, File not Found!");
            e.printStackTrace();
        }
    }
}
