package com.codeup;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);


//        Tells whether or not what the user entered is a number
        if(StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is a number.");
        } else {
            System.out.println(userInput + " is not a number.");
        }


//        Flips the case of the string
        System.out.println(StringUtils.swapCase(userInput));

//        Reverses the string
        System.out.println(StringUtils.reverse(userInput));

    }
}
