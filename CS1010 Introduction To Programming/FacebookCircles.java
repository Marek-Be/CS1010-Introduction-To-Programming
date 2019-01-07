

/* Make complete list of all users (Sorted)
 * 
 * 
 * 
 */
/**
 * Class FacebookCircles: calculates the statistics about the friendship circles
 * in facebook data.
 * 
 * @author
 * 
 * @version 01/12/15 02:03:28
 */
public class FacebookCircles {
	
	private int[][] friends;
	private int numberOfUsers;
	/**
			 * Constructor
			 * @param numberOfFacebookUsers : the number of users in the sample data.
			 * Each user will be represented with an integer id from 0 to numberOfFacebookUsers-1.
			 */
	public FacebookCircles(int numberOfFacebookUsers) {
		numberOfUsers = numberOfFacebookUsers;
		int[][] users = new int[numberOfFacebookUsers][numberOfFacebookUsers];
		for (int i = 1; i <= numberOfFacebookUsers; i++) {
			friends[0][i] = i;
		}
	}

	/**
	 * creates a friendship connection between two users, represented by their
	 * corresponding integer ids.
	 * 
	 * @param user1
	 *            : int id of first user
	 * @param user2
	 *            : int id of second user
	 */
	public void friends(int user1, int user2) {

		for (int i = 0; friends[i][user1] != 0; i++)
		{
			friends[i][user1] = user2;
		}
	}

	private void sortFriends() {

	}

	/**
	 * @return the number of friend circles in the data already loaded.
	 */
	public int numberOfCircles() {
		// TODO
		return 0;
	}

	/**
	 * @return the size of the largest circle in the data already loaded.
	 */
	public int sizeOfLargestCircle() {
		// TODO
		return 0;
	}

	/**
	 * @return the size of the median circle in the data already loaded.
	 */
	public int sizeOfAverageCircle() {
		// TODO
		return 0;
	}

	/**
	 * @return the size of the smallest circle in the data already loaded.
	 */
	public int sizeOfSmallestCircle() {
		// TODO
		return 0;
	}

}
