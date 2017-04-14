
public class SimpleRecursion {

	private static int find(int[] a, int x, int n) {
		// n is the starting point
		// wait, is n even valid? if not, we must not
		// have x in the array.
		if (n >= a.length) {
			// We've fallen off the edge so x isn't in
			// the array!
			return -1;
		}
		// if x is at n, we're done! we found it!
		if (a[n] == x) {
			return n;
		}
		// otherwise, ask our subordinate to find x after n
		return find(a, x, n+1);
		// be careful - what if x isn't in the array?
		// if you try to step off the edge, it means
		// that it must not have been in the array.
	}
	
	/**
	 * Attempt to find first instance of xx in a
	 * @param a
	 * @param x
	 * @return index of x if found, otherwise -1
	 */
	public static int find(int[] a, int x) {
		// Don't use a for/while loop at all and don't use
		// any Java Foundation Class methods!
		return find(a, x, 0);
	}
	
	public static long square(long n) {
		if (n == 1) {
			return 1; // 1 squared is 1!
		}
		return square(n-1) + n + n - 1;
	}
	
	public static int fib(int n){
		if(n == 0 || n == 1){
			return 1;
		}
		
		return fib(n-1) + fib(n - 2); 
	}
	
	public static void main(String[] args) {
		/*int[] a = {1, 2, 3};
		int[] b = {};
		System.out.println(find(a, 1)); // return 0
		System.out.println(find(a, 4)); // return -1
		System.out.println(find(a, 3)); // return 2
		System.out.println(find(b, 1));
		/*
		System.out.println("1^2 = "+square(1));
		System.out.println("2^2 = "+square(2));
		System.out.println("4^2 = "+square(4));
		System.out.println("100000^2 = "+100000L*100000L);
		System.out.println("100000^2 = "+square(100000));
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "  " + fib(i));
		*/
		
		int[] a = new int[1000000];
		for(int i = 1; i< a.length;i++){
			a[i] = a[i - 1] + (int)(Math.random()*3);
		}
		long start = System.currentTimeMillis();
		for(int x = 0; x < 1000000; x++){
			for(int j = 0; j < a.length; j++){
				if(a[j] == x) break; // we found it 
				else if(a[j] > x) break; // we will never find it
			}		
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
