package Hust;

public class Teacher extends HustPerson {
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Teacher(String fullName, int age, String idNumber, String department) {
		super(fullName, age, idNumber);
		this.department = department;
	}

}
