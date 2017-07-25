package tr.org.linux.kamp.arrays;

public class Bordo {
	public static void main(String[] args) {
		int[][] board= new int[3][4];
		int counter=0;
		
	
		for(int k=0;k<board.length;k++) {
			for(int j=0;j<board[k].length;j++) {
				board[k][j]=counter;
				counter++;
			}
		}
		
		for(int k=0;k<board.length;k++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[j][k]+"");
				counter++;
			}
			System.out.println();
			
		}

	}
}
