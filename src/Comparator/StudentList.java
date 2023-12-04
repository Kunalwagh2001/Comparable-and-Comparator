package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Kunal", 10 , 15));
		list.add(new Student("Bhavesh" , 7 , 14));
		list.add(new Student("Ganesh", 9 ,  15));
		list.add(new Student("Aakash", 8 , 16));
		
		Collections.sort(list, new Student(null, 0, 0));
        
		System.out.println(list);
		
		Collections.sort(list , new AgeComparator());
		
		System.out.println(list);
		
		Collections.sort(list, new RollnoComparator());
		
		System.out.println(list);
		
	}
}

