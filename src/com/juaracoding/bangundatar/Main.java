package com.juaracoding.bangundatar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("	Bangun Datar	");
		System.out.println("1. Segitiga");
		System.out.println("2. Kotak");
		System.out.println("3. Segitiga Terbalik");
		System.out.print("Pilih bangun datar : ");
		int x = scanner.nextInt();
		switch (x) {
		case 1: {
			System.out.print("Masukkan Lebar = ");
			int lebar = scanner.nextInt();
			Segitiga segitiga = new Segitiga(lebar, 0);
			segitiga.printBentuk();
			break;
		}
		case 2: {
			System.out.print("Masukkan Lebar = ");
			int lebar = scanner.nextInt();
			System.out.print("Masukkan Panjang = ");
			int panjang = scanner.nextInt();
			Kotak kotak = new Kotak(lebar, panjang);
			kotak.printBentuk();
			break;
		}
		case 3: {
			System.out.print("Masukkan Panjang = ");
			int lebar = scanner.nextInt();
			SegitigaTerbalik segitigaTerbalik = new SegitigaTerbalik(lebar, 0);
			segitigaTerbalik.printBentuk();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + x);
		} 
	}
	
}
