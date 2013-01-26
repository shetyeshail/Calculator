package p752calculator;
//BDF4 Programming
//Intent: Make a calculator

import java.util.Date;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        //initialize variables
        double numOne, numTwo, answer = 0;
        String temp = new String();
        char operation;
        Scanner reader = new Scanner(System.in);
        //get user input
        System.out.println("Enter the first number");
        numOne = reader.nextDouble();
        System.out.println("Enter the second number");
        numTwo = reader.nextDouble();
        System.out.println("Enter the operation you would like to use");
        System.out.println("(A)ddition, (S)ubtraction, (M)ultiplication, (D)ivison");
        temp = reader.nextLine();
        //calculate
        operation = temp.charAt(0);

        switch (operation) {
            case A:
            case a: {
                answer = numOne + numTwo;
            }
            ;
            break;
            case S:
            case s: {
                answer = numOne - numTwo;
            }
            ;
            break;
            case M:
            case m: {
                answer = numOne * numTwo;
            }
            ;
            break;
            case D:
            case d: {
                answer = numOne / numTwo;
            }
            ;
            break;
            default:
                System.out.println("Not a valid operation");
        }

        System.out.println("The answer is: " + answer);
    }//ends main
}//ends class p752Calc
