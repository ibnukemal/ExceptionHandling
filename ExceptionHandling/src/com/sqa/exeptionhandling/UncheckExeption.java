package com.sqa.exeptionhandling;

public class UncheckExeption {

	public static void main(String[] args) {
		try {
			String a = "Aab";
			String b = "Budi";
			String c = null;
			System.out.println("Nama ke 1 = " +a);
			System.out.println("Nama ke 2 = " +b);
			System.out.println("Nama ke 3 = " +c);
			System.out.println("Gabung kata = " + c.concat(b));
		} catch (NullPointerException e) {
			System.out.println("Saya adalah null pointer exception");
			
		}
		
		
	}

}
