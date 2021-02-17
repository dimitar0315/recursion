package recursive;

public class Zadacha6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = new int[]{1, 4,345, 236,34, 6347};
		
		System.out.println( containsNumber(test,  test.length, 236));
		System.out.println( containsNumber(test,  test.length, 12));
	}
	
	
	public static boolean containsNumber(int[] numbers, int numElements, int k) {
		
		if(numbers[numElements-1]==k) {
			return true;
		}
		else if (numElements>1){
			return containsNumber(numbers, numElements-1, k);
		}
		else
			return false;
	}

}
