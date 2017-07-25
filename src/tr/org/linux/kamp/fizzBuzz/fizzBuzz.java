package tr.org.linux.kamp.fizzBuzz;

public class fizzBuzz {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			String in="";
					if(i%3==0) {
						in+="Fizz";
						}
					if(i%5==0) {
						in+="Buzz";
						}
					System.out.print(in+" ");
			}
		}

	}


