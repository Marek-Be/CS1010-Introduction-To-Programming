import java.util.Scanner;
import java.lang.Math;

public class Shillings
{
    public static void main(String[] args)
    {
	final int PENNY_TO_NEW = 67;
	final int SHILLING_TO_OLD_PENNY = 12;
	final int OLD_POUND_TO_OLD_SHILLING = 20;
	final int POUND_TO_PENNY = 100;

	int totalPennies = 0;

	Scanner scan = new Scanner(System.in);
	try
	{
	    System.out.println("How much money would you like to convert?");
	    scan.useDelimiter("[\\s,]+");

	    System.out.println("Give your amount in the following format: [Old Pounds], [Old Shillings], [Old pence]");
	    int pounds = scan.nextInt();
	    int shillings = scan.nextInt();
	    int pence = scan.nextInt();

	    shillings += pounds * OLD_POUND_TO_OLD_SHILLING;
	    pence += shillings * SHILLING_TO_OLD_PENNY;
	    totalPennies = pence * PENNY_TO_NEW;

	    if (Math.abs(totalPennies % POUND_TO_PENNY) < 10)
	    {
		System.out.print("£" + (totalPennies - totalPennies % POUND_TO_PENNY) / POUND_TO_PENNY + ".0"
			+ Math.abs(totalPennies % POUND_TO_PENNY));
	    }
	    else
	    {
		System.out.print("£" + (totalPennies - totalPennies % POUND_TO_PENNY) / POUND_TO_PENNY + "."
			+ Math.abs(totalPennies % POUND_TO_PENNY));
	    }
	}
	catch (Exception e)
	{
	    System.out.print("An error ocurred, please re-run the program. The error that occured was: " + e);
	}
	scan.close();

    }
}