import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Demo> list = new ArrayList<>();
		
		list.add(new Demo("Alice", 25 , 22));
		list.add(new Demo("Bob", 30 , 19));
		list.add(new Demo("Charlie", 20 , 20));
		list.add(new Demo("David", 35 , 27));	
	    
		Collections.sort(list);
		
		for(Demo list1 : list) {
			System.out.println(list1);
		}
		
		
		
	
	}
}
