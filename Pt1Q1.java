
public class Pt1Q1 {

	public static void main(String[] args) {
	    System.out.println(binarySearchOddFirst(new int[]{1,3,5,7,2,4,6,8},3,0,7));
	    System.out.println(binarySearchOddFirst(new int[]{1,3,5,7,2,4,6,8},6,0,7));
	    System.out.println(binarySearchOddFirst(new int[]{1,3,5,7,2,4,6,8},9,0,7));

	}
	
	public static boolean binarySearchOddFirst(int[] inArray, int search, int start, int end) {
	    if(end < start) return false;
	    if(end == start) return inArray[end] == search;

	    int mid = start + (end - start)/2;
	    if(inArray[mid] == search) return true;
	    // search is odd, but mid is even, must be to the left
	    if(inArray[mid] % 2 == 0 && search % 2 == 1) {
	      return binarySearchOddFirst(inArray, search, start, mid-1);
	    }
	    // search is even, but mid is odd, must be to the right
	    if(inArray[mid] % 2 == 1 && search % 2 == 0) {
	      return binarySearchOddFirst(inArray, search, mid+1, end);
	    }

	    // otherwise both mid and search are either both odd or both even
	    // if mid is larger must be on the left
	    if(inArray[mid] > search) {
	      return binarySearchOddFirst(inArray, search, start, mid-1);
	    }
	    // if its smaller it must be on the right
	    return binarySearchOddFirst(inArray, search, mid+1, end);

	  }
}
