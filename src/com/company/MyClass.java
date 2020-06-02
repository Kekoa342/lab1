package com.company;
//importing scanner to get input from the user.
import java.util.Scanner;

public class MyClass {
    // Single Line Commenting.
    /*
    Multi Line Commenting.

    Comments do NOT affect run-time. they are ignored by the compiler.
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


        /*
        Arithmetic Operators five basic operations in java are +, -, *, / and %. Addition, Subtraction, multiplication,
        division and remainder. if x and y are both primitive numerical variables or constants of the same type. for example
        a long cannot be added together with a double.
         */
        x = 5;
        y = 6;
        System.out.println(x + y * 5); //y times 5 will be calculated before adding x. following PEMDAS. same as it is determined in mathematics.
        int z = ((x * y) / 3) + 15;
        System.out.println("the value of z is: "+z);

        /*
        "Shortcut" Operators for each of the arithmetic operators there is a shortcut assignment operator
        +=, -=, *=, /=, %=.
         */
        z += 5; //is the same as z = z + 5;

        /*
        Conversion and Casting.
        some conversions from a smaller data type to a larger one can be done implicitly. for example. an int can store a byte easily but the other way around isnt as easy.
        this is where type casting comes into play, an explicitly conversion from one type to another.
         */
        byte bee = 2;
        int ex = bee;   //this is fine.

        int big = 10;
        byte small =  (byte)big;   // have to put desired type in parenthesis.

        /*
        Arithmetic Operations (continued)
        Integer types byte, short, int, long use certain format while floats and doubles use a different one.  the built in operations in Java result in data whose type
        depends on the types of the inputs.
        int * int will give an int.
        float* float will give a float.
        but int * float will give a float implicitly. if you want an int it should be explicitly chosen which is fine. but you lose precision.
         */


        float flo = 2.6f;
        int yy = 3;
        int zee = (int)(flo * yy);
        

        /*
        most arithmetic operators result in an output that is approximately the same with different operand types.
        the division operation is different though. division performed with byte, short, int and long results in an integer output.
        for example: 5 / 2 results in 2 not 2.5. If you want the correct outcome one of the operands needs to be floating type. 
         */
        System.out.println(8 % 3.2);

        /*
        The Math Class.
        Many functions and constants useful in mathematics in general are accesssible through the Math Class. For instance, there isnt an operator for
        exponentiation in Java, but the Math class has a function for it. <ClassIdentifier>.<memberIdentifier>. There are a ton of classes easily accessible in Java that make
        things easier if I understand their documentation and how to implement them.
         */

        int aa = 1;
        int bb = 2;
        double cc = 0;

        System.out.println("aa is " + aa);
        System.out.println("bb is " + bb);
        System.out.println("cc is " + cc);

        System.out.println("\nSetting cc to the sum of aa and bb");
        cc = aa + bb;

        System.out.println("\n Declaring dd, setting its value to aa's value.");
        int dd = aa;

        System.out.println("\n Setting dd to 4 times the sum of aa and dd");
        dd = 4 * (aa + dd);

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println(area + " is the area of the circle.");
        System.out.println(circumference + " is the circumference of the circle.");

        // exercises using scanner class.
        System.out.println("Why did the chicken cross the road?");
        String ans1 = scan2.nextLine();

        System.out.println(ans1);

        System.out.println("How many toes do you have?");
        int ans2 = scan.nextInt();
        System.out.println(ans2);

        System.out.println("True or false: Carrots are the best vegetable");
        boolean ans3 = scan.nextBoolean();
        System.out.println(ans3);

        System.out.println("Enter a number of seconds");
        int ans4 = scan.nextInt();
        int numofdays = ans4 / (24*3600);
        int numofhours = (ans4 % (24 * 3600)) / 3600;
        int numofmins = (ans4 % 3600) / 60; //((24 * 3600 * 3600))/60);
        int numofsecs = (ans4 %  60);

        System.out.println(numofdays + " days, "+ numofhours+" hours, "+numofmins+" minutes, "+numofsecs+" seconds.");


        System.out.println("guess a number between 1 and 100.");
        double userGuess = scan.nextDouble();
        double randomNum = Math.round(1 + Math.random() * 100);
        System.out.println(randomNum);

        while (userGuess != randomNum) {
            if (userGuess > randomNum && userGuess != 0) {
                System.out.println("The random number is less than your guess. Or press 0 to quit.");
                userGuess = scan.nextDouble();
            }

            if (userGuess < randomNum && userGuess != 0) {
                System.out.println("The random number is greater than your guess. Or press 0 to quit.");
                userGuess = scan.nextDouble();
            }

            if (userGuess == 0) {
                System.out.println("alright. get outta here ya quitter!");
                continue;
            }

        }

        if (userGuess == randomNum) {
            System.out.println("Congratulations! you guessed the right number of " +randomNum+"!!!!!");
        }


    }

}
