package com.supergamer;

import java.util.Scanner;

class InputHandler{
    static String GetString(Scanner scanner)
    {
        System.out.println("Please input a string");
        return scanner.nextLine();
    }

    static Integer GetNonNegativeInt(Scanner scanner)
    {
        System.out.println("Please input a non negative integer");
        while (true) {
            if(!scanner.hasNextInt())
            {
                System.out.println("Sorry this is not an integer");
                scanner.nextLine();
                continue;
            }
            int num = scanner.nextInt();
            scanner.nextLine();
            if(num < 0)
            {
                System.out.println("Sorry this is not a positive integer");
                continue;
            }
            return num;
        }
    }
}
