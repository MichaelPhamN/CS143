
public class Complexity {

	public static int sum(int[] a) {
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s = s + a[i];
		}
		return s;
	}

	public static void main(String[] args) {
		for (int i = 1000000; i < 2000000000; i *= 2) {
			long totalTime = 0;
			int trials = 100;
			for (int j = 0; j < trials; j++) {
				int[] a = new int[i];
				long start = System.currentTimeMillis();
				sum(a);
				long finish = System.currentTimeMillis();
				totalTime = totalTime + finish-start;
			}
			System.out.println(i+": "+totalTime/trials);
		}
	}

}
