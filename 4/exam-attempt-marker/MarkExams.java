/**
 *
 */
 public class MarkExams {

	public static void main(String[] args){			
			
		//	OBJECTS FOR MARK SCHEME:
		NumericalQuestion nqMarkScheme = new NumericalQuestion(1748, 8);
		BooleanQuestion bqMarkScheme = new BooleanQuestion(true, 1);
		MultipleChoiceQuestion mcqMarkScheme = new MultipleChoiceQuestion(false, true, true, 3);
		/*	Some of the parameters passed are other objects of individual question classes made above, as collectively these make an exam.
		 *	This also demonstrates encapsulation.	*/
		Exam markScheme = new Exam(nqMarkScheme, bqMarkScheme, mcqMarkScheme, 12); 
			
		//	OBJECTS FOR EXAM ATTEMPT:
		NumericalQuestion nqAttempt = new NumericalQuestion(1700, 0);
		BooleanQuestion bqAttempt = new BooleanQuestion(false, 0);
		MultipleChoiceQuestion mcqAttempt = new MultipleChoiceQuestion(false, true, true, 0);
		Exam examAttempt = new Exam(nqAttempt, bqAttempt, mcqAttempt, 0);
	
		Marker markExamAttempt = new Marker();
		markExamAttempt.markAttempt(examAttempt, markScheme);
			
		System.out.println("Question 1: " + examAttempt.getQuestion1().getMark() + " out of " + markScheme.getQuestion1().getMark());
		System.out.println("Question 2: " + examAttempt.getQuestion2().getMark() + " out of " + markScheme.getQuestion2().getMark());
		System.out.println("Question 3: " + examAttempt.getQuestion3().getMark() + " out of " + markScheme.getQuestion3().getMark());
			
		System.out.println("Total: " + markExamAttempt.getTotalMark());
			
		markExamAttempt.convertMarksToClassification(markExamAttempt.getTotalMark(), 11, 9, 8);
		System.out.println("Classificatiton: " + markExamAttempt.getClassification());
	
	}
}