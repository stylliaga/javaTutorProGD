package ru.stylliaga;

import java.util.ArrayList;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
	    int some[] = new int [4];

		ArrayList <Integer> some_dynamic = new ArrayList<>(5);
		some_dynamic.add(56);
		some_dynamic.add(6);
		some_dynamic.add(7);
		some_dynamic.add(5);
		some_dynamic.add(536);
		some_dynamic.add(8);

		some_dynamic.remove(1);

		System.out.println(some_dynamic.size());
		System.out.println("--------------");


		for(Integer x : some_dynamic){
			System.out.println(x);
		}
		LinkedList<String> names = new LinkedList<>();
		names.add("Tom");
		names.add("Слай");
		names.add("Антон");
		names.add("John");

		names.add(1,"Федя");
		names.add(0,"Андрюха");

		System.out.println("--------------");
		System.out.println(names.size());
		System.out.println("--------------");

		for(String x : names){
			System.out.println(x);
		}
    }
}
