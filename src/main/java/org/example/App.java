package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is the quote?");
        String string = scnr.nextLine();

        System.out.println("Who said it?");
        String string2 = scnr.nextLine();

        System.out.println(string2 + " says " + "\""+ string + "\"");
    }
}
