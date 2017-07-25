package tr.org.linux.kamp.triangle;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int a,b,c;
		System.out.println("1. uzunluk giriniz");
		a=sc.nextInt();
		System.out.println("2.uzunluk giriniz");
		b=sc.nextInt();
		
		 int hyp = (int) Math.hypot(a, b);
		 System.out.println("Hipotenus "+hyp);
		 
		 int alan=a*b;
		
		 
	}
	

}
