/*
 * Triangle.java
 */

/**
 *
 * @author Anne Chen
 */
public class Triangle extends TwoDimensionalShape {
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return 0.5*base*height;
	}
	
	@Override
	public String getName() {
		return "Triangle";
	}
	
	@Override
	public String toString() {
		return "base: " + base + ", height: " + height;
	}

}
