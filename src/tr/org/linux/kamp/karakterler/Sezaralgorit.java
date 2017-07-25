package tr.org.linux.kamp.karakterler;

import java.util.Scanner;

public class Sezaralgorit {
	public static void main(String[] args) {
		
		/*String sifrelenecekmesaj = "abc";
		 System.out.print("Şifreli Mesaj: "); 
		 for (int i = 0; i <sifrelenecekmesaj.length(); i++)
		 System.out.print(sifrele(sifrelenecekmesaj.charAt(i))); System.out.println();
		 } 
		 private static char sifrele(char ch) { 
		 if (!Character.isLetter(ch)) 
		 return ch; 
		 if (Character.isUpperCase(ch)) return (char) (((ch - 'A') + 13) % 26 +
		 'A'); return (char) (((ch - 'a') + 13) % 26 + 'a');*/
		 

	Scanner input = new Scanner(System.in);
		System.out.println("\t---Sezar Algoritması---");
		System.out.println("Bir Metin giriniz...");
		String a = input.nextLine();
		System.out.println("Kaç karakter ileri kaymak istiyorsunuz...");
		int deger = input.nextInt();
		char b;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				System.out.print(" ");
				continue;
			} 
			else {
			// Burda modunu alıyor 26 gecip gecmedigi.
			b = (char) ((int) (a.charAt(i) - 65 + deger) % 26 + 65);
			
				System.out.print(b);
			}
			

		}
		
		
		

	}
	/*public static  String sifreleme(String str,int x) {
		for (int i=0;str.length();i++)
	}*/
}
