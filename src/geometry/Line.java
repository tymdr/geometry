package geometry;

public class Line {

	private Point p2;
	private Point p1;

	public Line(Point p1, Point p2) {
		this.p2 = p2;
		this.p1 = p1;
	}

	public double length() {
		if(p1.getX()==p2.getX()) {
			return p2.getY()-p1.getY();
		}
		return p2.getX() - p1.getX();
	}

}
