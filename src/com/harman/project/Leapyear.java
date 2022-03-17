package com.harman.project;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = inp.nextInt();
        if (year % 4 == 0)
        {
            System.out.println("Given year is a leap year");
        }
        else
        {
            System.out.println("Given year is not a leap year");
        }
    }
}