/*
 * Cube.java
 */

/**
 *
 * @author Anne Chen
 */
public class Cube extends ThreeDimensionalShape {
	private double side;
	
	public Cube(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return 6*side*side;
	}
	
	@Override
	public double getVolume() {
		return side*side*side;
	}
	
	@Override
	public String getName() {
		return "Cube";
	}
	
	@Override
	public String toString() {
		return "side: " + side;
	}

}
