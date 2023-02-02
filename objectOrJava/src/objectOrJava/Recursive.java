package objectOrJava;

public class Recursive {

	public static void main(String[] args) {
		System.out.println(factorial(2));
		System.out.println(fact(7));
	}
	public static int factorial(int n) {
		if (n==1){
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static int fact(int n) {
		int proizv=1;
		for(int i=1; i<=n; i++) {
			proizv*=i;
		}
		return proizv;
	}
}
