package comparabaledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpList {

	public static void main(String[] args) {
		
		List<Emp> list = new ArrayList<>();
		list.add(new Emp("Kunal", 73831638 , 2));
		list.add(new Emp("Tushar", 59239811, 3));
		list.add(new Emp("Rahul", 53917329, 1));
		list.add(new Emp("Ram", 53817828, 4));
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
