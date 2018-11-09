package Hust;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {

	private static List<Student> studentList = new ArrayList<Student>();
	private static List<Teacher> teacherList = new ArrayList<Teacher>();
	private static List<Course> courseList = new ArrayList<Course>();
	private static List<Class> classList = new ArrayList<Class>();
	public static Scanner Input = new Scanner(System.in);

	public Database() {

		studentList.add(new Student("Nguyen Huu Trang", 20, "20164197", "CNTT", "KSTN"));
		studentList.add(new Student("Nguyen Dinh Tuan Anh", 20, "20164227", "CNTT", "KSTN"));
		studentList.add(new Student("Nguyen Dai Loi", 20, "20164567", "CNTT", "KSTN"));
		studentList.add(new Student("Nguyen Hung Cuong", 20, "20164820", "CNTT", "KSTN"));
		studentList.add(new Student("Nguyen Tuan Hung", 20, "20164520", "CNTT", "KSTN"));
		studentList.add(new Student("Nguyen Huu Phung", 21, "20164167", "CNTT", "KSTN"));
		studentList.add(new Student("Nguyen Dinh Lich", 20, "20165847", "CNTT", "KSTN"));
		studentList.add(new Student("Pham Trong Khai", 22, "20163567", "CNTT", "KSTN"));
		studentList.add(new Student("Dau Trung Dung", 20, "20164823", "CNTT", "KSTN"));
		studentList.add(new Student("Le Minh Quang", 20, "20164811", "CNTT", "KSTN"));
		studentList.add(new Student("Tran Thanh Tung", 20, "20164100", "CNTT", "KSTN"));

		teacherList.add(new Teacher("Nguyen Van An", 40, "T00000", "SE"));
		teacherList.add(new Teacher("Nguyen Van Nam", 45, "T00001", "CS"));
		teacherList.add(new Teacher("Nguyen Van Thinh", 50, "T00002", "CE"));
		teacherList.add(new Teacher("Hoang Van Anh", 43, "T00003", "CS"));
		teacherList.add(new Teacher("Dinh Hoang Phu", 53, "T00004", "CS"));
		teacherList.add(new Teacher("TRan Van Tinh", 44, "T00005", "SE"));

		courseList.add(new Course("IT3000", "Lap Trinh Huong Doi Tuong", 3));
		courseList.add(new Course("IT2020", "Ky Thuat Lap Trinh", 2));
		courseList.add(new Course("IT3030", "Co So Du Lieu", 3));
		courseList.add(new Course("IT2000", "Cau Truc Du Lieu Va Giai Thuat", 3));

		classList.add(new Class("93000", "IT3000", "T00000"));
		classList.add(new Class("93001", "IT3000", "T00001"));
		classList.add(new Class("93002", "IT3030", "T00002"));
		classList.add(new Class("93003", "IT2000", "T00003"));
		classList.add(new Class("93004", "IT2020", "T00004"));
		classList.add(new Class("93005", "IT3030", "T00005"));
		classList.add(new Class("93006", "IT3030", "T00003"));

	}

	public static Student getStudentById(String studentId) {
		for (Student x : studentList) {
			if (x.idNumber.equals(studentId)) {
				return x;
			}
		}
		return null;
	}

	public static Teacher getTeacherById(String teacherId) {
		for (Teacher x : teacherList) {
			if (x.idNumber.equals(teacherId)) {
				return x;
			}
		}
		return null;
	}

	public static Course getCourseById(String courseId) {
		for (Course x : courseList) {
			if (x.getCourseId().equals(courseId)) {
				return x;
			}
		}
		return null;
	}

	public static Class getClassById(String classId) {
		for (Class x : classList) {
			if (x.getClassId().equals(classId)) {
				return x;
			}
		}
		return null;
	}

	public static List<Student> getStudentList() {
		return studentList;
	}

	public static void setStudentList(List<Student> studentList) {
		Database.studentList = studentList;
	}

	public static List<Teacher> getTeacherList() {
		return teacherList;
	}

	public static void setTeacherList(List<Teacher> teacherList) {
		Database.teacherList = teacherList;
	}

	public static List<Course> getCourseList() {
		return courseList;
	}

	public static void setCourseList(List<Course> courseList) {
		Database.courseList = courseList;
	}

	public static List<Class> getClassList() {
		return classList;
	}

	public static void setClassList(List<Class> classList) {
		Database.classList = classList;
	}

	public static void printStudentList() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("|        Id|                               Name|     Age|           Major|      Program|");
		System.out.println("---------------------------------------------------------------------------------------");
		for (Student x : studentList) {
			System.out.format("|%10s|%35s|%8d|%16s|%13s|\n", x.idNumber, x.fullName, x.age, x.getMajor(),
					x.getProgram());
			System.out
					.println("---------------------------------------------------------------------------------------");

		}
	}

	public static void printTeacherList() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("|        Id|                               Name|     Age|                    Department|");
		System.out.println("---------------------------------------------------------------------------------------");
		for (Teacher x : teacherList) {
			System.out.format("|%10s|%35s|%8d|%30s|\n", x.idNumber, x.fullName, x.age, x.getDepartment());
			System.out
					.println("---------------------------------------------------------------------------------------");
		}
	}

	public static void printCourseList() {
		System.out.println("------------------------------------------------------------");
		System.out.println("|  ClassId|  CourseId|                             Course Name|");
		System.out.println("------------------------------------------------------------");
		for (Course x : courseList) {
			x.printCourseList();
		}
	}

	public static void printClassList() {
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("|   ClassId|  CourseId|                             Course Name|               Teacher|");
		System.out.println("---------------------------------------------------------------------------------------");
		for (Class x : classList) {
			for (Course y : courseList) {
				if (x.getCourseId().equals( y.getCourseId())){
					x.setCourse(y);
				}
			}
			for (Teacher y : teacherList) {
				if (x.getTeacherId().equals(y.idNumber)) {
					x.setTeacher(y);
				}
			}
			System.out.format("|%10s|%10s|%40s|%22s|\n", x.getClassId(), x.getCourseId(), x.getCourse().getCourseName(),
					x.getTeacher().getFullName());
			System.out
					.println("---------------------------------------------------------------------------------------");
		}
	}

	public static void addStudent() {
		Scanner Input = new Scanner(System.in);
		System.out.println("nhap vao MSSV  ");
		String id = Input.nextLine();
		System.out.println("nhap vao Ho va ten  ");
		String name = Input.nextLine();
		System.out.println("nhap vao chuyen nganh  ");
		String major = Input.nextLine();
		System.out.println("nhap vao chuong trinh hoc  ");
		String program = Input.nextLine();
		System.out.println("nhap vao tuoi");
		int age = Input.nextInt();
		studentList.add(new Student(name, age, id, major, program));
	}

	public static void addTeacher() {
		Scanner Input = new Scanner(System.in);
		System.out.println("nhap vao ma giang vien  ");
		String id = Input.nextLine();
		System.out.println("nhap vao Ho va ten  ");
		String name = Input.nextLine();
		System.out.println("nhap vao phong ban  ");
		String department = Input.nextLine();
		System.out.println("nhap vao tuoi");
		int age = Input.nextInt();
		teacherList.add(new Teacher(name, age, id, department));
	}

	public static void addCourse() {
		Scanner Input = new Scanner(System.in);
		System.out.println("nhap vao ma mon hoc  ");
		String id = Input.nextLine();
		System.out.println("nhap vao ten mon hoc  ");
		String name = Input.nextLine();
		System.out.println("nhap vao thong tin  ");
		int credit = Input.nextInt();
		courseList.add(new Course(id, name, credit));
	}

	public static void addClass() {
		Scanner Input = new Scanner(System.in);
		System.out.println("nhap vao ma giang vien  ");
		String id = Input.nextLine();
		System.out.println("nhap vao Ho va ten  ");
		String name = Input.nextLine();
		System.out.println("nhap vao phong ban  ");
		String department = Input.nextLine();
		System.out.println("nhap vao tuoi");
		int age = Input.nextInt();
		teacherList.add(new Teacher(name, age, id, department));
	}

	public static void addStudentToClass() {
		Scanner Input = new Scanner(System.in);
		System.out.println("nhap vao ma so sinh vien");
		String studentId = Input.nextLine();
		System.out.println("nhap vao ma so ma lop");
		String classId = Input.nextLine();
		for (Class x : classList) {
			if (x.getClassId().equals(classId)) {
				for (Student y : studentList) {
					if (y.idNumber.equals(studentId)) {
						x.addStudent(y);
					}
				}
			}
		}
	}

	public static void studentInClass() {
		System.out.println("nhap vao ma so ma lop");
		Scanner Input = new Scanner(System.in);
		String classId = Input.nextLine();
		for (Class x : classList) {
			if (x.getClassId().equals(classId)) {
				x.printStudentInClass();
			}
		}
	}

	public static void findClassOfStudent() {
		System.out.println("nhap vao ma so sinh vien");
		Scanner Input = new Scanner(System.in);
		String studentId = Input.nextLine();
		for (Class x : classList) {
			for (Student y : x.getStudents()) {
				if (y.idNumber.equals(studentId)) {
					System.out.println(
							"---------------------------------------------------------------------------------------");
					System.out.println(
							"|   ClassId|  CourseId|                             Course Name|               Teacher|");
					System.out.println(
							"---------------------------------------------------------------------------------------");
					System.out.format("|%10s|%10s|%40s|%22s|\n", x.getClassId(), x.getCourseId(),
							x.getCourse().getCourseName(), x.getTeacher().getFullName());
					System.out.println(
							"---------------------------------------------------------------------------------------");
				}
			}
		}
	}

	public static void deleteStudent() {
		System.out.println("nhap vao ma so sinh vien can xoa");
		Scanner Input = new Scanner(System.in);
		String studentId = Input.nextLine();
		Student temp = getStudentById(studentId);
		studentList.remove(temp);
		for(Class x:classList) {
			x.getStudents().remove(temp);
		}
		System.out.println("da xoa sinh vien");
	}

	public static void deleteTeacher() {
		System.out.println("nhap vao ma so giang vien can xoa");
		Scanner Input = new Scanner(System.in);
		String teacherId = Input.nextLine();
		Student temp = getStudentById(teacherId);
		teacherList.remove(temp);
		System.out.println("da xoa giang vien");
	}

	public static void deleteCourse() {
		System.out.println("nhap vao ma mon hoc can xoa");
		Scanner Input = new Scanner(System.in);
		String courseId = Input.nextLine();
		Course temp = getCourseById(courseId);
		courseList.remove(temp);
		System.out.println("da xoa mon hoc");
	}

	public static void studentManager() {

		System.out.print("1 In danh sach sinh vien   2 Them sinh vien   3 Xoa sinh vien  5 Thoat");
		int request = 0;
		while (request != 5) {
			request = Input.nextInt();
			switch (request) {
			case 1: {
				printStudentList();
				break;
			}
			case 2: {
				addStudent();
				break;
			}
			case 3: {
				deleteStudent();
				break;
			}
			}
		}
		if (request == 5) {
			System.out.print("1 Quan ly sinh vien  ");
			System.out.print("2 Quan ly giang vien  ");
			System.out.print("3 Quan ly mon hoc  ");
			System.out.print("4 Quan ly lop hoc  ");
		}
	}

	public static void teacherManager() {
		System.out.print(
				"1 In danh sach giang vien   2 Them giang vien   3 Xoa giang vien   4 Tra cuu giang vien  5 Thoat");
		int request = 0;
		while (request != 5) {
			request = Input.nextInt();
			switch (request) {
			case 1: {
				printTeacherList();
				break;
			}
			case 2: {
				addTeacher();
				break;
			}
			case 3: {
				deleteTeacher();
				break;
			}
			case 4: {

				break;
			}
			}
		}
		if (request == 5) {
			System.out.print("1 Quan ly sinh vien  ");
			System.out.print("2 Quan ly giang vien  ");
			System.out.print("3 Quan ly mon hoc  ");
			System.out.print("4 Quan ly lop hoc  ");
		}
	}

	public static void courseManager() {
		System.out.print(
				"1 In danh sach mon hoc   2 Them mon hoc   3 Xoa mon hoc   4 In danh sach lop cua mon hoc  5 Thoat");
		int request = 0;
		while (request != 5) {
			request = Input.nextInt();
			switch (request) {
			case 1: {
				printCourseList();
				break;
			}
			case 2: {
				addCourse();
				break;
			}
			case 3: {
				deleteCourse();
				break;
			}
			case 4: {

				break;
			}
			}
		}
		if (request == 5) {
			System.out.print("1 Quan ly sinh vien  ");
			System.out.print("2 Quan ly giang vien  ");
			System.out.print("3 Quan ly mon hoc  ");
			System.out.print("4 Quan ly lop hoc  ");
		}
	}

	public static void classManager() {
		System.out.print(
				"1 In danh sach lop hoc   2 Them lop hoc   3 Xoa lop hoc   4 them sinh vien vao lop hoc  6 In sinh vien 5 Thoat");
		int request = 0;
		while (request != 5) {
			request = Input.nextInt();
			switch (request) {
			case 1: {
				printClassList();
				break;
			}
			case 2: {
				//addCourse();
				break;
			}
			case 3: {
				//deleteCourse();
				break;
			}
			case 4: {
                  addStudentToClass();
				break;
			}
			case 6: {
				studentInClass();
				break;
			}
			}
		}
		if (request == 5) {
			System.out.print("1 Quan ly sinh vien  ");
			System.out.print("2 Quan ly giang vien  ");
			System.out.print("3 Quan ly mon hoc  ");
			System.out.print("4 Quan ly lop hoc  ");
		}
	}
}
