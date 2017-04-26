package LinearStructure;
public class Queue {
	private InternalQueue queue;
	public Queue() {
		queue = null;
	}
	
	public String remove() {
		// Identical to pop
		if (queue == null) {
			return null;
		}
		String first = queue.getData();
		queue = queue.getRest();
		return first;
	}
	
	public void add(String s) {
		InternalQueue q = queue;
		if (q == null) {
			queue = new InternalQueue(s, null);
		} else {
			while (q.getRest() != null) {
				q = q.getRest();
			}
			q.setRest(new InternalQueue(s, null));
		}		
		
	}
}
