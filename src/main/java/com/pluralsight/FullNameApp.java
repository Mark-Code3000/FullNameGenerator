package com.pluralsight;

import java.util.Scanner;

public class FullNameApp {

    //create a scanner to take user input
    public static Scanner nameScanner = new Scanner(System.in);


    public static void main(String[] args) {
        /*
The user will always have a first and last name, they may also have a middle
name and a suffix (ex. Jr, PhD). If a user does not enter a value for the middle
name or suffix, the full name should not include that part of the name. If the user
has a suffix in their name, the full name should include a comma before the
suffix
 */


        //prompt the user with a question
        //this is using this is using System.out.print to
        System.out.println("Please enter your name");
        System.out.print("First name: ");

        //this will capture the input from the user for the first question/prompt and store it
        //in the firstName variable

        String firstName = nameScanner.nextLine().trim();

        // we will now prompt the user again for their middle name
        System.out.print("Middle name: ");

        //here we will store the middleName variable
        String middleName = nameScanner.nextLine().trim();

        //and a similar prompt for lastName
        System.out.print("Last name: ");

        //here we will store the lastName variable
        String lastName = nameScanner.nextLine().trim();

        //and now a suffix
        System.out.print("Suffix: ");

        //storing the suffix
        String suffix = nameScanner.nextLine().trim();

        //strat the full name variable and start with first name
        String fullName = firstName;

        // if the middle name is not empty
        //apply the middle name

        if (!middleName.isBlank()){
            fullName += " " + middleName + " ";

            // long version above
            // fullName = fullName + " " + middleName + " ";
        }

        //append the last name

        fullName += lastName;

        //if the middle name is not empty
        //apply middle name

        if (!suffix.isBlank()){
            fullName += ", " + suffix;

        }

        //display results of stored user prompts

        System.out.println(fullName);

    }

}
