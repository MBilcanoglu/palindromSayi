package palindromSayi;

import java.util.Scanner;

public class Main {

	static boolean isPalindrom(int number) {
		int temp;
		int reverseNumber = 0;
		int lastNumber;
		temp = number;
		while (temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}

		if (number == reverseNumber) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int number;

		Scanner scan = new Scanner(System.in);

		System.out.print("Kontrol edilmek istenen say�y� giriniz: ");
		number = scan.nextInt();

		System.out.println(
				number + " say�s� " + ((isPalindrom(number)) ? "Palindrom" : "Palindrom Olmayan") + " bir say�d�r.");
	}

}
