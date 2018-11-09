package Hust;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Database myData = new Database();
		System.out.print("1 Quan ly sinh vien  ");
		System.out.print("2 Quan ly giang vien  ");
		System.out.print("3 Quan ly mon hoc  ");
		System.out.print("4 Quan ly lop hoc  ");
		while (true) {
			int request = Input.nextInt();
			switch (request) {
			case 1: {
				myData.studentManager();
				break;
			}
			case 2: {
				myData.teacherManager();
				break;
			}
			case 3: {
				myData.courseManager();
				break;
			}
			case 4: {
				myData.classManager();
				break;
			}
			}
		}
	}
}
