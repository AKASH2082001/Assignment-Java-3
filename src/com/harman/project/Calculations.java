package com.harman.project;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args)
    {
        int a,b;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the Number 1: ");
        a=inp.nextInt();
        System.out.println("Enter the Number 2: ");
        b=inp.nextInt();
        if(a>10000 && b>10000)
        {
            int sum,product,average,subtraction;
            sum=a+b;
            System.out.println(sum);
            product=a*b;
            System.out.println(product);
            average=(a+b)/2;
            System.out.println(average);
            subtraction=a-b;
            System.out.println(subtraction);
        }
        else
        {
            System.out.println("Given Number is less than 10000");
        }
    }
}
