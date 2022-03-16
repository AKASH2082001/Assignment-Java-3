package com.harman.project;

import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Double num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = inp.nextDouble();
        Double square = num * num;
        System.out.println("Square of "+ num + " is: "+ square);
    }
}
