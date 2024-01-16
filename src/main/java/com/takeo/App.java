package com.takeo;

import java.util.Random;
import java.sql.Date;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Today is "+new Date(124, 0, 16));
	System.out.println("path = "+System.getenv("path"));
	System.out.println(new Random().nextDouble()+" is a random number.");
    }
}
