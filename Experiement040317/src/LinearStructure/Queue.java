package LinearStructure;
public class Queue {
	private InternalQueue queue;
	private InternalQueue end; // Who is the last person in line?
	public Queue() {
		queue = null;
		end = null;
	}
	
	public String remove() {
		// Identical to pop
		if (queue == null) {
			return null;
		}
		String first = queue.getData();
		queue = queue.getRest();
		if (queue == null) {
			end = null; // Nobody is last in line
		}
		return first;
	}
	
	public void add(String s) {
		InternalQueue q = queue;
		if (q == null) {
			queue = new InternalQueue(s, null);
			end = queue; // The last person is the only person in line
		} else {
			q = end;
			q.setRest(new InternalQueue(s, null));
			// Change the last thing in line
			end = end.getRest(); // Actual last person is the person after the old last person
		}		
		
	}
}
