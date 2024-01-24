import java.lang.Math;

public class Circle implements GeometricFigureInterface {
	private double radius;

	public Circle(double radius) throws Exception {
		if (radius <= 0) {
			throw new Exception("Некорректное значение радиуса круга");
		}

		this.setRadius(radius);
	}

	public double area()
	{
		return Math.PI * Math.pow(this.getRadius(), 2);
	}

	public double perimeter() {
		return 2 * Math.PI * this.getRadius();
	}

	public double getRadius()
	{
		return this.radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}
}