package psapi.util;

import java.util.ArrayList;

public class Course {
	public ArrayList<Quarter> quarters;
	public String courseName;
	public String courseTeacher;
	public String room;

	/**
	 * @param quarters
	 * @param courseName
	 * @param courseTeacher
	 * @param room
	 */
	public Course(ArrayList<Quarter> quarters, String courseName, String courseTeacher, String room) {
		this.quarters = quarters;
		this.courseName = courseName;
		this.courseTeacher = courseTeacher;
		this.room = room;
	}

	/**
	 * @return the quarters
	 */
	public ArrayList<Quarter> getQuarters() {
		return quarters;
	}

	/**
	 * @param quarters the quarters to set
	 */
	public void setQuarters(ArrayList<Quarter> quarters) {
		this.quarters = quarters;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * @return the courseTeacher
	 */
	public String getCourseTeacher() {
		return courseTeacher;
	}

	/**
	 * @param courseTeacher the courseTeacher to set
	 */
	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}

	/**
	 * @return the room
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(String room) {
		this.room = room;
	}


}
