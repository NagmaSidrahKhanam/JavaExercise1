package com.stackroute.pe1;

import java.util.Scanner;
public class CharCheck {


        public static void main(String [] args){
            char input_char ;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any character/number:");
            input_char = input.next().charAt(0);
            charCheck(input_char);
        }

        static void charCheck(char input_char){

            // CHECKING FOR ALPHABET
            if (input_char >= 65 && input_char <= 90){
                System.out.println("It is Upper Case Alphabet");
            }else if(input_char >= 97 && input_char <= 122){
                System.out.println("It is Lower Case Alphabet");
            }
            // CHECKING FOR DIGITS
            else if (input_char >= 48 && input_char <= 57)
                System.out.println(" It is Number ");

                // OTHERWISE SPECIAL CHARACTER
            else
                System.out.println(" IT is Special Character ");
        }

}
