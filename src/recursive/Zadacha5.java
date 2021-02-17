package recursive;

public class Zadacha5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int k = 1;
		desetNaKStepen(n,k);
	}
	
	
	public static void desetNaKStepen(int number, int k) {
		if(k==number) {
			System.out.println(Math.pow(10, k));
			return;
		}
		System.out.println(Math.pow(10, k));
		desetNaKStepen(number,k+1);
		System.out.println(Math.pow(10, k));
	}

}
