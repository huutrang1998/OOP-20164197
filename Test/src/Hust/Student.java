package Hust;

import java.util.ArrayList;
import java.util.List;

public class Student extends HustPerson{
private String major;
private String program;
	public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}

public String getProgram() {
	return program;
}

public void setProgram(String program) {
	this.program = program;
}
	public Student(String fullName, int age, String idNumber, String major, String program) {
		super(fullName, age, idNumber);
		this.major = major;
		this.program = program;
	}
	public Student(String fullName, int age, String idNumber) {
		super(fullName, age, idNumber);
	}
	

}
