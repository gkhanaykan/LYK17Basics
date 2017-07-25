package tr.org.linux.kamp.hellostring;

public class HelloString {

 public static void main(String[] args) {
/*	String str= Integer.toString(115);
	System.out.println(str);
	
	String st="hello world";
	System.out.println(st.charAt(6));
	//ilk dahil son parametre dahil değil.
	System.out.println(st.substring(1,4));
	//ifade nerde başlıyosa onun index i verir
	System.out.println(st.indexOf(" "));
	System.out.println(st.indexOf("ello"));
	//int döndürür (-1) false gelmez
	System.out.println(st.indexOf("eleman"));
	//hello dan başlaması için +1 verildi
	System.out.println(st.indexOf(" ")+str.length());
	System.out.println(st.lastIndexOf('l'));
	//ignore büyük küçük önemini kaldırır
	System.out.println(st.substring(0,2)=="he");
	System.out.println(st.substring(0,2).equals("he"));
	


	System.out.println(Character.toUpperCase('h'));*/
	 
	//System.out.println(outToUpperCase(str).));
	 
	 
	System.out.println(reversString("ey edip adana da pide ye"));
	
	
}
 
 	public static String outToUpperCase(String str) {
	 String result="";
	 for(int i =0;i<str.length();i++) {
		 result+=Character.toUpperCase(str.charAt(i));
	 }
	 return result;
 	}
 	public static String reversString(String str) {
 		String result= "";
 		for(int i=str.length();i>=0;i--) {
 			result+str.charAt(i);
 			
 		}
 		return result;
 	}
 	public static boolean isPalindrome(String str) {
 		return str.equals(reversString(str));
 	}
}
