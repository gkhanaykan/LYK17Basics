package tr.org.linux.kamp.hellorandom;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	private static Random rgen=new Random();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. kisiyi girin");
		String kisi1=sc.next();
		
		System.out.println("2.kisiyi girin");
		String kisi2=sc.next();
		
		int dice1=roll();
		int dice2=roll();
		
		System.out.println(kisi1+" zarı "+dice1);
		System.out.println(kisi2+" zarı "+dice2);
		
		String winner="";
		/*if(dice1>dice2) {
			winner=kisi1;
		}
		else if(dice1==dice2) {
			winner="Berarbere";
		}
		else {
			winner=kisi2;
		}*/
		
		//if else yerine kullandık.
		winner = (dice1 > dice2) ? kisi1 : (dice1 == dice2) ? "Berabere" : kisi2; 
		System.out.println("Kazanan "+winner);
		
		
	
	}
	public static int roll() {
		return rgen.nextInt(5)+1;
		
	}

}
	
