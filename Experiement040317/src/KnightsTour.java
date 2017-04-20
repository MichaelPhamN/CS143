import java.util.Arrays;

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
		// Call solve recursively
		if (solve(board, newX, newY, newMove)) {
			return true;
		}
		// Undo the move we just made
		board[newX][newY] = 0;
		return false; // We couldn't solve it this way
	}

	private static boolean solve(int[][] board, int x, int y, int move) {
		if (move == board.length*board[0].length) {
			return true; // Moved in every square of rectangular board
		}
		move++; // Next move will be after the current one
		// Try a move for the knight
		// 8 possible moves:
		// x - 2, y - 1
		if (tryMove(board, x - 2, y - 1, move)) {
			return true;
		}
		// x - 2, y + 1
		if (tryMove(board, x - 2, y + 1, move)) {
			return true;
		}
		// x - 1, y + 2
		if (tryMove(board, x - 1, y + 2, move)) {
			return true;
		}
		// x - 1, y - 2
		if (tryMove(board, x - 1, y - 2, move)) {
			return true;
		}
		// x + 2, y - 1
		if (tryMove(board, x + 2, y - 1, move)) {
			return true;
		}
		// x + 2, y + 1
		if (tryMove(board, x + 2, y + 1, move)) {
			return true;
		}
		// x + 1, y + 2
		if (tryMove(board, x + 1, y + 2, move)) {
			return true;
		}
		// x + 1, y - 2
		if (tryMove(board, x + 1, y - 2, move)) {
			return true;
		}
		return false; // No move could solve from here!
	}

	public static boolean solve(int[][] board) {
		// Try every possible starting position for knight
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				// Try starting the knight at x,y
				board[x][y] = 1; // Knight starts here
				if (solve(board, x, y, 1)) {
					for (int i = 0; i < board.length; i++) {
						System.out.println(Arrays.toString(board[i]));
					}
					return true;
				}
				board[x][y] = 0; // Undo that start point
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 8;
		int[][] board = new int[n][n];
		solve(board);

	}

}
