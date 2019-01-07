import java.sql.Time;

public class Christmas
{
    final static String ON_THE = "On the ";
    final static String OF_CHRISTMAS = " day of Christmas";
    final static String MY_TRUE_LOVE = "my true love sent to me:";
    final static String[] NUMBERS_ENGLISH = {
	    				"first",
	    				"second",
	    				"third",
	    				"fourth",
	    				"fifth",
	    				"sixth",
	    				"seventh",
	    				"eighth",
	    				"ninth",
	    				"tenth",
	    				"eleventh",
	    				"twelfth"
    					};
    final static String[] SONG_LINES = {
				"Two Turtle Doves",
	    			"Three French Hens",
	    			"Four Calling Birds",
	    			"Five Golden Rings",
	    			"Six Geese a Laying",
	    			"Seven Swans a Swimming",
	    			"Eight Maids a Milking",
	    			"Nine Ladies Dancing",
	    			"Ten Lords a Leaping",
	    			"Eleven Pipers Piping",
	    			"12 Drummers Drumming",
    				};
    final static String PEAR_TREE = "Partridge in a Pear Tree";
    final static int VERSE_AMOUNT = 12;
    
    public static void main(String[] args)
    {
	int verse = 0;
	String songLine = "";
	
	
	
	while (verse < VERSE_AMOUNT)
	{
	    System.out.println(ON_THE + NUMBERS_ENGLISH[verse] + OF_CHRISTMAS);
	    System.out.println(MY_TRUE_LOVE);
	    switch (verse){
		case 0:
		    System.out.println("A " + PEAR_TREE);
		    System.out.println("");
		    break;
		default:
		    System.out.print(songLine);
		    System.out.println("And a " + PEAR_TREE);
		    System.out.println("");
		}
	    if (verse < VERSE_AMOUNT - 1)
		songLine =  SONG_LINES[verse] + "\n" + songLine;
	    verse++;
	}
    }
}