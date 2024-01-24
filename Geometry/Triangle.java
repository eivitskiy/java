import java.lang.Math;

public class Triangle implements GeometricFigureInterface {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) throws Exception {
		this.checkValues(a, b, c);

	    this.setA(a);
	    this.setB(b);
	    this.setC(c);
	}

	public double area()
	{
		double p = this.perimeter() / 2;

		return Math.sqrt(p * (p - this.getA()) * (p - this.getB()) * (p - this.getC()));
	}

	public double perimeter() {
		return this.getA() + this.getB() + this.getC();
	}

	public double getA()
	{
		return this.a;
	}

	public void setA(double a)
	{
		this.a = a;
	}
	
	public double getB()
	{
		return this.b;
	}

	public void setB(double b)
	{
		this.b = b;
	}
	
	public double getC()
	{
		return this.c;
	}

	public void setC(double c)
	{
		this.c = c;
	}

	private void checkValues(double a, double b, double c) throws Exception
	{
		boolean correct = true;

		if (a <= 0 || b <= 0 || c <= 0) {
			correct = false;
		}

		if (a + b < c) {
			correct = false;
		}

		if (b + c < a) {
			correct = false;
		}

		if (c + a < b) {
			correct = false;
		}

		if (false == correct) {
			throw new Exception("Некорректные значения сторон треугольника");
		}
	}
}