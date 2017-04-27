package LinearStructure;
public class QueueTest {

	public static void main(String[] args) {
		Queue queue = new Queue();
		for (int i = 0; i < 100000000; i++) {
			queue.add(String.valueOf(i));
		}
//		String s;
//		int i = 0;
//		// Prints a, b, c in order added
//		while ((s = queue.remove()) != null) {
//			if (Integer.parseInt(s) != i) {
//				System.out.println("Unexpected!");
//			}
//			i++;
//		}
		/*
		queue.add("b");
		queue.add("c");
		String s;
		// Prints a, b, c in order added
		while ((s = queue.remove()) != null) {
			System.out.println(s);
		}
		*/
		System.out.println("Done");
	}

}
