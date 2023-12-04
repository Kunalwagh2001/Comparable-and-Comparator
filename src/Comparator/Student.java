package Comparator;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	
	String name;
	int rollno;
	int age;
	
	public Student(String name, int rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
	
}
