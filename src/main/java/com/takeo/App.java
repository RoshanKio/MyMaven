package com.takeo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Properties;

public class App {
	static FileReader fr;
	static FileWriter fw;

	static public void main(String... tts) {
		String path = System.getenv("path");
		String PATH = System.getenv("PATH");

		String str = (path.equals(PATH)) ? "We are in Case insensitive Plateform"
				: "We are in Case Insensitive Plateform";

		System.out.println(str);

		Properties p = new Properties();

		try {
			fr = new FileReader("propIn");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			fw = new FileWriter("propOut");
			p.load(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}

		p.setProperty("address", "NY");

		System.out.println("Date of Class Creation : " + new Date(124, 0, 29));
		System.out.println("Date of Class Modification : " + LocalDate.now());
		System.out.println("Author : " + p.getProperty("author"));
		System.out.println("Address : " + p.getProperty("address"));
		System.out.println("path : " + path + "\n========================\n\n\n\n\n\n");

		
		
		
		int arr[] = {Integer.valueOf(tts[0]), Integer.valueOf(tts[1]), Integer.valueOf(tts[2]), Integer.valueOf(tts[3]), Integer.valueOf(tts[4])};
		
		System.out.println("Array befoore Sorting : "+Arrays.toString(arr));
		p.setProperty("Array before Sorting", Arrays.toString(arr));
		main(arr);
		System.out.println("Array after Sorting : "+Arrays.toString(arr));
		p.setProperty("Array after Sorting ", Arrays.toString(arr));
		
		try {
			p.store(fw, "Writing the content from propIn");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(int... tts) {
		int n = tts.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (tts[j] > tts[j + 1]) {
					// swap tts[j] and tts[j+1]
					int temp = tts[j];
					tts[j] = tts[j + 1];
					tts[j + 1] = temp;
				}
			}
		}
	}

}
