package Records;

public class RectangleDemo {

	public static void main(String[] args) {
		Point topLeft = new Point(2,1);
		Point bottomRight = new Point(8,5);
		Rectangle r = new Rectangle(topLeft,bottomRight);
		System.out.println("Area: "+r.area());
		

	}

}
