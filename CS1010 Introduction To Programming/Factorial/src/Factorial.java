
public class Factorial
{

    
    
    public static int computeFactorial(int number)
    {
	int answer = 1;
	if (number > 1)
	{
	    answer = computeFactorial(number - 1) * number;
	}
	
	return answer;
    }

    public static int firstDigit(int n) {
	while (n < -9 || 9 < n) n /= 10;
	return Math.abs(n);
    }

    static int numlength(int n)
    {
        if (n == 0) return 1;
        int l;
        n=Math.abs(n);
        for (l=0;n>0;++l)
            n/=10;
        return l;           
    }
    
    static int power(int n, int e)
    {
	int answer = 1;
	while(e > 1)
	{
	    answer *= n;
	    e-=1;
	}
	return answer;
    }
    
    public static boolean isFactorian(int number)
    {
	int answer = 0;
	int originalNum = number;
	
	while (number > 0)
    	{
	    answer += computeFactorial(firstDigit(number));
	    number -= firstDigit(number) * power(10, numlength(number));
	}
	if (answer == originalNum)
	    return true;
	else
	    return false;
    }
    
    public static void main(String[] args)
    {
	System.out.println(isFactorian(146));
	
    }

}
