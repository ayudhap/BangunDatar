package com.juaracoding.bangundatar;

public class Segitiga extends BangunDatar{

	public Segitiga(int lebar, int panjang) {
		super(lebar, panjang);
	}

	@Override
	public void printBentuk() {
		for (int i = 0; i < lebar; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
