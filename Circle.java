package SetAProgramTwoTest_APR29;

public class Circle extends Shape
{
   final double PI = 3.14;
   
   public Circle(int radius)
   {
	   super(radius);
   }
   
   public void areaOfCircle()
   {
	  double areaOfCircle =  PI*getData()*getData();
	  
	  System.out.println("Area of Circle : "+areaOfCircle);
   }
}
