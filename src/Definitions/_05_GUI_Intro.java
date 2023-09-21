package Definitions;

import javax.swing.JOptionPane;

public class _05_GUI_Intro {

    public static void main(String[] args) {

        /*
         'JOptionPane' is a class that gives us several functions to make
         basic GUI interfaces. GUIs can get a lot more complicated as you
         begin to customize them, but here we will keep them simple.
        */
        String name = JOptionPane.showInputDialog("Enter Your Name:");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");

        /*
         You can't normally pass 'showInputDialog' into an int as it tries
         to return a string; but by using the 'Integer' wrapper class and
         the 'parseInt' function to grab an integer from the string we can.

         Much like in 'Definitions._03_User_Input', if you put in something
         other than the desired variable type, it will cause the program to
         crash. This, again, can be remedied using checks; of which we will
         learn more about later.
        */
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age:"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old?");

        // This can also be done with more than just ints, as shown here.
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height:"));
        JOptionPane.showMessageDialog(null, "You are " + height + " feet tall?");

    }
}