package com.company;
//importing scanner to get input from the user.
import java.util.Scanner;

public class MyClass {
    // Single Line Commenting.
    /*
    Multi Line Commenting.
     */

    public static void main(String[] args)
    {
        //declaring an integer and assigning a value to it.
        //declaring a String and assigning a string to it.
        int s = 5;
        String str = "Hello World";
        Scanner scan = new Scanner(System.in);
        int userInput = 0;


        /*constants value can only be assigned once. naming convention typically uses UPPER_SNAKE_CASE
         attempting to assign a new value to the constant will result in an error and the program won't compile.
         */
        final int MY_CONSTANT;
        MY_CONSTANT = 0;


        while (userInput <= MY_CONSTANT) {
            System.out.println("Enter an integer greater than zero: ");
            userInput = scan.nextInt();

            if (userInput <= MY_CONSTANT) {
                System.out.println("Not a valid input, try again.");

            } else {
                System.out.println("Nice job. The integer you put in is: " + userInput);
            }
        }
        int x = 2;
        int y = x;

        x = 3;


        System.out.println("x's value is: "+x);
        System.out.println("y's value is: "+y);
        // int y takes x's value before x is assigned a new one. so y prints out as 2 rather than 3. order of code matters.

        // Primitive data types
        // Four of java's 8 primitive data types are for storing integers.
        byte q = 127;
        // byte stored in 8bits. min value is -128. max value is 127. (2 to the 7th power -1)

        short w = 32767;
        //short stored in 16 bits(2 bytes). min value is -32768. max value is 32767 (2 to the 15th power -1)

        int e = 2147483647;
        //int stored in 32 bits. (4 bytes). min value is -2147483648. max value is 2147483647 ( 2 to the 31st power -1)


        long r;
        // long stored in 64 bits (8 bytes). min value is -9223372036854775808. max value is 9223372036854775807 (2 to the 63rd power -1)

        /*
        Two of the remaining four data types are numerical. They store flosting point data.--
        positive or negative numbers with non-whole parts. They are called float and double
         */
        float f = 0.1223e3f;
        //in some cases the f needs to be provided at the end of the number. Otherwise the IDE is trying to read it as a double. floats are stored in 32 bits
        System.out.println(f);
        double d = 1.21314;
        //stored in 64 bits (8 bytes)


         // Two remaining primitive data types. boolean and char.

        char c = 'f';
        //stores a single character in 16bits. (2 bytes)

        boolean b = true;
        //stores either true or false. These are the only possible values.

        // String data type is not 5
        // a primitive data type. All other data types in java besides the 8 above are objects.
        String lava = "It's burning hot lava!!!!!";

    }

}
