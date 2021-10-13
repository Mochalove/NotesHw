package data_types;

import java.util.Scanner;
//A boolean data type is declared with the boolean keyword and can only take the values true or false:
//Boolean values are mostly used for conditional testing, which you will learn more about in a later chapter.
    public class Booleans {
    public static void main(String[] args) {
        boolean blue = true;
        boolean black = false;
        Scanner helper = new Scanner(System.in);
        System.out.println("Is the color of the sky black or blue?");
        String input = helper.nextLine();
        System.out.println(input);
        if (blue) {
            System.out.println("Have an excellent day");
        }
        if (black) {
            System.out.println("Have an excellent night");
        }

    }
}