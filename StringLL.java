
public class StringLL {
	StringLLNode head;

	public boolean linearSearch(String search){
		StringLLNode current = head;
		while(current != null){
			if(current.val.equals(search)){
				return true;
			}else{
				//blank
			}
			current = current.next;
		}
		return false;
	}
}