package ru.stylliaga;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    BufferedReader br = null;
    	try {
			File file = new File("newfile.txt");

			if(!file.exists()){
			file.createNewFile();}

			PrintWriter pw = new PrintWriter(file);
			pw.println("Все работает.");
			pw.println("Helolo World!");
			pw.println("New String");
			pw.close();

			br = new BufferedReader(new FileReader("newfile.txt"));
			String line;
			while ((line = br.readLine()) != null){
				System.out.println(line);
			}

		}catch (IOException e){
	    	System.out.println("Error - " + e);
		}finally {
    		br.close();
		}
    }
}
