package Exercises;

import java.util.Scanner;

public class GradingCalculator {
    public static void main(String[] args) {

        Scanner gradeInput = new Scanner(System.in);
        System.out.println("Enter your grade => ");
        int grade = gradeInput.nextInt();

        while (grade >= 0 && grade <= 100) {

            if (grade > 93) {
                System.out.println("Your grade is: A");
            } else if (grade > 90) {
                System.out.println("Your grade is: A-");
            } else if (grade > 84) {
                System.out.println("Your grade is: B+");
            } else if (grade > 81) {
                System.out.println("Your grade is: B");
            } else if (grade > 77) {
                System.out.println("Your grade is: C+");
            } else if (grade > 73) {
                System.out.println("Your grade is: C");
            } else if (grade > 70) {
                System.out.println("Your grade is: C-");
            } else if (grade > 65) {
                System.out.println("Your grade is: D");
            } else {
                System.out.println("Your grade is: F");
            }
            System.out.println();
            System.out.println("Enter your grade => ");
            grade = gradeInput.nextInt();
        }

        System.out.println("Please make sure your grade input is between 0 and 100.");
        gradeInput.close();
    }
}
