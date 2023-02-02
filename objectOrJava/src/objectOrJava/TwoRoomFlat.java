package objectOrJava;

public class TwoRoomFlat extends Flat{
	public TwoRoomFlat(int rooms, double area, int floar, String type) {
		super(2, area, floar, type);
	}
	protected boolean IsDressing() {
		if(this.sqareRoom()>20) {
			return true;
		}else {
			return false;
		}
	}
	public void cool(){
		System.out.println("not so cool");
	}
}
