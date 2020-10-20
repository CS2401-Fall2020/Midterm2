
public class Pt2Q1 {

	public static void main(String[] args) {
		int[] original = {3, -10, 5, 7, -1, 0, 7, 12, 2, 1};
		
		int[] insert = original.clone();
		insertionSortPosition(insert,1);
		insertionSortPosition(insert,2);
		System.out.print("Insert after 2 passes: { " + insert[0]);
		for(int i=1; i<insert.length; i++) {
			System.out.print(", " + insert[i]);
		}
		System.out.println("}");
		for(int i=3;i<insert.length;i++) insertionSortPosition(insert,i);
		System.out.print("Insert after all passes: { " + insert[0]);
		for(int i=1; i<insert.length; i++) {
			System.out.print(", " + insert[i]);
		}
		System.out.println("}");
		
		int[] bubble = original.clone();
		bubbleSortPass(bubble);
		bubbleSortPass(bubble);
		System.out.print("Bubble after 2 passes: { " + bubble[0]);
		for(int i=1; i<bubble.length; i++) {
			System.out.print(", " + bubble[i]);
		}
		System.out.println("}");
		for(int i=3;i<bubble.length;i++) bubbleSortPass(bubble);
		System.out.print("Bubble after all passes: { " + bubble[0]);
		for(int i=1; i<bubble.length; i++) {
			System.out.print(", " + bubble[i]);
		}
		System.out.println("}");
		
		int[] select = original.clone();
		selectionSortPos(select,select.length-1);
		selectionSortPos(select,select.length-2);
		System.out.print("Selection after 2 passes: { " + select[0]);
		for(int i=1; i<select.length; i++) {
			System.out.print(", " + select[i]);
		}
		System.out.println("}");
		for(int i=select.length-2;i>0;i--) selectionSortPos(select,i);
		System.out.print("Selection after all passes: { " + select[0]);
		for(int i=1; i<select.length; i++) {
			System.out.print(", " + select[i]);
		}
		System.out.println("}");
	}
	
	public static void insertionSortPosition(int[] inArr, int position) {

		if(inArr[position] > inArr[position-1]) return;
		int save = inArr[position];
		int putIn = position-1;
		while(putIn > 0 && inArr[putIn-1] > save) {
			putIn--;
		}
		for(int move=position; move>putIn; move--) {
			inArr[move] = inArr[move-1];
		}
		inArr[putIn] = save;
	}
	
	public static void bubbleSortPass(int[] inArr) {
		for(int i=1; i<inArr.length; i++) {
			if(inArr[i] < inArr[i-1]) {
				int temp = inArr[i];
				inArr[i] = inArr[i-1];
				inArr[i-1] = temp;
			}
		}
	}
	

	public static void selectionSortPos(int[] inArr, int toPlace){
		int maxIndex = toPlace;
		for(int i=0;i<toPlace;i++) {
			if(inArr[i] > inArr[maxIndex]) {
				maxIndex = i;
			}
		}
		int temp = inArr[maxIndex];
		inArr[maxIndex] = inArr[toPlace];
		inArr[toPlace] = temp;
	}

}
