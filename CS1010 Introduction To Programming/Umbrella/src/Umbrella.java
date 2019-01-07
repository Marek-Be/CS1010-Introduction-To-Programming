import javax.swing.JOptionPane;

public class Umbrella
{
    public static void main(String[] args)
    {
	final String ASK_CHANCE = "Is there a chance that it will rain today?";
	final String ASK_RAIN = "Is it currently raining?";

	final String IS_RAINING = "You should probably take your umbrella and put it up today";
	final String IS_CHANCE = "I recommend you bring an umbrella just incase it rains";
	final String NOTHING = "You wont need to bring an umbrella today";

	int answerChance = JOptionPane.showConfirmDialog(null, ASK_CHANCE);
	int answerRain = 0;

	if (answerChance == 0)
	{
	    answerRain = JOptionPane.showConfirmDialog(null, ASK_RAIN);
	}

	try
	{
	    if (answerRain == 0 && answerChance == 0)
		JOptionPane.showMessageDialog(null, IS_RAINING);
	    else if (answerChance == 0)
		JOptionPane.showMessageDialog(null, IS_CHANCE);
	    else
		JOptionPane.showMessageDialog(null, NOTHING);
	}
	catch (Exception e)
	{
	    System.out.println("An error occured: " + e);
	}
    }
}