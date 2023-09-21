package Definitions;

public class _02_Variables {

    /*
     Data Types:
     -------------------------------------------------------------------------------
     boolean |         | 1 bit   | primitive | true or false (1 or 0)
     byte    | 1 byte  | 8 bits  | primitive | -128 to 127
     short   | 2 bytes | 16 bits | primitive | -32,768 to 32,767
     int     | 4 bytes | 32 bits | primitive | -2 billion to 2 billion
     long    | 8 bytes | 64 bits | primitive | -9 quintillion to 9 quintillion
     -------------------------------------------------------------------------------
     float   | 4 bytes | 32 bits | primitive | fraction number up to 6-7 digits
             |         |         |           | example: 3.141592f
     double  | 8 bytes | 64 bits | primitive | fraction number up to 15 digits
             |         |         |           | example: 3.141592653589793
     -------------------------------------------------------------------------------
     char    | 2 bytes | 16 bits | primitive | single character/letter/ASCII value
             |         |         |           | example: 'f'
     String  | varies  | varies  | reference | a sequence of characters/letters/ASCII values
             |         |         |           | example: "Hello World!"
     -------------------------------------------------------------------------------
    */

    /*
     Primitive vs. Reference Data Types:
     ------------------------------------------------------------------
     Primitive:                      | Reference:
     - 8 types (boolean, byte, etc.) | - unlimited (user defined)
     - stores data                   | - stores an address
     - can only hold one value       | - can hold more than one value
     - less memory                   | - more memory
     - fast                          | - slower
     ------------------------------------------------------------------
    */

    public static void main(String[] args) {

        // some examples on declaring variables:
        int w; // declaration
        w = 1000000000; // assignment
        System.out.println("Int = " + w);

        /*
         You can also declare and assign in a single line. When you do this, it is
         called initialization. This is what you will be doing most of the time,
         but there are reasons/occasions to use the other method as well.
        */
        boolean isCorrect = true; // initialization
        System.out.println("Boolean = " + isCorrect);

        /*
         Longs and floats must have their corresponding suffix added at the end
         of the defined number; otherwise the compiler will try to read them as
         and int or a double instead.

         You can also see when running the code that the float/double will
         automatically round the number down to the nearest decimal place if
         it is above the allowed amount. This makes doubles better for getting
         more precise numbers/measurements.
        */
        long x = 1000000000000000000L; // must be uppercase
        float y = 1.63254791567890256f; // case-insensitive
        double z = 1.63254791567890256; // doesn't need an identifier
        System.out.println("Long = " + x);
        System.out.println("Float = " + y);
        System.out.println("Double = " + z);

        char symbol = '@'; // Chars must be in single quotes.
        System.out.println("Symbol = " + symbol);

        // All reference data types begin with a capital letter.
        String name = "Your Name Here"; // strings must be in double quotes
        System.out.println("Name = " + name);

    }
}