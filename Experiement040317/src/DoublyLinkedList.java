public class DoublyLinkedList {
	private static class Node {
		public String data;
		public Node prev, next;
	}
	private Node start; // Start of the list
	private Node end; // End of the list

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
	
	public static void main(String[] args){
		 DoublyLinkedList list = new DoublyLinkedList();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 System.out.println(list.get(-1));
	}
}