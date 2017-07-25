package tr.org.linux.kamp.hellorandom;

import java.util.Random;

public class HelloRandom {
	public static void main(String[] args) {
		System.out.println("Math random"+Math.random());
	
		Random rgen=new Random();
		System.out.println("int"+rgen.nextInt());
		System.out.println("Math random nextb int "+rgen.nextDouble());
		
		Random rgen2=new Random();
		System.out.println("Math random next int  0-4"+rgen2.nextInt(5));
		
		int result=rgen.nextInt(2)-8;
		System.out.println("Math random next int  8-10"+result);
		
		
		
		
	}
	

}
