package psapi.util;

import java.util.ArrayList;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * Class to represent a quarter of a course
 * @author Rishi Rao
 *
 */
public class Quarter {
	private ArrayList<Assignment> assignments;
	private double finalGrade;
	private int quarterNum;
	private HtmlPage quarterPage;
	/**
	 * @return the quarterPage
	 */
	public HtmlPage getQuarterPage() {
		return quarterPage;
	}

	/**
	 * @param quarterPage the quarterPage to set
	 */
	public void setQuarterPage(HtmlPage quarterPage) {
		this.quarterPage = quarterPage;
	}

	/**
	 * Creates a new quarter object
	 * @param ass
	 * @param finalGrade
	 * @param quarterNum
	 */
	public Quarter(ArrayList<Assignment> ass, double finalGrade, int quarterNum, HtmlPage page) {
		assignments = ass;
		this.finalGrade = finalGrade;
		this.quarterNum = quarterNum;
		quarterPage = page;
	}

	/**
	 * Add an assignment to the ArrayList of assignments
	 * @param a
	 */
	public void addAssignment(Assignment a) {
		assignments.add(a);
	}

	/**
	 * @return the ArrayList containing all assignments in the quarter
	 */
	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}

	/**
	 * @param ArrayList to replace the current assignments list
	 */
	public void setAssignments(ArrayList<Assignment> assignments) {
		this.assignments = assignments;
	}

	/**
	 * @return final grade for that quarter
	 */
	public double getFinalGrade() {
		return finalGrade;
	}

	/**
	 * @param finalGrade
	 */
	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}

	/**
	 * @return the quarter number
	 */
	public int getQuarterNum() {
		return quarterNum;
	}

	/**
	 * @param quarterNum
	 */
	public void setQuarterNum(int quarterNum) {
		this.quarterNum = quarterNum;
	}

	/**
	 * @return Textual representation of quarter.
	 */
	@Override
	public String toString() {
		return "Quarter [assignments=" + assignments.toString() + ", finalGrade=" + finalGrade + ", quarterNum=" + quarterNum
				+ "]";
	}

}
