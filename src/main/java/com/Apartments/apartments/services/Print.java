package com.Apartments.apartments.services;


import com.Apartments.apartments.entity.Role;
import com.Apartments.apartments.entity.User;

import java.util.HashSet;
import java.util.Set;



public class Print {
    static int ii;
    public static  void main(String[]args)
    {

        String str ="1234567890";
        char [][]array= new char [4][4];

        for(int i=0;i!=3;i++)
        {
            for(ii=0;ii!=3;ii++) {

                char pulled = str.charAt(ii);
                array[i][ii]=pulled;

            }
            ii=(ii*2)-1;
        }


        for(int i=0;i<=2;i++)
        {
            System.out.println(array[i]);
        }
    }

}
