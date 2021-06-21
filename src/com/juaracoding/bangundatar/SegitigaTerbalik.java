package com.juaracoding.bangundatar;

public class SegitigaTerbalik extends BangunDatar {

	public SegitigaTerbalik(int lebar, int panjang) {
		super(lebar, panjang);
	}

	@Override
	public void printBentuk() {
		for (int i = lebar ; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
