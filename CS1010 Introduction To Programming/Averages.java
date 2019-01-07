import java.util.Scanner;

public class Averages
{
    public static final void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a number (or type 'exit'):");

	double counter = 0;
	double currentInput = 0.0;
	double average = 0;
	double variance = 0;
	boolean leave = false;
	double oldAverage = 0;
	String stringInput = "";

	while (!leave)
	{
	    if (scan.hasNextDouble())
	    {
		counter += 1;
		currentInput = scan.nextDouble();
		average = oldAverage + (currentInput - oldAverage) / counter;
		variance = ((variance * (counter - 1) + (currentInput - oldAverage) * (currentInput - average))
			/ counter);

		System.out.println("So far the average is " + average + "  and the variance is " + variance);
		System.out.print("Enter a number (or type 'exit'):");

		oldAverage = average;
	    }
	    else if (scan.hasNext())
	    {
		stringInput = scan.next();
		if (stringInput.toLowerCase().contains("quit") || stringInput.toLowerCase().contains("exit"))
		{
		    leave = true;
		    System.out.println("Goodbye.");
		    scan.close();
		}
		else
		{
		    System.out.print("Invalid input, enter a number or type 'quit':");
		}
	    }
	}
    }
}