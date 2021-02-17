package recursive;

public class Zadacha2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1265;
		System.out.print(sborNaCifri(n));

	}
	
	
	
	public static int sborNaCifri(int number) {
		if(number<=10) {
			return number;
		}
		else {
			return (number%10)+sborNaCifri(number/10);
		}
	}


}
