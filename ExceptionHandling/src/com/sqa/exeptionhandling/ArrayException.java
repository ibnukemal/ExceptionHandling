package com.sqa.exeptionhandling;

public class ArrayException {

	public static void main(String[] args) {
		try {
			int data[] = {2,4,6,10,12};
			System.out.println(data[4]);
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
