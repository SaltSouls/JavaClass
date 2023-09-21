package Definitions;

public class _06_Math_Class {

    /*
     The 'Math' class is useful if you ever need to do more complicated
     things with numbers. Some examples of these include finding the
     min and max between two numbers, or the absolute value of a number.
     It is worth looking through the 'Math' class to see all the
     different functions you can call to manipulate numbers.
    */

    public static void main(String[] args) {

        // example of finding the min and max
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double z1 = Math.min(x, y);

        System.out.println("Max number between 3.14 and -10 = " + z);
        System.out.println("Min number between 3.14 and -10 = " + z1);

        // example of finding the absolute value:
        double z2 = Math.abs(y);

        System.out.println("Absolute value of -10 = " + z2);

        // example of find the square root of a value:
        double x1 = 10;

        x1 = Math.sqrt(x1);

        System.out.println("Square root of 10 = " + x1);

        /*
         Rounding is a bit unique from the other functions as there are
         multiple different rounding functions. These functions are:

         'Math.round()' basic rounding
         'Math.ceil()'  rounding up
         'Math.floor()' rounding down
        */
        double x2 = Math.round(x);
        double x3 = Math.ceil(x);
        double x4 = Math.floor(x);

        System.out.println("Basic rounding 3.14 = " + x2);
        System.out.println("Rounding up 3.14 = " + x3);
        System.out.println("Rounding down 3.14 = " + x4);

    }
}