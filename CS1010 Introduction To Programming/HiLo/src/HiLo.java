import java.util.Random;
import java.util.Scanner;

public class HiLo
{
    public static String CompareCards(int Card1, int Card2)
    {
	if (Card1 == Card2)
	    return "equal";
	else if (Card1 < Card2)
	    return "lower compared";
	else if (Card1 > Card2)
	    return "higher compared";
	return null;
    }

    final static int AMOUNT_TO_WIN = 4;

    public static void main(String[] args)
    {
	String[] cards =
	{ "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

	Scanner scan = new Scanner(System.in);

	String guess = "";
	int lastCard = 0;
	int currentCard = 0;
	int wonRounds = 0;

	Random cardType = new Random();

	try
	{
	    lastCard = cardType.nextInt(13);
	    System.out.println("The card that came out is a " + cards[lastCard]);
	    while (wonRounds < AMOUNT_TO_WIN)
	    {
		System.out.print("Please guess if the next card will be Higher or Lower or Equal to the last:");
		guess = scan.nextLine().toLowerCase();
		if (guess.contains("hi"))
		{
		    currentCard = cardType.nextInt(cards.length);
		    System.out.println("The card that came out is a " + cards[currentCard]);
		    if (currentCard > lastCard)
		    {
			wonRounds++;
			System.out.println("Well done you guessed correclty! You have " + wonRounds + " rounds won");
		    }
		    else
		    {
			System.out.println("Im sorry but this card is " + CompareCards(currentCard, lastCard)
				+ " to the last one.");
			wonRounds = 0;
		    }
		}
		else if (guess.contains("lo"))
		{
		    currentCard = cardType.nextInt(13);
		    System.out.println("The card that came out is a " + cards[currentCard]);
		    if (currentCard < lastCard)
		    {
			wonRounds++;
			System.out.println("Well done you guessed correclty! You have " + wonRounds + " rounds won");
		    }
		    else
		    {
			System.out.println("Im sorry but this card is " + CompareCards(currentCard, lastCard)
				+ " to the last one.");
			wonRounds = 0;
		    }
		}
		else if (guess.contains("equal"))
		{
		    currentCard = cardType.nextInt(13);
		    System.out.println("The card that came out is a " + cards[currentCard]);
		    if (lastCard == currentCard)
		    {
			wonRounds++;
			System.out.println("Well done you guessed correclty! You have " + wonRounds + " rounds won");
		    }
		    else
		    {
			System.out.println("Im sorry but this card is " + CompareCards(currentCard, lastCard)
				+ " to the last one.");
			wonRounds = 0;
		    }
		}
		else
		{
		    System.out.println("Invalid input, please use 'higher', 'lower' or 'equal'");
		}
		lastCard = currentCard;
	    }
	    if (wonRounds == AMOUNT_TO_WIN)
		System.out.println("Congratulations! You have won!");
	}
	catch (Exception e)
	{

	}
    }
}