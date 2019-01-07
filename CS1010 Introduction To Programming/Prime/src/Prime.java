import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Prime
{
    public static void main(String[] args)
    {
	int switcheroooooo = 0;
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();
	boolean notPrime = false;
	
	System.out.print("Prizes should be given to the competiors who come ");
	for (int i = 1; i < input; i++)
	{
	    for (int a = 2; (a < i) && (!notPrime); a++)
	    {
		if (i%a == 0 && a < i)
		{
		    notPrime = true;
		}
	    }
	    if (!notPrime)
	    {
		int abc = i;
		while (abc > 10)
		{
		    abc %= 10;
		}
		switch (abc)
		{
		case 3:
		    if (i >10 && i <20)
			System.out.print(i + "th, ");
		    else
			System.out.print(i + "rd, ");
		    break;
		default:
		    if (i ==1)
			System.out.print(i + "st, ");
		    else if (i == 2)
			System.out.print(i + "nd, ");
		    else
			System.out.print(i + "th, ");
		}
	    }
	    notPrime = false;
	}
    }
}