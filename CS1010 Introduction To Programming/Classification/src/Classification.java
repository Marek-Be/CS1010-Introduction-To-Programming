import java.util.Scanner;

public class Classification
{
    public static String Print(String s)
    {
	System.out.println(s);
	return null;
    }

    public static void main(String[] args)
    {

	boolean fins = false;
	String covering = "";
	boolean coldBlood = true;

	String animal = "Fish";

	Scanner scan = new Scanner(System.in);

	Print("Does your animal have fins? (Yes/No)");
	fins = scan.next().toLowerCase().contains("yes");
	Print("What kind of covering does your animal have? (Moist skin, Scales, Hair/Fur, Feathers)");
	covering = scan.next().toLowerCase();
	Print("Is your animal cold blooded? (Yes/No)");
	coldBlood = scan.next().toLowerCase().contains("yes");

	try
	{
	    if (fins != true)
	    {
		if (coldBlood)
		{
		    if (covering.contains("scales"))
		    {
			animal = "Reptile";
		    }
		    else
			animal = "Amphibian";
		}
		else
		{
		    if (covering.contains("feathers"))
			animal = "Bird";
		    else
			animal = "Mammal";
		}
	    }
	    Print("Your animal is classified as a " + animal);
	}
	catch (Exception e)
	{
	    Print("An error occured: " + e);
	}
	scan.close();
    }
}