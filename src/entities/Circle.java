package entities;

public class Circle {
	public double radius;
	public double pi = 3.14;
	
	public double circumference() {
		return 2 * pi * radius;
	}
	
	public double volume() {
		return 4 * pi * Math.pow(radius,3)/3;
	}
	
	public String toString() {
		return String.format("Circumference: %.2f%n", circumference())
				+ String.format("Volume: %.2f%n", volume())
				+ String.format("PI value: %.2f", pi);
	}
}
