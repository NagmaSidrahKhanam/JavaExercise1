package com.stackroute.pe1;

import java.util.Scanner;

public class StringReverse {






        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.print("Input the string: ");

            String str = in.nextLine();

            System.out.print("Result is: " + count_Vowels(str)+"\n");

            int no=str.length();
//        int tot=no-count_Vowels(str);
//        System.out.println("Number of consonents "+tot);
            String res=count_Vowels(str);
        }
        public static String count_Vowels(String str)
        {
            String s=" ";
            int count = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                {
                    count++;
                    s =s+" vowel  ";
                }
            /*if else()
            {

            }*/
                else
                {
                    s = s +" consonent  ";
                }
            }
            return s;
        }



}
