package Records;

record Rectangle(Point topLeft,Point bottomRight) {
	Rectangle{
		if(bottomRight.x()<=topLeft.x()||
			bottomRight.y()<=topLeft.y()) {
			throw new IllegalArgumentException("Invalid X or Invalid Y");
		}
	}
	public int area() {
		int width=bottomRight.x()-topLeft.x();
		int height=bottomRight.y()-topLeft.y();
		return width*height;
	}
}


