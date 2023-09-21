package Definitions;

import java.util.Random;

public class _09_Switch_Statements {

    public static void main(String[] args) {

        /*
         A 'switch' statement can be considered a more advanced 'if' statement. It allows
         you to test the equality of a variable against a list of values. While functionally,
         they are very similar to 'if' statements, they are often more performance-friendly
         and easier to read than a large series of 'if' statements. Therefore, they should
         mainly be used as an alternative to having a large series of 'if' statements, though
         there are other reasons and scenarios to use them over an 'if' statement.
         Supported Data Types:
         ---------------------------------
                     | (Wrapper Classes)
         Primitive:  | Enumerated:
         ---------------------------------
         byte        | Byte
         short       | Short
         char        | Char
         int         | Integer
                     | String
         ---------------------------------
        */
        String day = "Friday";

        // example of a switch:
        switch (day) {
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
        }

        /*
         The 'break' lines are important to have as without them, the 'switch' statement will,
         after reaching a matching case, employ what is known as fallthrough. Fallthrough is
         when one case returns true, all cases below it will also now return true, allowing
         the switch statement to run the code for all following cases regardless of whether
         the case would actually return true. This will only happen until the 'switch'
         reaches another 'break' line. This functionality can be useful in certain situations.
         Another thing to note is much like with the `else` statement acting as a default for
         `if`, the `switch` statement also has a default, which is actually just named 'default'.
         This can be used to run something in the case that no other cases return true.
        */
        Random rand = new Random();

        // This will return a number between 0 and 11. Our 'switch' is looking for 1-10.
        int x = rand.nextInt(0, 12);

        // example of fallthrough and default:
        switch (x) {
            case 10: System.out.println(x + " = 10");
            case 9: System.out.println(x + " >= 9");
            case 8: System.out.println(x + " >= 8");
            case 7: System.out.println(x + " >= 7");
            case 6: System.out.println(x + " >= 6");
            case 5: System.out.println(x + " >= 5");
            case 4: System.out.println(x + " >= 4");
            case 3: System.out.println(x + " >= 3");
            case 2: System.out.println(x + " >= 2");
            case 1: System.out.println(x + " >= 1");
            break;
            default: System.out.println(x + " is not between 1 and 10.");
        }

        /*
         Like with 'if' statements, the 'switch' doesn't only need to test for one condition.
         You can chain multiple checks together by putting a comma between each value you want
         to check against.
         If you are setting the values of a variable within a 'switch' statement, you can just
         make the variable you are wanting to set the value of equal to the returned value of
         the 'switch' statement. When doing this method, the switch statement becomes
         exhaustive, meaning that all possible outcomes need to have a return value. Whether
         that means you make a case for each possible outcome or use 'default' to cover any
         additional outcomes not considered important is up to what you are looking to do.
         For our next examples, let's use these two things to randomize our days of the week.
        */

        // example of a variable equaling the returned value of the switch statement:
        day = switch (x) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Pizza";
        };

        // example of chaining checks:
        switch (day) {
            case "Saturday", "Sunday":
                System.out.println("Today is " + day + "!");
                System.out.println("It is the weekend!");
            break;
            case "Monday", "Tuesday", "Wednesday", "Thursday":
                System.out.println("Today is " + day + "!");
                System.out.println("It is a weekday...");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            default: System.out.println(day + " is not a day.");
        }

    }
}