/*
 * Tetrahedron.java
 */

/**
 *
 * @author Anne Chen
 */
public class Tetrahedron extends ThreeDimensionalShape {
	private double baseWidth;
	private double baseHeight;
	private double height;
	
	public Tetrahedron (double baseWidth, double baseHeight, double height ) {
		this.baseWidth = baseWidth;
		this.baseHeight = baseHeight;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return 4*0.5*baseWidth*baseHeight;
	}
	
	@Override
	public double getVolume() {
		return (1.0/3)*0.5*baseWidth*baseHeight*height;
	}
	
	@Override
	public String getName() {
		return "Tetrahedron";
	}
	
	@Override
	public String toString() {
		return "base width: " + baseWidth + ", base height: " + baseHeight + ", height: " + height;
	}

}
