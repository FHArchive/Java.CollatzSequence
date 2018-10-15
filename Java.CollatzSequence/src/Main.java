/**
 * @date 15/10/2018
 * @author Kieran
 *
 */

/*
 * The main method is used to test the CollatzSequence class and functions
 * GenerateSequence and FindLongestSequenceUnder100. The length of a sequence
 * starting with 3 should be 8
 */
public class Main {

	public static void main(String[] args) {
		CollatzSequence MySequence = new CollatzSequence();

		int lengthOfSequence = MySequence.GenerateSequence(3);
		System.out.println("length of sequence: " + lengthOfSequence);

		MySequence.FindLongestSequenceUnder100();
	}

}
