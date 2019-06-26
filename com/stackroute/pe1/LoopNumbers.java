package com.stackroute.pe1;

import java.util.Scanner;

public class LoopNumbers {



        public static void main (String [] args){


            int number ;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            number= input.nextInt();
            getpattern(number);
        }

        public static void  getpattern(int number){

            for (int i = 1; i <= number; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print(i);
                }
            }

        }



}
