package com.sqa.exeptionhandling;

public class BelajarExceptionHandling {

	public static void main(String[] args) {
		int a = 1000;
		int b = 0;
		int hasil;
		try {
			hasil = a/b;
			System.out.println("Statement : ");
		} catch (Exception e) {
			System.out.println(a/(b+4));
		}
	
		
		
	}

}
