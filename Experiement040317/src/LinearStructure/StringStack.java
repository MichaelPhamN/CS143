package LinearStructure;

public class StringStack {
	private InternalStringStack stack;
	public StringStack(){
		// Create an empty stack
		stack = null;
	}
	
	public void push(String s){
		stack = new InternalStringStack(s, stack);		
	}
	
	public String top(){
		if(stack == null) return null;
		return stack.getData();
	}
}
