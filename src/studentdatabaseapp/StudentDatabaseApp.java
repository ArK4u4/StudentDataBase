package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main (String[] args) {
        // Ask how many user we want to add
        System.out.println ("Enter the number of new student to enroll each course have same fee which is Rs.500:");
        Scanner in = new Scanner (System.in);
        int nuOfStudent = in.nextInt ();
        Student[] students = new Student[nuOfStudent];
        // Create n number of student
        for (int n = 0; n < nuOfStudent; n++) {
            students[n] = new Student ();
            students[n].enroll ();
            students[n].payTuition ();
        }
        for (int n = 0; n < nuOfStudent; n++) {

            System.out.println (students[n].toString ());
        }
    }
}
