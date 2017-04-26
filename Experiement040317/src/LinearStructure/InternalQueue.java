package LinearStructure;
public class InternalQueue {
	private String data;
	private InternalQueue rest;
	
	public InternalQueue(String data, InternalQueue rest) {
		this.data = data;
		this.rest = rest;
	}
	
	public String getData() {
		return data;
	}
	
	public InternalQueue getRest() {
		return rest;
	}
	
	public void setRest(InternalQueue next) {
		rest = next;
	}
	
	public int size() {
		if (rest == null) return 1;
		return 1 + rest.size();
	}
	
}
