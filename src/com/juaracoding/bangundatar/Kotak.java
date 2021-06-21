package com.juaracoding.bangundatar;

public class Kotak extends BangunDatar{

	public Kotak(int lebar, int panjang) {
		super(lebar, panjang);
	}

	@Override
	public void printBentuk() {
		for (int i = 0; i < panjang; i++) {
			for (int j = 0; j < lebar; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
