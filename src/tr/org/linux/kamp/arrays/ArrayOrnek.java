package tr.org.linux.kamp.arrays;

public class ArrayOrnek {
	public static void main(String[] args) {
		int[] myArray = { 5, 7, 3, 4, 9, 2, 14, 15, 22,23 };
		
		for(int i = 0 ; i < myArray.length/2 ; i++){
            int temp = myArray[i];
            myArray[i] =  myArray[ myArray.length-i-1];
            myArray[ myArray.length-i-1]=temp;
        }
		
        for(int j: myArray) {
        	
            System.out.print(j+" ");
            }
       
	}
	
	
	
	
}
