package com.takeo;

import java.util.Random;
import java.sql.Date;
import java.time.LocalDate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Date when this java class was created : "+new Date(124, 0, 18)+":\n======================\n\n\n\n");
	System.out.println("classpath : "+System.getenv("classpath")+" on Date : "+LocalDate.now());
	System.out.println("Random number n = "+new Random().nextDouble());

	System.out.println("Nepal's Flag :\n**\n**\n**");
	for(int i = 1; i <= 2; i++) {
		String str = "**";
		for(int j = 1; j <= 11; j++) {
			str = str+"*";
			System.out.println(str);
		}
	}
	System.out.println("**\n**\n**\n**\n**\n**\n**\n**\n**");
    }
}
