package LinearStructure;
public class StringStackTest {

	public static void main(String[] args) {
		StringStack stack = new StringStack(); // Empty stack
		System.out.println("Stack size: "+stack.size());
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println("Top of stack: "+stack.top());
		System.out.println("Stack size: "+stack.size());
		System.out.println("Pop value: "+stack.pop());
		System.out.println("Pop value: "+stack.pop());
		System.out.println("Pop value: "+stack.pop());

	}

}
