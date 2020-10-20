
public class Pt1Q3 {
	public static void main(String[] args) {
		StringLL list = new StringLL();
		list.head = new StringLLNode();
		list.head.val = "A";
		list.head.next = new StringLLNode();
		list.head.next.val = "B";
		list.head.next.next = new StringLLNode();
		list.head.next.next.val = "C";
		list.head.next.next.next = new StringLLNode();
		list.head.next.next.next.val = "D";
		list.head.next.next.next.next = new StringLLNode();
		list.head.next.next.next.next.val = "E";
		list.head.next.next.next.next.next = new StringLLNode();
		list.head.next.next.next.next.next.val = "F";
		
		for(char c = 'A'; c <= 'G'; c++) {
			System.out.println(list.linearSearch(String.valueOf(c)));
		}
	}
}
