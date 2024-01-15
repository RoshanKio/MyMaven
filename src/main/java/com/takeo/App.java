package com.takeo;

import java.util.Random;
import java.sql.Date;

public class App 
{
    public static void main( String ... tts )
    {
        System.out.println( "path = "+System.getenv("path") );
	System.out.println("Random number, n = "+new Random().nextDouble()+", generated on "+new Date(124,0, 14));
    }
}
