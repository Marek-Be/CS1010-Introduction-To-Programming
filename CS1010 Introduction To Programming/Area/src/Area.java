import java.util.Scanner;
import java.lang.Math;

public class Area
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.print("X cooridinate of point A:");
	double inputX1 = scan.nextDouble();
	System.out.print("X cooridinate of point B:");
	double inputX2 = scan.nextDouble();
	System.out.print("X cooridinate of point C:");
	double inputX3 = scan.nextDouble();

	System.out.print("Y cooridinate of point A:");
	double inputY1 = scan.nextDouble();
	System.out.print("Y cooridinate of point B:");
	double inputY2 = scan.nextDouble();
	System.out.print("Y cooridinate of point C:");
	double inputY3 = scan.nextDouble();

	double Area = Math.abs(
		((inputX1 * (inputY2 - inputY3)) + (inputX2 * (inputY3 - inputY1)) + (inputX3 * (inputY1 - inputY2)))
			/ 2.0);

	System.out.println("Area:" + Area);
    }
}