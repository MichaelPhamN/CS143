
public class DoublyLinkedListTest {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		int n = 4000000;
		for (int i = 0; i < n; i++) {
			list.add(String.valueOf(i));
		}
		int i = 0;
		for (String s : list) {
			if (!String.valueOf(i).equals(s)) {
				throw new RuntimeException("Oops");
			}
			i++;
		}
		System.out.println(list.get(3));
	}

}
