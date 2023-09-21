package Examples;

public class _01_Variable_Swapping {

    /*
     Please look at 'Definitions._02_Variables' first, as
     this example relies on you knowing how variables work.
    */

    public static void main(String[] args) {

        /*
         Here we are trying to swap the contents of x and y.
         In this first example, we can see that by making x
         equal to y, it overrides the original value of x,
         meaning that now both x and y equal the same thing.
        */
        String x = "water";
        String y = "Kool-Aid";

        x = y;

        System.out.println("Test 1:");
        System.out.println("Cup 1: " + x);
        System.out.println("Cup 2: " + y);

        /*
         By creating another variable, we can however store the
         value of x before transferring it to y and vice-versa.
         So let's try this one more time.
        */
        x = "water"; // We aren't declaring the types again as we did that in
        y = "Kool-Aid"; // the above example. We just need to reset their values.
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("Test 2:");
        System.out.println("Cup 1: " + x);
        System.out.println("Cup 2: " + y);

    }
}