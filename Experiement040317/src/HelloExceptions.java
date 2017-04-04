public class HelloExceptions{
	public static void printLength(String s){		
		System.out.println(s.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Hello World");
			printLength("123456");
			String s = null;
			printLength(s);
			throw new RuntimeException("Our little exception");
		}catch(Exception e){
			System.out.println("Oops! Exception happened.");
			e.printStackTrace(System.out);
		}
		System.out.println("After the try/catch block");
	}

}
