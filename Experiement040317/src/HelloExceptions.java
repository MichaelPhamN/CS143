
public class HelloExceptions {

	/**
	 * Prints the length of the string. Throws an exception if s is null.
	 * @param s non-null string
	 */
	public static void printLength(String s) throws Exception {
		try {
			System.out.println(s.length());
			System.out.println("Do we see this?");
			return;
		} finally {
			System.out.println("This is guaranteed to run");
		}
	}
	
	
	public static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Division by 0 not allowed");
		}
		return a / b;
	}
	
	public static void main(String[] args) {
		//int i = 0;
		try {
			printLength("12345");
			printLength(null);
			System.out.println("Hello");
		} catch (Throwable e) {
			System.out.println("Oops!");
			e.printStackTrace(System.out);
		}
		System.out.println("Goodbye");
	}

}



















//public class HelloExceptions{
//	public static void printLength(String s){		
//		System.out.println(s.length());
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try{
//			System.out.println("Hello World");
//			printLength("123456");
//			String s = null;
//			printLength(s);
//			throw new RuntimeException("Our little exception");
//		}catch(Exception e){
//			System.out.println("Oops! Exception happened.");
////			e.printStackTrace(System.out);
//		}
//		System.out.println("After the try/catch block");
//	}
//
//}
