package Definitions;

import java.util.Random;

public class _10_Logical_Operators {

    /*
     This section builds off knowledge learned in 'Definitions._08_If_Statements'.
     Please make sure to go over that section thoroughly before reading through this.
     The 'NOT' operator was already gone over in 'Definitions._08_If_Statements',
     but we will touch on it briefly here as well as it is one of the logical
     operators you can use.
    */

    public static void main(String[] args) {

        /*
         Logical operators are used to connect two or more expressions or modify the
         accepted return value of an expression. These are useful if you are trying
         to make more specific conditions to check for when using statements such as
         the 'if' statement. These operators are as follows:
         '&&' (AND) both conditions must return true
         '||' (OR) either condition must return true
         '!'  (NOT) reverses the boolean value of the condition
        */
        Random rand = new Random();

        int x = rand.nextInt(0, 2);

        boolean a = true;
        boolean b;

        // 50% chance for 'b' to be false
        if (x == 0) { b = false; }
        else { b = true; }

        System.out.println("Test 1:");

        // example of 'AND' operator:
        if (a && b) {
            System.out.println("Both A and B are true!");
        }
        else {
            System.out.println("Either A or B are false!");
        }

        // example of 'NOT' operator:
        if (!b) {
            // 25% chance for 'a' to be false if 'b' is false.
            x = rand.nextInt(0, 4);
            if (x == 0) { a = false; }
        }

        System.out.println("Test 2:");

        // example of 'OR' operator:
        if (a || b) {
            System.out.println("Either A or B are true!");
        }
        else {
            System.out.println("Both A and B are false!");
        }

    }
}