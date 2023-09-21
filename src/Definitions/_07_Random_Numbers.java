package Definitions;

import java.util.Random;

public class _07_Random_Numbers {

    public static void main(String[] args) {

        /*
         The random numbers generated from the random class are not going
         to be true random numbers, but rather pseudo random. These things
         are pretty close, but if you are looking to do true random numbers,
         then you will need to use a different method.
        */
        Random random = new Random();

        int x = random.nextInt();
        System.out.println("Random number = " + x);

        /*
         Using the 'nextInt' function, we can also choose to limit the
         size that our random numbers can reach. Without limiting it,
         the number can be anywhere from -2 billion to 2 billion. To
         limit this, all you need to do is put a number in the
         parentheses to set the maximum allowed. Though by doing this,
         the maximum number will always be one lower than the max as
         computers always start at zero and not one. One way to fix this
         is to just add one to the random number. Another way is to set
         the origin and then set the bounds. This will make sure the
         random number always begins at the origin rather than 0.
        */
        // example of basic addition:
        int x1 = random.nextInt(6) + 1;
        System.out.println("D6 result = " + x1);

        /*
         A thing to note about using the origin method is that it still
         doesn't allow you to reach the max number listed. An easy way
         to get around this is to just set your bound number one higher
         than the max you are looking to get.
        */
        // example of origin:
        int x2 = random.nextInt(1, 21);
        System.out.println("D20 result = " + x2);

        /*
         Much like ints, random can also be used for things like doubles,
         floats, booleans, etc...
        */
        // example of random double:
        double y = random.nextDouble();
        System.out.println("Random double = " + y);

        // example of random boolean:
        boolean z = random.nextBoolean();
        System.out.println("Random boolean = " + z);

    }
}