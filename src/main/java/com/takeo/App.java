package com.takeo;

import java.util.Random;
import java.sql.Date;

public class App 
{
    public static void main( String[] args )
    {
	System.out.println("Today is "+new Date(124, 0, 15));
        System.out.println( "Random number n = "+new Random().nextDouble());
    }
}
