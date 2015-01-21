package com.yogesh.student;

import java.util.HashSet;
import java.util.Set;

/**
 * This class contains student details.
 */
public class Student implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5373628404642122612L;
	private long studentId;
	private String studentName; 
	private Set<Phone> studentPhoneNumbers = new HashSet<Phone>(0);

	public Student() {
	}

	public Student(String studentName) {
		this.studentName = studentName;
	}

	public Student(String studentName, Set<Phone> studentPhoneNumbers) {
		this.studentName = studentName;
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Phone> getStudentPhoneNumbers() {
		return this.studentPhoneNumbers;
	}

	public void setStudentPhoneNumbers(Set<Phone> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}

}
