package tr.org.linux.kamp.karakterler;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		String mail=str.nextLine();
	}

	public static boolean isEmailVaild(String str) {
		
	/*	//System.out.println(str.charAt(@));
		System.out.println(str.charAt('.'));
		System.out.println(str.charAt(' '));
		
		if(str.substring(0,1).equals("@")&&
				str.substring(""0,1).equals("@")) {
		System.out.println(str);
		}*/
		
		
		if(str.contains(" ")) {
			return false;
		}
		if(!str.contains("@")) {
			return false;
		}
		if(str.contains(".")) {
			return false;
		}
		if(str.startsWith("@")||str.startsWith(".")) {
			return false;
		}
		if(str.contains("@.")) {
			return false;
			
		}
		if(str.length()+str.lastIndexOf(".")<=2) {
			
			return false;
		}
		return true;
	}
}
