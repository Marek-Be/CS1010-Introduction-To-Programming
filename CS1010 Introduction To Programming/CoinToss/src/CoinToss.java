import java.util.Random;

public class CoinToss
{
    final static int AMOUNT_TO_FLIP = 10000;

    public static void main(String[] args)
    {
	int result = 0;
	String lastResult = "Tail";
	Random Generate = new Random();

	try
	{
	    for (int i = 0; i < AMOUNT_TO_FLIP - 1; i++)
	    {
		result += Generate.nextInt(2);
	    }
	    if (Generate.nextInt(2) == 1)
	    {
		result += 1;
		lastResult = "Head";
	    }
	    System.out.println(result + " Heads were tossed and " + (AMOUNT_TO_FLIP - result) + " Tails were tossed.");
	    System.out.println("The last result was a " + lastResult);
	}
	catch (Exception e)
	{
	    System.out.println("An error occured: " + e);
	}
    }
}