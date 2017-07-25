package tr.org.linux.kamp.asalsayı;

import java.util.Scanner;

public class AsalSayı {
 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.print("Sayı giriniz: ");
	 int girdi=input.nextInt();
	 for(int i=0;i>girdi;i++) {
		 if(girdi%i==0) {
			 System.out.print(""+i);
		 }
	 }
}
}
