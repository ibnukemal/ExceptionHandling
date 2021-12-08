package com.sqa.exeptionhandling;

class BebasException extends Exception {
	public BebasException(String s) {
		super(s);
	}
}


public class ExceptionBebas {

	public static void main(String[] args) {
		try {
			throw new BebasException("Throw Custom Message Error");
		} catch (BebasException bebas) {
			System.out.println(bebas.getMessage());
			System.out.println("Bebas Exception");
			
		}

	}

}
