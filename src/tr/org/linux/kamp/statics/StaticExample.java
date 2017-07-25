package tr.org.linux.kamp.statics;

public class StaticExample {
	public static String myStaticString="statik string";
	
	public static String myStaticStringMetod() {
		return "BU statik metod";
	}
	
	static {
		System.out.println("bu satik blok");
	}
	static {
		int x=5;
		System.out.println(x);
		System.out.println("3. satik blok");
	}
	

}
