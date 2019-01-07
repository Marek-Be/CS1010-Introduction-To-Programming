public class VectorVictor
{
    static double[] VECTOR = {1};
    
    public static double vectorMagnitude(double[] vector)
    {
	double total = 0;
	for (int i = 0; i < vector.length; i++)
	{
	    total += (vector[i] * vector[i]);
	}
	return Math.sqrt(total);
    }
    
    public static void normalizedVector(double[] vector)
    {
	double magnitude = vectorMagnitude(vector); 
	for (int i = 0; i < vector.length; i++)
	{
	    vector[i] = vector[i]/magnitude;
	}
    }
    
    public static void addVector(double[] vector1, double[] vector2)
    {
	for (int i = 0; i < vector1.length; i++)
	{
	    vector1[i] = (vector1[i] + vector2[i]);
	}
    }
    
    public static void main(String[] args)
    {
	normalizedVector(VECTOR);
	for (int i = 0; i < VECTOR.length; i++)
	{
	    System.out.println(VECTOR[i]);
	}
    }
}
