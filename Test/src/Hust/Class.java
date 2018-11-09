package Hust;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private String classId;
	private String courseId;
	private String teacherId;
	private Teacher teacher;
	private Course course;
	private List<Student> students = new ArrayList<Student>();

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Class(String classId, String courseId, String teacherId) {
		super();
		this.classId = classId;
		this.courseId = courseId;
		this.teacherId = teacherId;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void printStudentInClass() {
		if (students != null) {
			System.out
					.println("---------------------------------------------------------------------------------------");
			System.out.println(
					"|        Id|                               Name|     Age|           Major|      Program|");
			System.out
					.println("---------------------------------------------------------------------------------------");
			for (Student x : students) {
				System.out.format("|%10s|%35s|%8d|%16s|%13s|\n", x.idNumber, x.fullName, x.age, x.getMajor(),
						x.getProgram());
				System.out.println(
						"---------------------------------------------------------------------------------------");
			}
		}
	}

	public void printClassList() {

	}

}
