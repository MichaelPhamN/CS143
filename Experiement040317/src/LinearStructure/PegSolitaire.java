package LinearStructure;

public class PegSolitaire {
	public static void solve(boolean[][] pegs, StringStack solution){
		solve(pegs, 0,0,0,-2, 0,0,solution);		
	}
	
	public static boolean solve(boolean[][] pegs, int startX, int startY, int jumpX, int jumpY, int endX, int endY, StringStack solution){
		if (tryMove(pegs, startX, startY, startX, startY - 2, startX, startY - 2, solution)) {
			return true;
		}
		if (tryMove(pegs, startX, startY, startX, startY + 2, startX, startY + 2, solution)) {
			return true;
		}
		if (tryMove(pegs, startX, startY, startX - 2, startY, startX - 2, startY, solution)) {
			return true;
		}
		if (tryMove(pegs, startX, startY, startX + 2, startY, startX + 2, startY, solution)) {
			return true;
		}
		
		if (jumpY > 0) {
			solve(pegs, startX, startY - 1, 0, -1, startX, startY - 1, solution);
		}
		if (jumpY <7){
			solve(pegs, startX, startY + 1, 0, 1, startX, startY + 1, solution);
		}
		if (startX - 1 > 0) 
		{
			solve(pegs, startX - 1, startY, - 1, 0, startX - 1, startY, solution);			
		}
		if(startX + 1 <7){ 
			solve(pegs, startX + 1, startY, 1, 0, startX + 1, startY, solution);			
		}
		
		return false;
			
	}
	
	private static boolean tryMove(boolean[][] pegs, int startX, int startY, int jumpX, int jumpY, int endX, int endY, StringStack solution) {
		//Start Points can not equal End Points
		if(startX == endX && startY == endY){
			return false;
		}	
		
		if(checkMove(pegs, startX, startY, endX, endY )){
			pegs[endX][endY] = true;
			pegs[startX][startY] = false;
			pegs[(startX + endX) / 2][(startY + endY) / 2] = false;			
			String str = "(" + startX + ", " + startY + ") -> (" + endX + ", " + endY +")";
			solution.push(str);
			return true;
		}
		return false;
	}
	
	
	private static boolean checkMove(boolean[][] pegs, int startX, int startY, int endX, int endY){
		if(endX < 0 || endX >= pegs.length || endY < 0 || endY >= pegs.length){
			return false;
		}
		
		if(endX == 0 && endY == 0){
			return false;
		}
		
		// Jump to point (0,1)
		if(endX == 0 && endY == 1){
			return false;
		}
		
		// Jump to point (1,0)
		if(endX == 1 && endY == 0){
			return false;
		}
		
		// Jump to point (1, 1)
		if(endX == 1 && endY == 1){
			return false;
		}
		
		// Jump to point (7,7)
		if(endX == 7 && endY == 7){
			return false;
		}
		
		// Jump to point (7, 6)
		if(endX == 7 && endY == 6){
			return false;
		}
		
		// Jump to point (6,7)
		if(endX == 6 && endY == 7){
			return false;
		}
		
		// Jump to point (6, 6)
		if(endX == 6 && endY == 6){
			return false;
		}
		
		
		// Jump to point (7,0)
		if(endX == 7 && endY == 0){
			return false;
		}
		
		// Jump to point (7, 1)
		if(endX == 7 && endY == 1){
			return false;
		}
		
		// Jump to point (6,0)
		if(endX == 6 && endY == 0){
			return false;
		}
		
		// Jump to point (6, 1)
		if(endX == 6 && endY == 1){
			return false;
		}
		
		// Jump to point (0,7)
		if(endX == 0 && endY == 7){
			return false;
		}
		
		// Jump to point (0, 6)
		if(endX == 0 && endY == 6){
			return false;
		}
		
		// Jump to point (1,7)
		if(endX == 1 && endY == 7){
			return false;
		}
		
		// Jump to point (1, 6)
		if(endX == 1 && endY == 6){
			return false;
		}
		
		return  pegs[endX][endY] == false
                && pegs[(startX + endX) / 2][(startY + endY) / 2] == true
                && pegs[startX][startY] == true;
	}
	
	public static void main(String[] args){
		StringStack stack = new StringStack(); // Empty stack
		boolean[][] testSimple = { 
				{ false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false },
				{ false, true, true, false, false, false, false },
				{ false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false } };
		solve(testSimple, stack);
	}
}
