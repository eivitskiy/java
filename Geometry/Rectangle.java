public class Rectangle implements GeometricFigureInterface {
	private double length;
	private double width;

	public Rectangle(double length, double width) throws Exception {
		if (length <= 0 || width <= 0) {
			throw new Exception("Некорректное значение сторон прямоугольника");
		}

	   this.setLength(length);
	   this.setWidth(width);
	}

	public double area()
	{
		return this.getLength() * this.getWidth();
	}

	public double perimeter() {
		return 2 * (this.getLength() + this.getWidth());
	}

	public double getLength()
	{
		return this.length;
	}

	public void setLength(double length)
	{
		this.length = length;
	}

	public double getWidth()
	{
		return this.width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}
}