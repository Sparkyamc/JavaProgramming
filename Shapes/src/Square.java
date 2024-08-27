/*
 * Square.java
 */

/**
 *
 * @author Anne Chen
 */
public class Square extends TwoDimensionalShape {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return side*side;
	}
	
	@Override
	public String getName() {
		return "Square";
	}
	
	@Override
	public String toString() {
		return "side: " + side;
	}

}
