import java.util.Scanner;

public class SquareYear
{

    public static int SquareNumber(int number)
    {
	return (number * number);
    }

    static int MAX_AGE = 123;

    public static final void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	System.out.print("Please input the current year:");
	int currentYear = scan.nextInt();

	int yearBorn = 0;
	int ageNow = 0;
	int squareYear = 0;
	int age = 0;

	try
	{
	    while (age < MAX_AGE)
	    {
		age++;

		squareYear = SquareNumber(age);
		yearBorn = (squareYear - age);
		ageNow = (currentYear - yearBorn);

		if ((yearBorn < (currentYear + MAX_AGE)) && ageNow <= MAX_AGE && ageNow >= 0)
		{
		    System.out.println("A person born in " + yearBorn + ", would have their age squared be in the year "
			    + squareYear + " at the age of " + age + ". Right now they are aged " + ageNow);
		}
	    }
	    scan.close();
	}
	catch (Exception e)
	{
	    System.out.println("An error occured: " + e);
	}
    }
}