package Definitions;

import java.util.Random;

public class _08_If_Statements {

    public static void main(String[] args) {

        /*
         Please look at 'Definitions._07_Random_Numbers' for and
         understanding on how to use the random class and its functions.
        */
        Random rand = new Random();

        int age = rand.nextInt(1, 101);
        System.out.println("Your age is " + age + ".");

        /*
         An 'if' statement is one of the simplest forms of conditionals.
         All they do is test to see if the conditions inside their
         parenthesis are true, and if so, will then preform the block of
         code within the curly brackets. Some comparison operators that
         can be used are as follows:

         '==' equal to
         '>' greater than
         '<' less than
         '>=' greater than or equal to
         '<=' less than or equal to
         '!=' not equal to

         The '=' is an assignment operator and should not be used inside
         a conditional as that just sets the variable equal to whatever
         the value is that follows the '=' sign.
        */
        // example of an 'if' statement:
        if (age >= 50) {
            System.out.println("Oh boy! Here comes a boomer!");
        }

        /*
         The '!' sign can be read as "not" when reading a conditional aloud.
         You can invert a check by including the '!' right before the
         conditional if the variable the conditional is checking is a boolean.
         If they aren't a boolean or the statement contains more than one
         condition, then it needs to be formatted as such:

         '!(check(s))'

         This, in essence, is saying if the check is not true, run the code.
        */
        // example of an inverted boolean check:
        boolean isTrue = rand.nextBoolean();

        if(!isTrue) {
            System.out.println("isTrue is false");
        }

        // example of inverted equals check:
        if (!(age >= 50)) {
            System.out.println("You don't look like a boomer.");
        }

        /*
         You can also use the 'else' statement to run code in the case of the
         previous not returning true. 'else' statements can't take conditions.
         You can combine the 'else' statement with an 'if' statement to check
         for another condition if the previous one returned false.

         An 'else' statement should only be used at the end of a series of
         checks as it acts as a default go-to if none of the other conditions
         results are true. If put in the middle of a series of checks, the
         'else' statement will be triggered before the other checks can be
         evaluated and will skip any checks after it.
        */
        int age1 = rand.nextInt(1, 101);
        System.out.println("Your age is " + age1 + ".");

        // example of a chaining checks:
        if (age1 >= 50) {
            System.out.println("Oh boy! Here comes a boomer!");
        } else if (age1 >= 18) { // example of 'else if' statement:
            System.out.println("You don't look like a boomer.");
        } else { // example of 'else' statement:
            System.out.println("You're still a child.");
        }

        /*
         As a note, you should always try to organize your checks in an
         orderly manner. If you don't do this, then much like with the
         'else' statement, it will get to a statement that evaluates as
         true before being able to run through any of the other checks.
        */
        // example of improperly organized statements:
        if (age1 >= 18) { // prevents statement two from being checked
            System.out.println("You don't look like a boomer.");
        } else if (age1 >= 50) { // will always return false
            System.out.println("Oh boy! Here comes a boomer!");
        } else {
            System.out.println("You're still a child.");
        }
        /*
         As you can see here, because anything over the age of 18 will cause
         the first statement to be true, the second statement will always be
         skipped as if the first statement isn't true, then the second can't
         be either; and if the first statement is true, then it won't bother
         checking the second statement as it already got a true response.
        */

    }
}