//encapsulation
package com;

//tester class
public class Main {
    public static void main(String[] args) {

        //creating objects
        InputClass input = new InputClass();
        Calc calculator = new Calc(num1, num2);

        //starting menu
        System.out.println("Choose an operation:");
        System.out.println("1 = Addition");
        System.out.println("2 = Subtraction");
        System.out.println("3 = Multiplication");
        System.out.println("4 = Division");

        //gets choice
        int choice = input.getNumber("Enter your choice (1-4): ");

        //gets the numbers that will be used
        int num1 = input.getNumber("Enter the first number: ");
        int num2 = input.getNumber("Enter the second number: ");

        //assigns result to a varible
        double result = calculator.calculate(choice, num1, num2);

        //displays result
        System.out.println("The result is: " + result);
    }
}