import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class SquareNumber
{
    public static int PowerOf(int number, int exponent)
    {
	int base = number;
	
	for (int i = 0; i < exponent - 1; i += 1)
	    if(number>Integer.MAX_VALUE/base ||number<Integer.MIN_VALUE/base){
	    number *= base;}else{
		number = 0;
	    }

	return number;
    }

    public static final void main(String[] args)
    {

	try
	{

	    boolean finished = false;

	    Scanner scan = new Scanner(System.in);

	    while (!finished)
	    {
		System.out.print("Please input the base:");

		int userNumber = 0;
		int userExponent = 0;
		if (scan.hasNextInt())
		{
		    userNumber = scan.nextInt();
		    System.out.print("Please input the exponent:");
		    if (scan.hasNextInt())
		    {
			userExponent = scan.nextInt();

			if (userExponent == 0)
			{
			    System.out.println("1");
			    finished = true;
			    scan.close();
			}
			else
			{
			    int answer = PowerOf(userNumber, userExponent);
			    System.out.print("Result = "+((answer==0)? "Result too big" : answer));
			    finished = true;
			    scan.close();
			}
		    }else{
			scan.next();
			System.out.println("Please input a valid number.");
		    }
		}
		else
		{
		    scan.next();
		    System.out.println("Please input a valid number.");
		}

	    }
	}
	catch (NullPointerException braindamage)
	{
	    System.out.println("You have braindamage, dont be a braindamaged");
	}
	catch (InputMismatchException inputerror)
	{

	    System.out.print("Please input a number instead of letters");
	}
	catch (Exception e)
	{
	    System.out.println("An error occured: " + e);
	    System.out.println("Please restart the program");
	}
    }
}