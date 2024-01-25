public class Rectangle implements GeometricFigureInterface {
	private double length;
	private double width;

	public Rectangle(double length, double width) throws Exception {
	    setLength(length);
	    setWidth(width);
	}

	public double area()
	{
		return getLength() * getWidth();
	}

	public double perimeter() {
		return 2 * (getLength() + getWidth());
	}

	public double getLength()
	{
		return this.length;
	}

	public void setLength(double length) throws Exception
	{
		checkMinLength(length);
		
		this.length = length;
	}

	public double getWidth()
	{
		return this.width;
	}

	public void setWidth(double width) throws Exception
	{
		checkMinLength(width);

		this.width = width;
	}

	private void checkMinLength(double length) throws Exception
	{
		if (length <= 0) {
			throw new Exception("Длина стороны должна быть больше 0");
		}
	}
}