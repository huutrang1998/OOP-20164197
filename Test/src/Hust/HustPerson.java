package Hust;

public class HustPerson {
	protected String firstName = "";
	protected String fullName = "";
	protected String middleName = "";
	protected String lastName = "";
	protected int age;
	protected String idNumber = "";

	public HustPerson(String fullName, int age, String idNumber) {
		super();
		this.setFullName(fullName);
		this.age = age;
		this.idNumber = idNumber;

	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
		// Extract firstName,middleName,lastName from fullName
		String[] name = fullName.split(" ");
		firstName = name[0];
		lastName = name[name.length - 1];
		for (int i = 1; i < name.length - 1; i++) {
			middleName += name[i] + " ";
		}
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
