import java.util.Scanner;
import java.lang.Math;

public class Average
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	double average = 0;
	double deviation = 0;
	double sum = 0;

	System.out.println("Put in 3 values, pressing enter to input a value");

	double input1 = scan.nextDouble();
	double input2 = scan.nextDouble();
	double input3 = scan.nextDouble();

	average = (input1 + input2 + input3) / 3.0;

	sum += (input1 - average) * (input1 - average);
	sum += (input2 - average) * (input2 - average);
	sum += (input3 - average) * (input3 - average);

	deviation = Math.sqrt(sum / 3.0);

	System.out.println("Deviation:" + deviation);
	System.out.println("Average:" + average);

    }
}