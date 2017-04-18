
public class KnightsTour {
	public static boolean tryMove(int[][] board, int newX, int newY){
		// chek if newX and newY are in bounds
		if(newX < 0 || new X> board.length //
	}
	private static boolean solve(int[][] board, int x, int y, int move){
		// try a move for the knight
		// 8 possible moves:
		// x - 2, y -1 1
	}
	public static boolean solve(int[][] board){
		//try every possible starting position for knight
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				//try stating the knight at x,y
				board[x][y] = 1;
				solve(board,x,y,1);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] board = new int[n][n]; 
		
	}

}
