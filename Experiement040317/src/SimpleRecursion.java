
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
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
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
		*/

	}

}
