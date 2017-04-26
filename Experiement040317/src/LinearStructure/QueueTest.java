package LinearStructure;
public class QueueTest {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		String s;
		while ((s = queue.remove()) != null) {
			System.out.println(s);
		}
	}

}
