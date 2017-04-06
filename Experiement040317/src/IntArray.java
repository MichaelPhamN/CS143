
public class IntArray {	
	private int[] a; 
	private int length;
	
	public IntArray(){
		length = 0;
		a = new int[8];
	}
	
	public int get(int position){
		if(position < 0 || position >= length){
			throw new NullPointerException("Oops!!");
		}
			
		return a[position];
	}
	
	public void set(int position, int value){
		a[position] = value;
	}
}
