//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab3B {
    public static void main(String[] args){

        //declaring scanner and variables
        Scanner scan = new Scanner(System.in);
        float fltClass1Hours, fltClass2Hours, fltClass3Hours, fltClass4Hours;
        float fltClass1Grade, fltClass2Grade, fltClass3Grade, fltClass4Grade;
        float fltClass1QP, fltClass2QP, fltClass3QP, fltClass4QP;
        float fltTotalHours;
        float fltTotalQP;
        float fltGPA;

        //get input
        System.out.print("Course 1 hours: ");
        fltClass1Hours = scan.nextFloat();
        System.out.print("Grade for course 1: ");
        fltClass1Grade = scan.nextFloat();
        fltClass1QP = fltClass1Hours * fltClass1Grade;

        System.out.print("Course 2 hours: ");
        fltClass2Hours = scan.nextFloat();
        System.out.print("Grade for course 2: ");
        fltClass2Grade = scan.nextFloat();
        fltClass2QP = fltClass2Hours * fltClass2Grade;

        System.out.print("Course 3 hours: ");
        fltClass3Hours = scan.nextFloat();
        System.out.print("Grade for course 3: ");
        fltClass3Grade = scan.nextFloat();
        fltClass3QP = fltClass3Hours * fltClass3Grade;

        System.out.print("Course 4 hours: ");
        fltClass4Hours = scan.nextFloat();
        System.out.print("Grade for course 4: ");
        fltClass4Grade = scan.nextFloat();
        fltClass4QP = fltClass4Hours * fltClass4Grade;

        //math
        fltTotalHours = fltClass1Hours + fltClass2Hours + fltClass3Hours + fltClass4Hours;
        fltTotalQP = fltClass1QP + fltClass2QP + fltClass3QP + fltClass4QP;
        fltGPA = fltTotalQP / fltTotalHours;

        //output
        System.out.println("");
        System.out.println("Total hours is: " + String.format("%.0f", fltTotalHours));
        System.out.println("Total quality points is: " + String.format("%.0f", fltTotalQP));
        System.out.println("Your GPA for this semester is " + fltGPA);

    }
}