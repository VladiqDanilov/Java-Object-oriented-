package objectOrJava;

public class NotConstLen {

	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1, 2, 4, 4));
		/*
		sum(1, 2, 3);
		sum(1, 2, 4, 4);
		*/
	}
	public static int sum(int ...nums) {
		int s=0;
		for(int i: nums) {
			s+=i;
		}
		return s;
	}
	/*
	public static void sum(int ...nums) {
		int s=0;
		for(int i: nums) {
			s+=i;
		}
		System.out.println(s);
	}
	*/
}
