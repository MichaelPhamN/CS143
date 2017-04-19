
public class KnightsTour {

	private static boolean tryMove(int[][] board, int newX, int newY, int newMove) {
		// Check if newX and newY are in bounds
		if (newX < 0 || newX >= board.length || 
			newY < 0 || newY >= board[newX].length) {
			return false;
		}
		if (board[newX][newY] != 0) {
			// Not allowed to move here because we did already
			return false;
		}
		board[newX][newY] = newMove;
		return true; // Made the move!
	}

	private static boolean solve(int[][] board, int x, int y, int move) {
		move++; // Next move will be after the current one
		// Try a move for the knight
		// 8 possible moves:
		// x - 2, y - 1
		if (tryMove(board, x - 2, y - 1, move)) {
			// Call solve recursively
			if(solve(board, x - 2, y - 1, move)){
				return true;
			}
			// Undo the move we just made
			board[x - 2][y - 1] = 0;
			
		}

		// x - 2, y + 1
		// x - 1, y + 2
		// x - 1, y - 2
		// x + 2, y - 1
		// x + 2, y + 1
		// x + 1, y + 2
		// x + 1, y - 2

	}

	public static boolean solve(int[][] board) {
		// Try every possible starting position for knight
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				// Try starting the knight at x,y
				board[x][y] = 1; // Knight starts here
				solve(board, x, y, 1);
			}
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int[][] board = new int[n][n];
		solve(board);

	}

}
