//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab3C {
    public static void main(String[] args){

        //define scanner and variable
        Scanner scan = new Scanner(System.in);
        int intQuarters;
        int intDimes;
        int intNickels;
        int intPennies;
        int intDollars;
        int intCents;

        //first output and get input
        System.out.print("Enter the number of quarters: ");
        intQuarters = scan.nextInt();

        System.out.print("Enter the number of dimes: ");
        intDimes = scan.nextInt();

        System.out.print("Enter the number of nickels: ");
        intNickels = scan.nextInt();

        System.out.print("Enter the number of pennies: ");
        intPennies = scan.nextInt();

        //math
        intDollars = (intQuarters * 25 + intDimes * 10 + intNickels * 5 + intPennies) / 100;
        intCents = (intQuarters * 25 + intDimes * 10 + intNickels * 5 + intPennies) % 100;

        //output
        System.out.println();
        System.out.println("You entered " + intQuarters + " quarters.");
        System.out.println("You entered " + intDimes + " dimes.");
        System.out.println("You entered " + intNickels + " nickels.");
        System.out.println("You entered " + intPennies + " pennies.");
        System.out.println("");
        System.out.println("Your total is " + intDollars + " dollars and " + intCents + " cents.");


    }
}