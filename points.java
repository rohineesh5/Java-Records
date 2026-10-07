package Records;
record Point(int x,int y) {
	public static Point origin() {
		return new Point(0,0);
	}
	
}

public class points {

	public static void main(String[] args) {
		//Point p = new Point(5,3);
		Point p = Point.origin();
		System.out.println(p.x());
		System.out.println(p.y());
		
	
	}

}
