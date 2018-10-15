/**
 * @date 15/10/2018
 * @author Kieran
 *
 */
public class CollatzSequence {
	/*
	 * Generate a Collatz Sequence from a defined starting term, for example 3 >
	 * 10 > 5 > 16 > 8 > 4 > 2 > 1
	 */
	public int GenerateSequence(int firstTerm) {
		int lengthOfSequence = 0;
		int currentTerm = firstTerm;
		/*
		 * Always run once, terminate the sequence when the current term is not
		 * equal to one
		 */
		do {
			if (currentTerm % 2 == 0) {
				/*
				 * If the current term is even, the next term is half the
				 * current
				 */
				currentTerm /= 2;
			} else {
				/*
				 * Otherwise, the next term is 3 times the current term, plus
				 * one
				 */
				currentTerm = currentTerm * 3 + 1;
			}
			lengthOfSequence++;
		} while (currentTerm != 1);
		/*
		 * Increment the length of the sequence and return it to the calling
		 * program
		 */
		return ++lengthOfSequence;
	}

	/*
	 * Brute force find the length of the longest sequence under 100
	 */
	public void FindLongestSequenceUnder100() {
		int maxSeqLength = 0;
		for (int iteration = 1; iteration <= 100; iteration++) {
			int sequenceLength = GenerateSequence(iteration);
			if (sequenceLength > maxSeqLength) {
				maxSeqLength = sequenceLength;
				System.out.println("The longest sequence so far is: " + iteration);
			}
		}
	}

}
