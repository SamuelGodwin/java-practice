/**
 *
 */
 public class Exam {

	private NumericalQuestion question1;
	private BooleanQuestion question2;
	private MultipleChoiceQuestion question3;
	//	Stores a total mark for either an attempted exam or mark scheme.
	private int totalMark;
	
	public Exam(NumericalQuestion question1, BooleanQuestion question2, MultipleChoiceQuestion question3, int totalMark) {
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.totalMark = totalMark;	
	}

	public NumericalQuestion getQuestion1() {
		return question1;
	}
	

	public BooleanQuestion getQuestion2() {
		return question2;
	}
	

	public MultipleChoiceQuestion getQuestion3() {
		return question3;
	}	
}

