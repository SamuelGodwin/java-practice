/**
 *
 */
public class BooleanQuestion {

	//	Private field of type 'boolean' which stores either an attempted or official answer to this question.
	private boolean answer;
	//	Private field of type 'integer' which stores a mark given based on the answer to this question.
	private int mark;

	public BooleanQuestion(boolean answer, int mark){
		this.answer = answer;
		this.mark = mark;
	}
	

	public void setMark(int mark) {
		this.mark = mark;
	}
	

	public boolean getAnswer() {
		return answer;
	}
	

	public int getMark() {
		return mark;
	}
}