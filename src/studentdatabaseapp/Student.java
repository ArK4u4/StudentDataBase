package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int graderYear;
    private String courses="";
    private String studentID;
    private int tuitionBalance=0;
    private static int courseCost = 500;
    private static int id = 1000;


    // Constructor:Ask user to enter name and year

    public Student(){
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter student first name: ");
        this.firstName = in.nextLine ();
        System.out.println ("Enter Student last name");
        this.lastName = in.nextLine ();
        System.out.println ("1- Basic\n1- Advance\n3- Junior\n4- Master\nEnter course number to select:");
        this.graderYear=in.nextInt ();
        //doSystem.out.println (firstName+" "+lastName+" "+ "your course is "+this.graderYear+" "+studentID);
        setStudentID ();

    }
    // Generate ID
    private void setStudentID(){
        // Grade level +id
        id++;
       this.studentID = graderYear +""+id;
        System.out.println (this.studentID);
    }
    //Enrollment in course
    public void enroll(){
        //Get inside a loop , user hit Q
        do {
        System.out.print("Enter course to enroll (Q for quit) :");
        Scanner in = new Scanner(System.in);
        String course =in.nextLine ();
        if (!course.equals("Q")){
            courses = courses + "\n"+ course;
            tuitionBalance = tuitionBalance+courseCost;
        }
        else {
            break;
        }
        }while (1!=0);
    }
    //View balance
    public void viewBalance() {
       System.out.println ("you need to pay Rs."+ tuitionBalance+"\tfor selected courses ");
    }
    // pay Tuition
    public void payTuition(){
            //viewBalance();
            System.out.println ("Enter the Amaount you want to pay now in Rs.");
            Scanner in = new Scanner (System.in);
            int payment = in.nextInt ();
            tuitionBalance = tuitionBalance - payment;
            System.out.println ("Thanks you for your payment of Rs."+payment);
            viewBalance();
    }
        //Show Status

        public String toString(){
            return "Name: " + firstName+ " "+ lastName+
                    "\nCourse Enrolled:\t"+"\t"+courses+
                    "\nStudent ID:"+studentID+
                    "\nGarde level:"+graderYear+
                    "\nRemaining Balance to pay : Rs."+tuitionBalance;
        }
}
