package com.harman.project;

import java.util.Scanner;

public class Celcius {
    public static void main (String[] args)
    {
        float Fahrenheit, Celsius;

        Scanner inp = new Scanner(System.in);

        System.out.println("Fahrenheit Value: ");
        Fahrenheit = inp.nextFloat();

        Celsius  = ((Fahrenheit-32)*5)/9;
        System.out.println(Celsius);
    }
}
