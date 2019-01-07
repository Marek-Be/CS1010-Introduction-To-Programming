import java.util.Arrays;
import java.util.Scanner;

public class HighScores
{
    public static int[] initialiseHighScores(int ArraySize)
    {
	int[] scores = new int[ArraySize];
	return scores;
    }

    public static void printHighScores(int[] AllScores)
    {
	if (AllScores != null)
	{
	    int[] sortedScores = AllScores.clone();
	    Arrays.sort(sortedScores);

	    System.out.print("The high scores are ");
	    for (int i = sortedScores.length - 1; i >= 0; i--)
	    {
		if (i == 0)
		{
		    System.out.println(sortedScores[i]);
		}
		else
		{
		    System.out.print(sortedScores[i] + ", ");
		}
	    }
	}
    }

    public static boolean higherThan(int checkScore, int[] highScores)
    {
	boolean higherThan = false;

	if (highScores != null)
	{
	    for (int i = 0; i < highScores.length && higherThan == false; i++)
	    {
		if (checkScore > highScores[i])
		    return true;
	    }
	}
	return false;
    }

    public static int[] insertScore(int[] highScores, int newScore)
    {
	int[] sortedArray = new int[highScores.length];

	if (highScores != null)
	{
	    int highScorePos = 0;
	    boolean isScore = false;

	    for (int i = 0; i < sortedArray.length; i++)
	    {
		if (newScore > highScores[highScorePos] && !isScore)
		{
		    sortedArray[i] = newScore;
		    isScore = true;
		}
		else
		{
		    sortedArray[i] = highScores[highScorePos];
		    highScorePos++;
		}
	    }
	}
	return sortedArray;
    }

    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.println("How many scores would you like to store?");

	if (scan.hasNextInt())
	{
	    int[] highScores = initialiseHighScores(scan.nextInt());
	    int newScore = 0;
	    boolean finished = false;

	    while (!finished)
	    {
		System.out.println("Enter score or 'quit' to quit");
		if (scan.hasNextInt())
		{
		    newScore = scan.nextInt();
		    if (higherThan(newScore, highScores))
		    {
			highScores = insertScore(highScores, newScore);
		    }
		    printHighScores(highScores);
		}
		else
		{
		    String input = scan.next();
		    if (input.toLowerCase().equals("quit"))
			finished = true;
		    else
			System.out.println("Please enter a valid input");

		}
	    }
	}
	else
	    System.out.println("Please enter a valid integer value");
	scan.close();
    }
}