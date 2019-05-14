package ru.stylliaga;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Main {

    public static void main(String[] args) {
	    try {
			File file = new File("newfile.txt");

			if(!file.exists()){
			file.createNewFile();}

			PrintWriter pw = new PrintWriter(file);
			pw.println("Все работает.");
			pw.println("Helolo World!");
			pw.close();

		}catch (IOException e){
	    	System.out.println("Error - " + e);
		}
    }
}
