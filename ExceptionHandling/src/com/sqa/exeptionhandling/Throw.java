package com.sqa.exeptionhandling;
import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan usia anda untuk menonton film : ");
		int usia = sc.nextInt();
		validasi(usia);
		System.out.println("Kode berjalan dengan benar");
		System.out.print("Masukkan umur anda untuk menonton film : ");
		int umur = sc.nextInt();
		validate(umur);
		System.out.println("Kode berjalan dengan benar");
		
	}
	static void validasi(int usia) {
		if(usia < 18) {
			throw new ArithmeticException("Belum cukup usia");
		} else {
			System.out.println("Sudah cukup usia");
		}
	}
	static void validate(int umur) {
		switch(umur) {
		case 17:
			throw new ArithmeticException("Belum cukup umur");
		default:
			System.out.println("Sudah ckup umur");
			break;
		}
	}
}
