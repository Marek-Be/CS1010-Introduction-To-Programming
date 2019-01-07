public class TriangleStars
{
    public static int currentStarCount = 0;
    
    public static int starNumber(int number)
    {
	return 6 * number * (number - 1) + 1;
    }
    
    public static boolean isStarNumber(int number)
    {	
	int currentStarNumber = 0;
		while(currentStarNumber < number)
		{
			currentStarNumber = starNumber(currentStarCount);
			currentStarCount++;
		}
	currentStarCount--;
	return (currentStarNumber == number);
    }
    
    public static void main(String[] args)
    {
	int nextTrianglePart = 1;
	int triangleNumber = 1;
	while (triangleNumber < (Integer.MAX_VALUE - nextTrianglePart))
		{
			if (isStarNumber(triangleNumber))
			System.out.println(triangleNumber);
			nextTrianglePart++;
			triangleNumber += nextTrianglePart;
		}
    }
}