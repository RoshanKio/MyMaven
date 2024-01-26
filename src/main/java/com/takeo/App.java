package com.takeo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;
import java.util.Arrays;

public class App {
	static public void main(String ...tts) {
		System.out.println("Java file created on : "+new Date(124, 0, 26)+"\n======================================================\njava file Modificatoin Date : "+LocalDate.now()+"\n=========================================================\npath : "+System.getenv("path")+"\n==========================================\nRandom Number, n = "+new Random().nextDouble()+"\n=======================================\n\n\n\n\n\n");
		
		
		int[] arr = {Integer.valueOf(tts[0]), Integer.valueOf(tts[1]), Integer.valueOf(tts[2]), Integer.valueOf(tts[3])};
		
		System.out.println("Array before Sorting : "+Arrays.toString(arr));
		main(arr);
		System.out.println("Array after Sorting  : "+Arrays.toString(arr));
	
	}
	
	public static void main(int[] ram) {
		int n = ram.length;
		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(ram[j]>ram[j+1]) {
					//swap ram[j and ram[j+1]
					int temp = ram[j];
					ram[j] = ram[j+1];
					ram[j+1] = temp;				
				}
			}
		}
	}

}
