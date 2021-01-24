/**
 *
 */
public class NumericalQuestion {

	private int answer;
	private int mark;


	public NumericalQuestion(int answer, int mark) {
		this.answer = answer;
		this.mark = mark;
	}
	

	public void setMark(int mark) {
		this.mark = mark;
	}
	

	public int getAnswer() {
		return answer;
	}
	

	public int getMark() {
		return mark;
	}
}