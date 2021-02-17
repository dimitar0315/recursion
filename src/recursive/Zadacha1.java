package recursive;

public class Zadacha1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.print(sborNaChisla(n));

	}
	
	
	public static int sborNaChisla(int lastNumber) {
		if(lastNumber==0) {
			return lastNumber;
		}else {
			return lastNumber+sborNaChisla(lastNumber-1);
		}
	}

}
