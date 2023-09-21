package Definitions;

public class _01_Print {

    // This is how to make a normal comment.

    /*
     This is how to do a multi-line comment.
     Pretty cool, right?

     For some clarification, a comment is a line(s) in your code that the computer will
     ignore when running the program. When the code is compiled, the comments are
     stripped away, so that only the actual code your program needs remains. It is
     considered good practice to make use of comments to describe what sections of code
     are doing, especially when working with other people or on complicated code, that
     way the code and what it is doing is easier to read and understand. Comments have
     no effect on your code performance or size when it comes time to run or compile it;
     so you can make liberal use of comments whenever you think they will be of help.
    */

    /*
     The program won't run without the main method. This method can be typed by hand, or
     can be made faster in IntelliJ by typing 'main' and then hitting tab to autocomplete.
    */
    public static void main(String[] args) {

        /*
         Code moves from top to bottom in the main method, and each statement must end with
         ';' to let the compiler know the statement is over.

         Like the main method, the 'println' function can be typed faster by typing 'sout'
         and then hitting tab to autocomplete. You will also be given multiple options of
         print functions to pick from before hitting tab.
        */
        System.out.println("Hello world!"); // prints the line and creates a new line after
        System.out.print("Test Line 2."); // prints to same line

        /*
         There are also special character sets that can be used in print
         functions that have different meaning. These are called escape
         sequences. Some escape sequences and what they do are as follows:

         '\n' creates a new line, much like how println does
         '\t' emulates a tab spacing
         '\"' is used to display double quotes
         '\\' when in doubles quotes are used to display a backslash

         In essence, the backslash is used as a way to escape the current
         string in question. These do need to be followed with something,
         though as otherwise the compiler will throw an error as the
         string never closes again.
        */
        System.out.print(" The next output will be on a new line!\n");
        System.out.println("\tThis line has a tab at the beginning!");
        System.out.println("\"Insert meaningful quote here.\"");
        System.out.println("Here is a backslash in quotes \"\\\".");

        /*
         Print can take in strings "", numbers (int, double, float, etc...),
         or function results. You can also combine multiple variables within
         a print function using the '+' symbol between the two variable types.
        */
        int someNumber = 10;
        System.out.print("someNumber = " + someNumber);

    }
}