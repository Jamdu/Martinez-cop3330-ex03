package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = scnr.nextLine();

        System.out.println("Who said it?");
        String person = scnr.nextLine();

        System.out.println(person + " says, \"" + quote + "\"");
    }
}
