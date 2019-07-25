package com.ridezum;

public class Main {

    public static void main(String[] args) {

        String a = "Whatever";

        reverse(a);



    }

    public static void reverse (String anyWord) {

        char[] arrayChar = anyWord.toCharArray();

        char temp;

        for (int i = 0; i < arrayChar.length/2; i++ ) {

            temp = arrayChar[i];
            arrayChar[i] = arrayChar[arrayChar.length-1-i];
            arrayChar[arrayChar.length-1-i] = temp;

        }

        String result = new String( arrayChar );
        System.out.println(result);



    }






}
