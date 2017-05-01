import java.util.Iterator;

public class DoublyLinkedList implements Iterable<String> {
	private static class Node {
		public String data;
		public Node prev, next;
	}
	
	private static class Conductor implements Iterator<String> {
		private Node current;
		public boolean hasNext() {
			return current != null;
		}
		public String next() {
			String s = current.data; // Get string in current car
			current = current.next; // Advance to next car
			return s;
		}
		public Conductor(DoublyLinkedList list) {
			current = list.start; // Begin at the beginning
		}
	}
	
	private Node start; // Start of the list
	private Node end; // End of the list
	
	/**
	 * Add an element to the end
	 * @param s
	 */
	public void add(String s) {
		if (start == null) {
			// Nothing is in our list
			start = end = new Node();
			start.data = s;
		} else {
			Node n = new Node();
			n.data = s;
			n.prev = end; // New last points to old last
			end.next = n; // Old last points to new last
			end = n; // Update end to new last
			
		}
	}
	
	public String get(int i) {
		try {
			Node n = start;
			for (int j = 0; j < i; j++) {
				n = n.next;
			}
			return n.data;
		} catch (NullPointerException e) {
			return null; // Terrible style!
		}
	}

	@Override
	public Iterator<String> iterator() {
		return new Conductor(this);
	}
	
	
}
