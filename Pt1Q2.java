
public class Pt1Q2 {
	public static void main(String[] args) {
	    System.out.println(findMinPos(new double[]{1,3,5,7,2,4,6,8},0,7));
	    System.out.println(findMinPos(new double[]{-1,3,5,7,2,4,6,-8},0,7));
	    System.out.println(findMinPos(new double[]{-1,-3,-5,-7,-2,4,6,-8},0,7));
	}
  	public static double findMinPos(double[] inArray, int start, int end) {
	    if(end < start) return -9999;
	    if(end == start && inArray[start] >= 0) return inArray[start];
	    if(end == start && inArray[start] < 0) return -9999;

	    int mid = start + (end - start)/2;
	    double leftMin = findMinPos(inArray, start, mid);
	    double rightMin = findMinPos(inArray, mid+1, end);
	    if(leftMin < 0) return rightMin;
	    if(rightMin < 0) return leftMin;
	    // neither is the failure value
	    if(leftMin < rightMin) return leftMin;
	    return rightMin;

	  }
}
