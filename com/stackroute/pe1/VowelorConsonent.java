package com.stackroute.pe1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class VowelorConsonent {

    public static void main(String args[]){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the string: ");
//
//        String str = in.nextLine();
//
//        System.out.print("Result is: " + count_Vowels(str)+"\n");
//
//        int no=str.length();
////        int tot=no-count_Vowels(str);
////        System.out.println("Number of consonents "+tot);
//        String res=count_Vowels(str);
        System.out.print("Input the string: ");

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*"); //regex pattern to check if string has any special character or not
        Matcher matcher = pattern.matcher(str);
        var check= str.matches(".*\\d.*"); //regex pattern to check if string has any digit or not

        if(check == true){

            System.out.print("Error number: Please enter only alphabets"); //error message

        }else if(!matcher.matches()){
            System.out.print("Error special character: Please enter only alphabets"); //error message

        }else{

            String res = count_Vowels(str); // calling method to check vowel and consonant
            System.out.print("Result is: " + res+"\n");
        }
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

