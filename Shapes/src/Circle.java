/*
 * Circle.java
 */

/**
 *
 * @author Anne Chen
 */
public class Circle extends TwoDimensionalShape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	@Override
	public String getName() {
		return "Circle";
	}
	
	@Override
	public String toString() {
		return "radius: " + radius;
	}
}
