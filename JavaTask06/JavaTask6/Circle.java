package JavaTask6;

public class Circle {

	static double radius;

	public Circle() {
		this.radius = 2.0;

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public void displayInfo() {
		System.out.println("Radius: " + radius);
		System.out.printf("Circumference: %.2f%n", getCircumference());
	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.displayInfo();
		Circle c2 = new Circle(5.5);
		c2.displayInfo();

	}

}
