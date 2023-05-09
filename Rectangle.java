package SetAProgramTwoTest_APR29;

public class Rectangle extends Shape
{
	private int length;

	public Rectangle(int length, int width) 
	{
		super(width);
		this.length = length;
	}


	public void areaOfRectangle()
	{
		double areaOfRectangle = length*getData();
		System.out.println("Area of Rectangle : "+areaOfRectangle);
	}

}
