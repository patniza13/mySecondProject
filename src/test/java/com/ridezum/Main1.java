package com.ridezum;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>( );

        array.add( "Earth" );
        array.add( "Relax" );
        array.add("Best");
        array.add( "Zen" );
        array.add( "Rainbow" );

        for (String element: array) {
            System.out.println(element);
        }

     //   for (int i = 0;  i < array.size(); i++ ); {
     //       System.out.println(array.get( i ));
        }

    }


