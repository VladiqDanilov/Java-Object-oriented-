package objectOrJava;

public class Flat {
	int rooms;
	public String getType() {
		return type;
	}
	double area;
	int floar;
	String type;

	public Flat(int rooms, double area, int floar, String type) {
		super();
		this.rooms = rooms;
		this.area = area;
		this.floar = floar;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Flat [rooms=" + rooms + ", area=" + area + ", floar=" + floar + ", type=" + type + "]";
	}
	protected double sqareRoom() {
		return this.area/this.rooms;
	}
}
