package tr.org.linux.kamp.karakterler;

import java.util.Random;

public class RandomChar {
	
	public static void main(String[] args) {
		Random rgen=new Random();
		char a= (char) ((rgen.nextInt(26))+'A');
		System.out.println(a);

	}

}
