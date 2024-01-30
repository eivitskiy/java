package dev.eivitskiy;

import java.lang.Math;

public class Triangle implements GeometricFigureInterface {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) throws Exception {
		checkSidesLengths(a, b, c);	// здесь проверим что суммы 2х сторон больше 3й стороны

		// в каждом сеттере есть проверка на минимальную длину
	    setA(a);
	    setB(b);
	    setC(c);
	}

	public double area()
	{
		double p = perimeter() / 2;

		return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
	}

	public double perimeter() {
		return getA() + getB() + getC();
	}

	public double getA()
	{
		return this.a;
	}

	public void setA(double a) throws Exception
	{
		checkMinLength(a);

		this.a = a;
	}
	
	public double getB()
	{
		return this.b;
	}

	public void setB(double b) throws Exception
	{
		checkMinLength(b);

		this.b = b;
	}
	
	public double getC()
	{
		return this.c;
	}

	public void setC(double c) throws Exception
	{
		checkMinLength(c);

		this.c = c;
	}

	/*
	 * проверяем что сумма 2х любых сторон
	 * больше 3й
	 */
	private void checkSidesLengths(double a, double b, double c) throws Exception
	{
		boolean correct = !(a + b <= c);

        if (b + c <= a) {
			correct = false;
		}

		if (c + a <= b) {
			correct = false;
		}

		if (!correct) {
			throw new Exception("Некорректные значения сторон треугольника");
		}
	}

	/*
	 * проверяем что длина стороны больше 0
	 */
	private void checkMinLength(double length) throws Exception
	{
		if (length <= 0) {
			throw new Exception("Длина стороны должна быть больше 0");
		}
	}
}