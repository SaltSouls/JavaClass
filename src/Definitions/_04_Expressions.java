package Definitions;

public class _04_Expressions {

    /*
     Expressions are a combination of operands and operators.
     Operands:    | Operators:
     -------------|---------------------
     values       | '+' addition
     variables    | '-' subtraction
     numbers      | '*' multiplication
     quantity     | '/' division
                  | '%' modulo
     -----------------------------------
     '%' modulo is a unique one from the other operators as,
     instead of being a standard mathematical symbol associated
     with a type of operation, it is used to get the remainder
     from a division operation. If there is no remainder, then
     the output will always be 0.
    */

    public static void main(String[] args) {

        // example of modulo:
        int x = 10;
        x = x % 3;

        // example of division:
        float y = 10;
        y = y / 3;

        System.out.println("Modulo 10/3 = " + x);
        System.out.println("10/3 = " + y);

        /*
         A thing to note is that when dividing using ints that if the
         division does not result in a whole number, the decimals will
         end up being truncated as ints aren't capable of containing
         fractions of a number.
        */
        int x1 = 10;
        x1 = x1 / 3;

        System.out.println("Int 10/3 = " + x1);

        /*
         This can be fixed if we cast the result to a float or double,
         using a new variable to be able to store the cast variable.
         To cast a variable, you need to put the new type inside '()'
         before the variable you are casting.
         Side Note:
         Generally most IDEs will tell you if you need to cast a
         variable. That and you don't need to cast unless you are
         converting a variable of one type into another type. That
         is why you use two different variables, one that's the
         original type, and one to store the new cast type.
        */
        x1 = 10;
        // example of how to cast 'x1' to a float:
        float x2 = (float) x1 / 3;

        System.out.println("Cast Int 10/3 = " + x2);

        /*
         You can also quickly add or subtract 1 from a variable
         by using a special operators. Those are '++' and '--'.
        */
        // example of quick addition:
        int y1 = 10;
        y1++;

        // example of quick subtraction:
        int y2 = 10;
        y2--;

        System.out.println("Quick Addition 10++ = " + y1);
        System.out.println("Quick Subtraction 10-- = " + y2);

    }
}