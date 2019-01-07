import java.util.Scanner;
import java.lang.Math;

public class Year
{
    static int MAX_MONTH_DAYS = 31;
    static int OTHER_MONTH_DAYS = 30;
    static int MAX_MONTHS = 12;
    
    static int LEAP_YEAR_DAYS = 29;
    static int NOT_LEAP_YEAR_DAYS = 28;
    
    static int THIRD_DAY = 3;
    static int SECOND_DAY = 2;
    static int FIRST_DAY = 1;
    
    static int START_TEEN_DAY = 10;
    static int END_TEEN_DAY = 20;
    
    static int JANUARY = 1;
    static int FEBRUARY = 2;
    
    static int MAX_YEAR = 10000;
    
    static String[] MONTHS =
    { "January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November",
	    "December" };
    static String[] DAYS =
    { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    public static boolean isLeapYear(int Year)
    {
	if (Year % 400 == 0 || (Year % 4 == 0 && Year % 100 != 0))
	    return true;
	else
	    return false;
    }

    public static boolean validDate(int Year, int Month, int Day)
    {
	if ((Day <= daysInMonth(Month, Year) && Day > 0) && Year > 0 && Year < MAX_YEAR)
	    return true;
	else
	    return false;
    }

    public static int daysInMonth(int Month, int Year)
    {
	switch (Month)
	{
	case 1:
	    return MAX_MONTH_DAYS;
	case 2:
	    if (isLeapYear(Year))
		return LEAP_YEAR_DAYS;
	    else
		return NOT_LEAP_YEAR_DAYS;
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	    return MAX_MONTH_DAYS;
	default:
	    if (Month <= MAX_MONTHS && Month > 0)
	    {
		return OTHER_MONTH_DAYS;
	    }
	    return 0;
	}
    }

    public static String monthName(int month)
    {
	if (month > 0 && month <= MAX_MONTHS)
	{
	    return MONTHS[month - 1];
	}
	return "invalid";
    }

    public static String dayOfTheWeek(double day, double month, double year)
    {
	if (month == JANUARY || month == FEBRUARY)
	    year-=1;
	
	double y = (year % 1000);
	y %= 100;
	double c = (year - y) / 100;

	int w = (int) (((day + Math.floor(2.6 * (((month + 9) % 12) + 1) - 0.2) + y + Math.floor(y / 4)
		+ Math.floor(c / 4) - (2 * c)) % 7));
	w = Math.abs(w);
	return DAYS[w];
    }

    public static String numberEnding(int day)
    {
	if (day <= MAX_MONTH_DAYS && day > 0)
	{
	    if (day % START_TEEN_DAY == FIRST_DAY && (day < START_TEEN_DAY || day > END_TEEN_DAY))
		return "st";
	    else if (day % START_TEEN_DAY == SECOND_DAY && (day < START_TEEN_DAY || day > END_TEEN_DAY))
		return "nd";
	    else if (day % START_TEEN_DAY == THIRD_DAY && (day < START_TEEN_DAY || day > END_TEEN_DAY))
		return "rd";
	    else
		return "th";
	}
	return "Error";
    }

    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	scan.useDelimiter("/|\n|\r\n|\\s+");
	
	int day = 0;
	int month = 0;
	int year = 0;

	System.out.print("Please enter a date in the format Day/Month/Year:");
	
	if (scan.hasNextInt() && scan.hasNextInt() && scan.hasNextInt())
	{
	    day = scan.nextInt();

	    month = scan.nextInt();

	    year = scan.nextInt();

	    if (validDate(year, month, day))
	    {
		System.out.println(dayOfTheWeek(day, month, year) + ", " + day + numberEnding(day) + " "
			+ monthName(month) + " " + year);
	    }
	    else
	    {
		System.out.println("The date you have put in is invalid, please enter the date in the format Day/Month/Year");
	    }
	}
    }
}