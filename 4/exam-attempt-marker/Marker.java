/**
 *
 */
public class Marker {

	private double classification;
	private int totalMark;

	public int markAttempt(Exam examAttempt, Exam markScheme){
	
		// Q1 COMPARISON:
		//	If answer for Q1 in exam attempt is identical to Q1 answer in mark scheme...
		if (examAttempt.getQuestion1().getAnswer() == markScheme.getQuestion1().getAnswer()) {
			/*	Sets 'mark' field for Q1 through 'examAttempt' object to the maximum mark for Q1 (from mark scheme).
			 *	This maximum mark is the value of the 'mark' field for the 'markScheme' object itself.	*/
			examAttempt.getQuestion1().setMark(markScheme.getQuestion1().getMark());
		}
		//	If answer for Q1 in exam attempt is 1 off of the actutal Q1 answer in mark scheme...
		else if ((examAttempt.getQuestion1().getAnswer() == (markScheme.getQuestion1().getAnswer() - 1)) || (examAttempt.getQuestion1().getAnswer() == (markScheme.getQuestion1().getAnswer() + 1))) {
			//	Set the mark for Q1 to exactly 1 less than the maximum mark.
			examAttempt.getQuestion1().setMark((markScheme.getQuestion1().getMark()) - 1);
		}
		else if ((examAttempt.getQuestion1().getAnswer() <= (markScheme.getQuestion1().getAnswer() + 5)) && (examAttempt.getQuestion1().getAnswer() >= (markScheme.getQuestion1().getAnswer() - 5))) {
			examAttempt.getQuestion1().setMark(1);
		}
		else {
			examAttempt.getQuestion1().setMark(0);
		}
		//	Q2 COMPARISON:

		if (examAttempt.getQuestion2().getAnswer() == markScheme.getQuestion2().getAnswer()) {
			examAttempt.getQuestion2().setMark(markScheme.getQuestion2().getMark());
		}
		else {
			examAttempt.getQuestion2().setMark(0);
		}
		//	Q3 COMPARISON:
		if ((examAttempt.getQuestion3().getOption1()) == markScheme.getQuestion3().getOption1()) {
			if ((examAttempt.getQuestion3().getOption2()) == markScheme.getQuestion3().getOption2()) {
				if ((examAttempt.getQuestion3().getOption3()) == markScheme.getQuestion3().getOption3()) {
					//3 marks
					examAttempt.getQuestion3().setMark(markScheme.getQuestion3().getMark());
				}
				else {
					examAttempt.getQuestion3().setMark(2);
				}
			}
			else if ((examAttempt.getQuestion3().getOption3()) == markScheme.getQuestion3().getOption3()) {
				examAttempt.getQuestion3().setMark(2);
			}
			else {
				examAttempt.getQuestion3().setMark(1);
			}
		}
		else if ((examAttempt.getQuestion3().getOption2()) == markScheme.getQuestion3().getOption2()) {
				if ((examAttempt.getQuestion3().getOption3()) == markScheme.getQuestion3().getOption3()) {
					examAttempt.getQuestion3().setMark(2);
				}
				else {
					examAttempt.getQuestion3().setMark(1);
				}
		}
		else if ((examAttempt.getQuestion3().getOption3()) == markScheme.getQuestion3().getOption3()) {
			examAttempt.getQuestion3().setMark(1);
		}
		else {
			examAttempt.getQuestion3().setMark(0);
		}
		
		totalMark = examAttempt.getQuestion1().getMark() + examAttempt.getQuestion2().getMark() + examAttempt.getQuestion3().getMark();
		
		//	Returns total mark awarded to the attempt.
		return totalMark; 
	
	}


	public double convertMarksToClassification(int totalMark, int firstBoundary, int upperSecondBoundary, int lowerSecondBoundary){
		

		if (totalMark >= firstBoundary) {
			classification = 1.1;
		}
		else if (totalMark >= upperSecondBoundary) {
			classification = 2.1;
		}
		else if (totalMark >= lowerSecondBoundary) {
			classification = 2.2;
		}
		else {
			classification = 0.0;
		}
		
		return classification;
		
		
	}


	public int getTotalMark() {
		return totalMark;
	}
	

	public double getClassification() {
		return classification;
	}
}