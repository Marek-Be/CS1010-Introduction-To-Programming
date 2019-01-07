
public class Marks
{
    public static int[] marksArray = {1, 4, 2, 420, 69};
    
    public static int howManyScoresAreAbove(int score, int[] scores)
    {
	int scoreBigger = 0;
	if (scores != null)
	{
	for (int i = 0; i < scores.length; i++)
	{
	    if (scores[i] > score)
	    {
		scoreBigger+=1;
	    }
	}
	return scoreBigger;
	}
    }
    
    public static int[] determinePlacesString(int[] scores) {
	
	int[] arrayNumber = new int[scores.length];
	
	for (int i = 0; i < scores.length; i++)
	{
	    howManyScoresAreAbove(scores[i], scores);
	}
	return arrayNumber;
    }
    
    public static String determinePlacesString()
    {
	return
    }
    
    public static void main(String[] args)
    {
	
    }
}
