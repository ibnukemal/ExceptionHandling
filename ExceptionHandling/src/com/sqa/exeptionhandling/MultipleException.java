package com.sqa.exeptionhandling;

public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Ini Exception 1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ini Exception 2");
		} catch (Exception e) {
			System.out.println("Ini Exception 3");
		}

	}

}
