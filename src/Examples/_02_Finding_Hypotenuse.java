package Examples;

import java.util.Scanner;

public class _02_Finding_Hypotenuse {

    /*
     Please look at 'Definitions._03_User_Input' and
     'Definitions._06_Math_Class' first, as this example
     relies on you knowing how to do user input and how
     to call and use the different math functions.
    */

    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x:");
        x = scanner.nextDouble();
        System.out.println("Enter side y:");
        y = scanner.nextDouble();

        /*
         To find the hypotenuse, we need to use an established
         formula. This being z = sqrt(x^2 + y^2).
         To do this in code, we can take advantage of some of
         the functions offered to us by the 'Math' class.
        */

        /*
         Note: In this example, the 'pow' function isn't
         entirely needed as x and y could just be multiplied
         by themselves to achieve the same results. This is
         more just to show that the 'Math' class does have
         a function for working with the powers of numbers.
        */
        z = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));

        System.out.println("The hypotenuse is: " + z);

        scanner.close(); // this is considered good practice

    }
}