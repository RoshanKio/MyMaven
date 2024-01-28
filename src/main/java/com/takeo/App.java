package com.takeo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Properties;
import java.util.Random;
public class App {
	static public void main(String ... tts) {
		FileReader fr = null;
		Properties p = new Properties();
		
		try {
			fr = new FileReader("prop");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			p.load(fr);
		}
		catch( IOException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("author : "+p.getProperty("author")+"\n========================\njava class creation Date : "+new Date(124, 0, 27)+"\n========================\njava class last modified Date : "+LocalDate.now()+"\n================================\npath : "+System.getenv("path")+"\n================\nRandom number , n : "+new Random().nextDouble()+"\n");
		
		int arr[] = {Integer.valueOf(tts[0]), Integer.valueOf(tts[1]), Integer.valueOf(tts[2]), Integer.valueOf(tts[3]), Integer.valueOf(tts[4])};
		
		System.out.println("Array before Sorting : "+Arrays.toString(arr));
		main(arr);
		System.out.println("Array after Sorting : "+Arrays.toString(arr));
		
	}
	
	public static void main(int ...tts) {
		int n = tts.length;
		
		for(int i = 0; i < n -1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(tts[j]>tts[j+1]) {
					//swap tts[j] and tts[j+1]
					int temp = tts[j];
					tts[j] = tts[j+1];
					tts[j+1] = temp;
				}
			}
		}
	}
	


}

