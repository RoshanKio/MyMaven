package com.takeo;

import java.sql.Date;
import java.util.Random;


public class App {
    static public void main(String tts[]) {
        System.out.println("Date : "+new Date(124, 0, 17));
        System.out.println("classpath = "+System.getenv("classpath"));
        
        System.out.println("Random number n = "+new Random().nextDouble());


        System.out.println("\n\n===================Nepal's Flag :=====================\n");
    
        for(int i = 1; i <= 2; i++) {
            String str = "*";
            for(int j = 1; j <= 11; j++) {
                str=str+"***";
                System.out.println(str);
            }
        }
        System.out.println("**\n**\n**\n**\n**\n**\n**\n**\n");
    }
}
