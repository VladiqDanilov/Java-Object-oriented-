package objectOrJava;

public class MainLauch {

	public static void main(String[] args) {
		Flat Lesnay= new Flat(1, 20.75, 5, "middle");
		
		System.out.println(Lesnay.toString());
		TwoRoomFlat Pioner= new TwoRoomFlat(0, 50.05, 12, "luxury");
		Double Rsr1=Pioner.sqareRoom();
		System.out.println(Rsr1);
		System.out.println(Pioner.toString());
		System.out.println(Pioner.IsDressing());
		System.out.println(Lesnay.getType());
		Pioner.cool();
	}

}
