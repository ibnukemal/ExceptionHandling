package com.sqa.exeptionhandling;

public class TryBersarang {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Pembagian 0");
				int hasil = 1000/0;
			} catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				System.out.println("Array Null");
				int data [] = {2,4,6,8,10};
				System.out.println(data[5]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println("Exception Parent");
		}
	}

}


