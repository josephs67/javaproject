//encapsulation
package com;

//imports scanner
import java.util.Scanner;

//creates scanner object
public class InputClass {
    public Scanner scanner = new Scanner(System.in);

    //method to get the numbers
    public int getNumber(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}
