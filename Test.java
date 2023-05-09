package SetAProgramTwoTest_APR29;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
	
//		Circle cr = new Circle(10);
//		cr.areaOfCircle();
//		Rectangle rc = new Rectangle(5,5);
//		rc.areaOfRectangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int radius = sc.nextInt();
		Circle cr = new Circle(radius);
		cr.areaOfCircle();
		System.out.println("Enter the length : ");
		int length = sc.nextInt();
		Rectangle rc = new Rectangle(length, radius);
		rc.areaOfRectangle();
		sc.close();
	}

}
