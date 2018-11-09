package Hust;

public class Course {
	private String courseId;
	private String courseName;
	private int credit;

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Course(String courseId, String courseName, int credit) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.credit = credit;
	}

	public void printCourseList() {
		System.out.format("|%10s|%35s|%11d|\n", this.getCourseId(), this.getCourseName(), this.getCredit());
		System.out.println("-------------------------------------------------------------");
	}

}
