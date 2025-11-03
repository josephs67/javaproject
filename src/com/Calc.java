//encapsulation
package com;

public class Calc{

//attributes and constructor
    private int num1;
    private int num2;

    public Calc(int a, int b){
        num1 = a;
        num2 = b;
    }

    //method for addition
    public int add(int num1, int num2) {
        return Math.addExact(num1, num2);
    }

    //method for subtraction
    public int subtract(int num1, int num2) {
        return Math.subtractExact(num1, num2);
    }

    //method for multiplication
    public int multiply(int num1, int num2) {
        return Math.multiplyExact(num1, num2);
    }

    //method for division
    public double divide(int num1, int num2) {
        if (b == 0) {
            System.out.print("Division by zero");
        }
        return (double) a / b;
    }

     //hooses the correct operation 
    public double calculate(int choice, int num1, int num2) {

        if (choice == 1) {
            return add(num1, num2);

        } else if (choice == 2) {
            return subtract(num1, num2);

        } else if (choice == 3) {
            return multiply(num1, num2);

        } else if (choice == 4) {
            return divide(num1, num2);

        } 
        //if anything besides 1,2,3,4 is entered it will be declared an invalid choice
        else {
            System.out.println("Invalid choice");
            return 0;
        }
    }
}