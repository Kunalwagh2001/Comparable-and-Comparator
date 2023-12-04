package comparabaledemo;

public class Emp implements Comparable<Emp> {

	String name;
	int phone;
	int empId;
	
	public Emp(String name , int phone , int empId) {
		this.name = name;
		this.phone = phone;
		this.empId = empId;
		
	}
	public String getName() {
		return name;
	}

	public int getPhone() {
		return phone;
	}

	public int getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}



	@Override
	public int compareTo(Emp o) {
		return this.getName().compareTo(o.getName());
	}
	
	
	

	
	
	
	
	
	
}
