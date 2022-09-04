//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab3A {
    public static void main(String[] args){

        //declaring scanner and variables
        Scanner scan = new Scanner(System.in);
        float fltCredit;
        float fltAPR;
        float fltMinimumPayment;
        float fltMonthlyPercentage;

        //first output, get input and store
        System.out.print("Amount owed: $");
        fltCredit = scan.nextFloat();
        System.out.print("APR: ");
        fltAPR = scan.nextFloat();

        //math
        fltMinimumPayment = fltCredit * (fltAPR/100)/12;
        fltMonthlyPercentage = fltAPR/12;

        //output
        System.out.println("Monthly Percentage Rate: " + String.format("%.3f",fltMonthlyPercentage));
        System.out.println("Minimum payment: $" + String.format("%.2f",fltMinimumPayment));

    }
}