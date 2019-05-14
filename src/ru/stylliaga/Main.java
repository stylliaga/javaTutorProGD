package ru.stylliaga;

import java.util.ArrayList;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
	    int arr[] = {23,6,7};

    	try{

			//System.out.println(arr[7]);
	    	//int x = 100 / 0;
		}catch (ArithmeticException e){
	    	System.out.println("Ошибка выполнения операции " + e);
		}catch (Exception e){
    		System.out.println("Error - " + e);
		}finally {
			System.out.println("Finally is working!");
		}
    }
}
