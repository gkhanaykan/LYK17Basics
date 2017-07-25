package tr.org.linux.kamp.hellorandom;

import java.util.Random;

public class RandomSuit {
	private static Random rgen=new Random();
	public static void main(String[] args) {
		
		System.out.println(chooseRandomSuit());
		System.out.println(chooseRandomRank());

	}
	
	
	public String chooseRandomCard() {
		return chooseRandomRank()+"of"+chooseRandomSuit();
	}
	public static String chooseRandomRank() {
		int randomNumber= rgen.nextInt(13)+1;
		
		switch(randomNumber) {
		case 1:
			return "As";
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			return "" +randomNumber;
		case 11:
			return "vale";
		case 12:
			return "sinek";
		case 13:
			return "sinek";
		default:
			return " ";
			
		}
		
		
	}
	private static String chooseRandomSuit() {
		int randomNumber= rgen.nextInt(4);
		switch(randomNumber) {
		case 0:
			return "Maca";
		case 1:
			return "Kupa";
		case 2:
			return "Karo";
		case 3:
			return "sinek";
		default:
			return "Hata";
		}
	}

}
