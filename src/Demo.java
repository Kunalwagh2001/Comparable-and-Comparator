
public class Demo implements Comparable<Demo>{
	
	String name;
	int rollno;
	int age;
	public Demo(String name, int rollno, int age) {
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
	public int compareTo(Demo other) {
		return this.age-other.age;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}
	
	
	
	
	

}
