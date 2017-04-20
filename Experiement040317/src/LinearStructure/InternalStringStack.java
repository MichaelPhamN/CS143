package LinearStructure;

public class InternalStringStack {
	private String data;
	private InternalStringStack rest;
	
	public InternalStringStack(String data, InternalStringStack rest){
		this.data = data;
		this.rest = rest;
	}
	
	public String getData(){
		return this.data;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
	public InternalStringStack getRest(){
		return this.rest;
	}
	
	public void setRest(InternalStringStack rest){
		this.rest = rest;
	}
	
	public int size(){
		if(rest == null) return 1;
		return 1 + rest.size();
	}
}
