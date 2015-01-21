package com.yogesh.student;

public class Course implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -543351975551709657L;
	private long courseId;
	private String courseName;

	public Course() {
	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}

