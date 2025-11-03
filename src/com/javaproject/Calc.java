//encapsulation
package com;

public class Calc{

    //method for addition
    public int add(int a, int b) {
        return Math.addExact(a, b);
    }

    //method for subtraction
    public int subtract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    //method for multiplication
    public int multiply(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    //method for division
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.print("Division by zero");
        }
        return (double) a / b;
    }

     //hooses the correct operation 
    public double calculate(int choice, int a, int b) {

        if (choice == 1) {
            return add(a, b);

        } else if (choice == 2) {
            return subtract(a, b);

        } else if (choice == 3) {
            return multiply(a, b);

        } else if (choice == 4) {
            return divide(a, b);

        } 
        //if anything besides 1,2,3,4 is entered it will be declared an invalid choice
        else {
            System.out.println("Invalid choice");
            return 0;
        }
    }
}


