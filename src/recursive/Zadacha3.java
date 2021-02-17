package recursive;

public class Zadacha3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 125;
		
		
		cifriOtLqwoNaDqsno(n);

	}
	
	
	public static void cifriOtLqwoNaDqsno(int number) {
		if(number>=10) {
			cifriOtLqwoNaDqsno(number/10);
		}
		System.out.println(number%10);
	}

}
