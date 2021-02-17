package recursive;

public class Zadacha4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 125;
		
		cifriOtDqsnoNaLqwo(n);

	}
	
	public static void cifriOtDqsnoNaLqwo(int number) {
		System.out.println(number%10);
		if(number>=10) {
			cifriOtDqsnoNaLqwo(number/10);
		}
	}

}
