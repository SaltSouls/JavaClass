package Definitions;

import java.util.Scanner; // this is an import
/*
 Imports are a way to bring in functions from other sections of your
 own code or sections of the built-in java libraries into the file
 you're currently working on. You can also import code from 3rd party
 libraries or APIs, but we'll get into that later.

 Most IDEs have a way to auto import the code needed when you type the
 name of a function. Generally this is done by typing the name, and
 then hovering over the text and selecting the import option that
 appears. Some IDEs may differ in their approach to quick imports.
*/

public class _03_User_Input {

    public static void main(String[] args) {

        /*
         Scanners can be used to take user input among other things.
         This is done by using creating a new scanner that takes an
         input using 'System.in'.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        /*
         This will take in the next line printed and stores it as a
         string, but seeing as how we called it via the scanner,
         the next line being printed will be the line the user inputs.

         Note that the nextLine function only returns the input as a
         string. Meaning you will need to use other methods to store
         other variables types.
        */
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        // example of taking in an int
        System.out.println("How old are you? ");
        int age = scanner.nextInt(); // gets the next int input
        System.out.println("So you're " + age + " years old?");
        /*
         One thing to be careful of is to make sure you don't input
         the wrong variable type into a scanner looking for a
         specific type; the program will throw an error. This can
         be handled later when we learn how to make certain checks.
        */

        /*
         The other thing to keep in mind is that 'nextLine' is
         looking for a line terminator (the enter key being pressed
         or '\n') at the end of a string to determine what it needs
         to take in. Because the last scanner only looks for an int,
         it leaves behind the line terminator from when we press
         enter to input it. This will result in the next input
         gotten from 'nextLine' to be completely skipped as it will
         immediately find a line terminator and think that's the
         input. This can be remedied in a couple ways, but the one
         we'll use here is by calling 'nextLine' before twice, once
         to clear the scanner, and the second to get the input.
        */
        System.out.println("What is your favorite food?");
        scanner.nextLine();
        String food = scanner.nextLine();
        System.out.println("That's crazy! I also like " + food + "!");

    }
}